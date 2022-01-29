package problemsolving.matrix.minCostToTheEnd;

import org.junit.Assert;
import org.junit.Test;

public class MinimumCostToTheEndTest {

    @Test
    public void shouldReturnMinimumCost() {
        int[][] matrix = new int[][]{
                {1, 3, 1},
                {1, 5, 1},
                {1, 4, 1}
        };
        Assert.assertEquals(7, MinimumCostToTheEnd.findMinimumCost(matrix));
    }

}