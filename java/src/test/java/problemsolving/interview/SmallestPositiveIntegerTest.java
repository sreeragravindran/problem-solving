package problemsolving.interview;

import org.junit.Assert;
import org.junit.Test;

public class SmallestPositiveIntegerTest {

    @Test
    public void test() {
        SmallestPositiveInteger smallestPositiveInteger = new SmallestPositiveInteger();
        int[] A =  new int[] {1, 3, 6, 4, 1, 2};
        int result = smallestPositiveInteger.solution(A);
        Assert.assertEquals(5, result);

        A =  new int[] {1, 2, 3};
        result = smallestPositiveInteger.solution(A);
        Assert.assertEquals(4, result);

        A =  new int[] {-1, -3};
        result = smallestPositiveInteger.solution(A);
        Assert.assertEquals(1, result);

        A =  new int[] {};
        result = smallestPositiveInteger.solution(A);
        Assert.assertEquals(1, result);

    }
}
