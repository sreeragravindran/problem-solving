package problemsolving.arrays.countOfSubArrays;

import org.junit.Assert;
import org.junit.Test;

public class EfficientSolutionTest {

    @Test
    public void shouldReturn3(){
        int[] arr = new int[]{1,2,3};
        int result = EfficientSolution.findCountOfConsecutiveSubArrays(arr);
        int expected = 3;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturn6(){
        int[] arr = new int[]{1,2,3,5,6,7};
        int result = EfficientSolution.findCountOfConsecutiveSubArrays(arr);
        int expected = 6;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturn10(){
        int[] arr = new int[]{1,2,3,4,5};
        int result = EfficientSolution.findCountOfConsecutiveSubArrays(arr);
        int expected = 10;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturn0(){
        int[] arr = new int[]{1,3,5,7,9};
        int result = EfficientSolution.findCountOfConsecutiveSubArrays(arr);
        int expected = 0;

        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturn2(){
        int[] arr = new int[]{1,2,4,8,9};
        int result = EfficientSolution.findCountOfConsecutiveSubArrays(arr);
        int expected = 2;

        Assert.assertEquals(expected, result);
    }
}
