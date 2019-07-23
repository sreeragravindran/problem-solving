package ProblemSolving.strings.WordWrap;


import com.intellij.vcs.log.ui.frame.WrappedFlowLayout;
import com.twelvemonkeys.lang.StringUtil;
import org.apache.commons.lang3.StringUtils;

//this is a simple text,
public class TextWrapper {

    public WrappedText Wrap(String unwrappedText, int maxLineLength) throws Exception {

        WrappedText wrappedText = new WrappedText();
        Line line = new Line(maxLineLength);

        for(int i = 0; i < unwrappedText.length(); i++){
            char c = unwrappedText.charAt(i);
            try {
                line.addCharacter(c);
            } catch(LineOverFlowException ex) {
                try {
                    if (canBreakLineWithCharacter(c) || line.hasOnlyOneWord()) {

                        wrappedText.addLine(line);
                        line = new Line(maxLineLength);
                        line.addCharacter(c);

                    } else {
                        // split the line from
                        Line newLine = line.splitFromLastWord();
                        wrappedText.addLine(line);
                        line = newLine;
                        line.addCharacter(c);
                    }
                } catch (LineOverFlowException e) {
                    throw e;
                }
            }
        }
        if(!StringUtils.isBlank(line.toString())) {
            wrappedText .addLine(line);
        }

        return wrappedText;
    }

    //private WrappedText WrapText

    private boolean canBreakLineWithCharacter(char c){
        if(c == ' ' || c == '\t') {
            return true;
        }
        return false;
    }
}
