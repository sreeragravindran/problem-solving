package interview.zolando;

import interview.zolando.MinimumCostOfOperation;
import org.junit.Assert;
import org.junit.Test;

public class MinCostOfOperationTest {

    @Test
    public void Test() {
        int[] A = new int[]{0, 2, 4, 3, 5, 6};
        MinimumCostOfOperation minimumCostOfOperation = new MinimumCostOfOperation();
        int result = minimumCostOfOperation.solution(A);
        Assert.assertEquals(5, result);

        A = new int[]{0, 2, 4, 3, 6, 7, 1, 3, 2, 5, 1};
        result = minimumCostOfOperation.solution(A);
        Assert.assertEquals(3, result);

        A = new int[]{0, 3, 4, 3, 6, 0, 1, 3, 2, 5, 1};
        result = minimumCostOfOperation.solution(A);
        Assert.assertEquals(2, result);

        A = new int[]{0, 2, 1, 2, 1}; // edge case, when there are only 3 elements between 0 & n - 1, and lowest link is in the centre
        result = minimumCostOfOperation.solution(A);
        Assert.assertEquals(4, result);

        A = new int[]{0, 1, 1, 2, 1};
        result = minimumCostOfOperation.solution(A);
        Assert.assertEquals(3, result);

    }
}
