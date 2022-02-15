package problemsolving;


import org.junit.Assert;
import org.junit.Test;

public class Solution2Test {

    @Test
    public void test(){
        Solution5 solution2 = new Solution5();
        int result =  solution2.solution(new int[] {1,2,3,5,6,7,8,9});
        Assert.assertEquals(5, result);

         result =  solution2.solution(new int[] {1,2,3,10, 11, 15});
        Assert.assertEquals(3, result);

        result =  solution2.solution(new int[] {5,4,2,1});
        Assert.assertEquals(2, result);

        result =  solution2.solution(new int[] {5 , -3, -2, -1, 0, 1, 5, 6, 7});
        Assert.assertEquals(5, result);

    }
}