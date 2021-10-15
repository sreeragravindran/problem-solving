package problemsolving.strings.WordWrap;

public class Line {
    private int maxLength;

    private StringBuilder line;

    private int lastNonWordCharacterPosition;

    public Line(int maxLength){
        this.maxLength = maxLength;
        this.line = new StringBuilder();
        this.lastNonWordCharacterPosition = 0;
    }

    public void addCharacter(char c) throws LineOverFlowException {
        if(line .toString().length() >= maxLength) {
            throw new LineOverFlowException();
        }
        line.append(c);
        if(c == ' ' || c =='\t'){
            setLastNonWordCharacterPosition();
        }
    }

    public boolean hasOnlyOneWord(){
        return lastNonWordCharacterPosition <= 1;
    }

    public Line splitFromLastWord(){
        Line newLine = new Line(this.maxLength);
        newLine.line.append(line.toString().substring(lastNonWordCharacterPosition, line.length()));

        StringBuilder temp = new StringBuilder();
        temp.append(line.substring(0, lastNonWordCharacterPosition));
        line = temp;

        return newLine;
    }

    @Override
    public String toString() {
        return line.toString();
    }

    private void setLastNonWordCharacterPosition(){
        lastNonWordCharacterPosition = line.length();
    }


}

