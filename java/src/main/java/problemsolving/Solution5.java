package problemsolving;

public class Solution5 {

    public int solution(int[] A) {
        // write your code in Java SE 8

        // if there are negative numbers, make it all positive
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            min = Math.min(min, A[i]);
        }

        if(min < 0) {
            // convert all to positive values
            for (int i = 0; i < A.length; i++) {
               A[i] = A[i] + Math.abs(min);
            }
        }

        int longestConsecutiveRun = Integer.MIN_VALUE ;
        for (int i = 0; i < A.length - 1; i++) {
            int runningCount = 1;
            while(i < A.length - 1 && Math.abs(A[i] - A[i+1]) == 1) {
                runningCount++;
                i++;
            }
            longestConsecutiveRun = Math.max(longestConsecutiveRun, runningCount);
        }

        return longestConsecutiveRun;
    }
}
