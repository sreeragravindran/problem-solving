package problemsolving.tree.bst;


import org.junit.Assert;
import org.junit.Test;

public class CountOfSmallerElementsToTheRightTest {

    @Test
    public void shouldWorkAsExpected() {
        int[] input = {10, 5, 3, 4, 9, 6, 1};
        CountOfSmallerElementsToTheRight solution = new CountOfSmallerElementsToTheRight();
        int[] actualOutput = solution.findCount(input);
        int[] expectedOutput = {6, 3, 1, 1, 2, 1, 0};
        Assert.assertArrayEquals(expectedOutput, actualOutput);

        solution = new CountOfSmallerElementsToTheRight();
        input = new int[]{10, 6, 15, 20, 30, 5, 7};
        actualOutput = solution.findCount(input);
        expectedOutput = new int[]{3, 1, 2, 2, 2, 0, 0};
        Assert.assertArrayEquals(expectedOutput, actualOutput);
    }

}