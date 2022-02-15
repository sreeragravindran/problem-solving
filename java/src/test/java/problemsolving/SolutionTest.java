package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest  {

    @Test
    public void test() {
        Solution solution = new Solution();
        Assert.assertTrue(solution.solution("A2Le", "2pL1"));
        Assert.assertTrue(solution.solution("a10", "10a"));
        Assert.assertFalse(solution.solution("ba1", "1Ad"));
    }
}