package problemsolving.Strings;

/*

String Compression:
Implement a method to perform basic string compression using the counts of repeated characters.
For example, the string aabcccccaaa would become a2b1c5a3. If the "compressed" string would not become smaller than the original string,
your method should return the original string.

You can assume the string has only uppercase and lowercase letters (a - z).

*/

public class StringCompressor {

    private int index;
    private int counterIndex;
    private char[] inputArray;

    public String compress(String input){

        inputArray = input.toCharArray();
        StringBuilder output = new StringBuilder();

        for(index=0, counterIndex=index+1; index < inputArray.length;){
            if(indexWithinBounds() && inputArray[index] == inputArray[counterIndex]) {
                incrementCounterIndex();
            }
            else {
                output.append(inputArray[index]).append(counterIndex - index);
                incrementIndiciesToNextCharacter();
            }
        }

        return output.length() < input.length() ? output.toString() : input;
    }

    private void incrementCounterIndex(){
        counterIndex++;
    }

    private void incrementIndiciesToNextCharacter(){
        index = counterIndex;
        counterIndex = index + 1;
    }

    private boolean indexWithinBounds(){
        return index < inputArray.length && counterIndex < inputArray.length;
    }

}
