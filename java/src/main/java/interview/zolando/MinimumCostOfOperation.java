package interview.zolando;

import java.util.PriorityQueue;

public class MinimumCostOfOperation {

    public int solution(int[] A) {
        // write your code in Java SE 8
        PriorityQueue<Integer> minCostHeap = new PriorityQueue<>((a, b) -> A[a] - A[b]);

        for (int i = 1; i < A.length - 1; i++) {
            minCostHeap.add(i);
        }

        // handling the edge case - when size is 5, and lowest link is in the middle
        if(A.length == 5 &&  minCostHeap.peek() == 2) {
            return A[1] + A[3];
        }

        Integer leastCostingLink = minCostHeap.poll();
        // find the next non-adjacent least link
        while (Math.abs(leastCostingLink - minCostHeap.peek()) == 1) {
            minCostHeap.poll();
        }

        return A[leastCostingLink] + A[minCostHeap.poll()];
    }
}
