package ProblemSolving.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SumOfAnyThreeNumbersTest {

    @Test
    public void should_return_true(){
        List<Integer> list = Arrays.asList(10, 15, 3, 7, 5, 10, 8, 9, 1);

        SumOfAnyThreeNumbers sumOfAnyThreeNumbers =new SumOfAnyThreeNumbers(list);
        Assert.assertTrue(sumOfAnyThreeNumbers.equalsSum(9));
    }

    @Test
    public void should_return_false_with_valid_input(){
        List<Integer> list = Arrays.asList(10, 15, 3, 7, 5, 10, 8, 9, 1);

        SumOfAnyThreeNumbers sumOfAnyThreeNumbers =new SumOfAnyThreeNumbers(list);
        Assert.assertFalse(sumOfAnyThreeNumbers.equalsSum(1));
    }

    @Test
    public void should_return_false_with_invalid_input(){
        List<Integer> list = Arrays.asList(10, 15);

        SumOfAnyThreeNumbers sumOfAnyThreeNumbers =new SumOfAnyThreeNumbers(list);
        Assert.assertFalse(sumOfAnyThreeNumbers.equalsSum(1));
    }
}
