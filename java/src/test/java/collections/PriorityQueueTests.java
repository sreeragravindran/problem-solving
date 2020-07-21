package collections;

import org.junit.Assert;
import org.junit.Test;

import java.util.PriorityQueue;

public class PriorityQueueTests {
    @Test
    public void test(){
        PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
        minHeap.add(10);
        minHeap.add(20);
        minHeap.add(1);

        Assert.assertTrue( minHeap.peek().equals(1));
        Assert.assertTrue(minHeap.contains(20));
    }
}
