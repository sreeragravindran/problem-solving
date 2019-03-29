package ProblemSolving.arrays;

import org.junit.Assert;
import org.junit.Test;

public class LowestMissingPositiveIntegerTest {

    @Test
    public void should_return_2(){
        int[] inputArray = {3, 4, -1, 1};

        LowestMissingPositiveInteger lowestMissingPositiveInteger = new LowestMissingPositiveInteger(inputArray);
        Assert.assertEquals(2, lowestMissingPositiveInteger.getLowestMissingPositiveInteger());

    }

    @Test
    public void should_return_5(){
        int[] inputArray = {1, 2, 3, 4};

        LowestMissingPositiveInteger lowestMissingPositiveInteger = new LowestMissingPositiveInteger(inputArray);
        Assert.assertEquals(5, lowestMissingPositiveInteger.getLowestMissingPositiveInteger());
    }

    @Test
    public void should_return_3(){
        int[] inputArray = {1, 2, 0};

        LowestMissingPositiveInteger lowestMissingPositiveInteger = new LowestMissingPositiveInteger(inputArray);
        Assert.assertEquals(3, lowestMissingPositiveInteger.getLowestMissingPositiveInteger());
    }

    @Test
    public void should_return_1(){
        int[] inputArray = {500, 501, 502};

        LowestMissingPositiveInteger lowestMissingPositiveInteger = new LowestMissingPositiveInteger(inputArray);
        Assert.assertEquals(1, lowestMissingPositiveInteger.getLowestMissingPositiveInteger());
    }

    @Test
    public void should_return_1_for_input_0_500_500(){
        int[] inputArray = {0, 500, 500};

        LowestMissingPositiveInteger lowestMissingPositiveInteger = new LowestMissingPositiveInteger(inputArray);
        Assert.assertEquals(1, lowestMissingPositiveInteger.getLowestMissingPositiveInteger());
    }

}
