package problemsolving.interview;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostOfDeletionsTest {

    @Test
    public void Test() {
        MinimumCostOfDeletions minimumCostOfDeletions = new MinimumCostOfDeletions();
        String S = "abccbd";
        int result = 0;
        int[] costs = new int[] {0,1,2,3,4,5,};

        result = minimumCostOfDeletions.solution(S, costs);
        Assert.assertEquals(2, result);

        S = "aabbcc";
        costs = new int[] {1,2,1,2,1,2};
        result = minimumCostOfDeletions.solution(S, costs);
        Assert.assertEquals(3, result);

        S = "aaaa";
        costs = new int[] {3,4,5,6};
        result = minimumCostOfDeletions.solution(S, costs);
        Assert.assertEquals(12, result);

        S = "ababa";
        costs = new int[] {10, 5, 10, 5, 10};
        result = minimumCostOfDeletions.solution(S, costs);
        Assert.assertEquals(0, result);
    }
 }
