package ProblemSolving.recursion.coinChangeProblem;

import org.junit.Assert;
import org.junit.Test;

public class RecurvsiveSolutionTest {

    @Test
    public void shouldReturn_3(){
        int[] denoms = new int[]{4, 17, 29};
        RecursiveSolution solution = new RecursiveSolution();
        int result  = solution.minimumCoins(denoms, 75);
        Assert.assertEquals(3, result);
    }

    @Test
    public void shouldReturn_MinusOne(){
        int[] denoms = new int[]{5, 10, 25, 100, 200};
        RecursiveSolution solution = new RecursiveSolution();
        int result  = solution.minimumCoins(denoms, 94);
        Assert.assertEquals(-1, result);
    }

    @Test
    public void shouldReturn_1(){
        int[] denoms = new int[]{5, 10, 25, 100, 200};
        RecursiveSolution solution = new RecursiveSolution();
        int result  = solution.minimumCoins(denoms, 150);
        Assert.assertEquals(3, result);
    }
}
