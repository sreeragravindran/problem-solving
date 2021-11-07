package problemsolving.heap;

import org.junit.Assert;
import org.junit.Test;
import problemsolving.heap.slidingWindowMedian.SlidingWindowMedian;

public class SlidingWindowMedianTest {

    @Test
    public void ShouldReturnCorrectSlidingWindowMedians() {
        int[] nums = {1,2,3,4,5,6,7,8,9};
        int windowSize = 3;

        SlidingWindowMedian slidingWindowMedian = new SlidingWindowMedian();
        double[] slidingWindowMedians = slidingWindowMedian.findSlidingWindowMedian(nums, windowSize);
        double[] expectedSlidingWindowMedians = new double[] {2,3,4,5,6,7,8};
        Assert.assertArrayEquals(expectedSlidingWindowMedians, slidingWindowMedians, 0);
    }
}
