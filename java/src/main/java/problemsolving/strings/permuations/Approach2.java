package problemsolving.strings.permuations;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Approach2 {

    public static Set<String> findPermutations(String input) {

        // start
        LocalDateTime startTime = LocalDateTime.now();

        if (Objects.isNull(input) || input.length() == 0) {
            return null;
        }

        Queue<String> queue = new LinkedList<>();
        Set<String> permutations = new HashSet<>();

        permutations.add(input);
        queue.add(input);

        while (!queue.isEmpty()) {
            String current = queue.poll();
            for (String permutation : generatePermutations(current)
            ) {
                if (!permutations.contains(permutation)) {
                    queue.add(permutation);
                    permutations.add(permutation);
                }
            }
        }
        LocalDateTime endTime = LocalDateTime.now();
        System.out.println("Approach 2 - Elapsed time(ms) : " + ChronoUnit.MILLIS.between(startTime, endTime));

        return permutations;
    }

    private static List<String> generatePermutations(String str) {
        char[] charArray = str.toCharArray();
        List<String> output = new ArrayList<>();

        for(int i =0; i < str.length() -1; i++) {
            swap(charArray, i, i+1);
            output.add(String.valueOf(charArray));
        }
        return output;
    }

    private static void swap(char[] charArray, int i, int j) {
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
    }

}
