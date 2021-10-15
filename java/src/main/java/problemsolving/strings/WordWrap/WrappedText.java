package problemsolving.strings.WordWrap;

import java.util.ArrayList;
import java.util.List;

public class WrappedText {

    private List<Line> lines;

    public WrappedText(){
        this.lines = new ArrayList<>();
    }

    public void addLine(Line line){
        this.lines.add(line);
    }

    @Override
    public String toString() {
        StringBuilder wrappedText = new StringBuilder();

        for(Line line : lines){
            wrappedText.append(line.toString()).append('\n');
        }

        return wrappedText.toString();
    }
}
