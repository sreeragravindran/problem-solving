package ProblemSolving.strings.permuations;

import java.util.*;

public class Approach1 {

    // todo: instead of returning in-memory list, use reactive pattern to stream data when available
    public List<String> getPermutations(String input){
        List<String> output = new ArrayList<>();
        char[] cArray = input.toCharArray();
        Queue<String> q = new LinkedList();
        q.add(String.valueOf(cArray[cArray.length - 1]));

        while(!q.isEmpty()){
            String curr = q.poll();
            List<String> perms = generatePermutationsForChar(cArray[cArray.length - curr.length() - 1] ,curr);
            if(perms.get(0).length() == input.length()){
                output.addAll(perms);
            } else{
                q.addAll(perms);
            }
        }

        return output;
     }

    public List<String> generatePermutationsForChar(char c, String input) {

        List<String> output = new ArrayList<>();
        input = c + input;
        output.add(input);

        char[] charArray = input.toCharArray();

        for(int i=0; i < charArray.length -1; i++){
            swap(charArray, i, i+1);
            output.add(String.valueOf(charArray));
        }

        return output;
    }

    private void swap(char[] array, int i, int i1) {
        char c = array[i+1];
        array[i+1] = array[i];
        array[i] = c;
    }
}
