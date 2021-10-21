package problemsolving.strings.permuations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;
/*
find permutations of characters starting from left to right, add one character at a time

abcd
""
 */
public class Approach3 {

    public static List<String> getPermutations(String input) {

        var startTime = LocalDateTime.now();

        if(input.length() <= 1) {
            return Arrays.asList(input);
        }

        List<String> permutations = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(String.valueOf(input.indexOf(0)));
        while(!queue.isEmpty()) {
            var perm = queue.poll();
            List<String> perms = findPermutations(perm, input.charAt(perm.length()));
            if(perms.get(0).length() == input.length()) {
                permutations.addAll(perms);
            } else {
                queue.addAll(perms);
            }
        }
        var endTime = LocalDateTime.now();
        System.out.println("Approach 3 - Elapsed time(ms) : " + ChronoUnit.MILLIS.between(startTime, endTime));
        return permutations;
    }

    public static List<String> findPermutations(String input, char c) {
        char[] charArray = (input + c).toCharArray();
        List<String> permutations = new ArrayList<>();
        permutations.add(String.valueOf(charArray));
        for(int i =0; i < charArray.length -1; i++) {
            // swap i, i+1
            var temp = charArray[i];
            charArray[i] = charArray[i+1];
            charArray[i+1] = temp;
            permutations.add(String.valueOf(charArray));
        }

        return permutations;
    }
}
