package problemsolving.arrays;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ProductOfAllOtherNumbersTest {

    @Test
    public void input_array_1_2_3_4_5_should_return_120_60_40_30_24(){
        int[] inputArray = {1, 2, 3, 4, 5};
        int[] expectedOutput = {120, 60, 40, 30, 24};

        ProductOfAllOtherNumbes productOfAllOtherNumbes = new ProductOfAllOtherNumbes(inputArray);
        int[] actualOutput = productOfAllOtherNumbes.getProductOfAllOtherNumbers();
        Assert.assertTrue(Arrays.equals(expectedOutput, actualOutput));
    }

    @Test
    public void input_array_1_2_should_return_2_1(){
        int[] inputArray = {1, 2};
        int[] expectedOutput = {2, 1};

        ProductOfAllOtherNumbes productOfAllOtherNumbes = new ProductOfAllOtherNumbes(inputArray);
        int[] actualOutput = productOfAllOtherNumbes.getProductOfAllOtherNumbers();
        Assert.assertTrue(Arrays.equals(expectedOutput, actualOutput));
    }

    @Test
    public void input_array_1_2_3_4_0_should_return_0_0_0_0_24(){
        int[] inputArray = {1, 2, 3, 4, 0};
        int[] expectedOutput = {0, 0, 0, 0, 24};

        ProductOfAllOtherNumbes productOfAllOtherNumbes = new ProductOfAllOtherNumbes(inputArray);
        int[] actualOutput = productOfAllOtherNumbes.getProductOfAllOtherNumbers();
        Assert.assertTrue(Arrays.equals(expectedOutput, actualOutput));
    }
}
