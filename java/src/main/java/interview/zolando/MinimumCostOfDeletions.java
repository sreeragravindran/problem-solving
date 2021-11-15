package interview.zolando;

import java.util.PriorityQueue;

public class MinimumCostOfDeletions {
    public int solution(String S, int[] C) {
        // write your code in Java SE 8
        if(S == null || S.length() == 0) {
            return 0;
        }

        if(S.length() != C.length)  {
            throw new RuntimeException("invalid input");
        }
        // sliding window of consecutive occurences
        int totalCost = 0;
        PriorityQueue<Integer> costMinHeap = new PriorityQueue<>();
        int start = 0;
        int end = 0;
        char[] arr = S.toCharArray();
        for (int i = 0; i < arr.length - 1; i++) {
            start = i;
            while (i < arr.length-1 && arr[i] == arr[i + 1]) {
                end = i + 1;
                i++;
            }
            if (end - start > 0) { // 3-2
                // find cost of dedup
                for(int j = start; j <= end; j++) {
                    costMinHeap.add(C[j]);
                }
                // dedup
                while(costMinHeap.size() > 1) {
                    totalCost = totalCost + costMinHeap.poll();
                }
                // clear the heap
                costMinHeap.clear();
            }
        }
        return totalCost;
    }
}
