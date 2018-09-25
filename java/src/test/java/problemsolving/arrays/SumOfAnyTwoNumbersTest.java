package problemsolving.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class SumOfAnyTwoNumbersTest {

    @Test
    public void should_return_true_with_positive_values(){

        List<Integer> list = Arrays.asList( 10, 15, 3, 7);
        SumOfAnyTwoNumbers sumOfAnyTwoNumbers = new SumOfAnyTwoNumbers(list);

        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(17));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(18));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(25));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(13));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(10));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(22));
    }

    @Test
    public void should_return_true_with_negative_values(){

        List<Integer> list = Arrays.asList( 10, 15, -3, -7);
        SumOfAnyTwoNumbers sumOfAnyTwoNumbers = new SumOfAnyTwoNumbers(list);

        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(-10));
        Assert.assertTrue(sumOfAnyTwoNumbers.equalsSum(3));
    }

    @Test
    public void should_return_false(){

        List<Integer> list = Arrays.asList( 10, 15, 3, 7);

        SumOfAnyTwoNumbers sumOfAnyTwoNumbers = new SumOfAnyTwoNumbers(list);
        Assert.assertFalse(sumOfAnyTwoNumbers.equalsSum(21));
        Assert.assertFalse(sumOfAnyTwoNumbers.equalsSum(11));
        Assert.assertFalse(sumOfAnyTwoNumbers.equalsSum(1));

    }
}
