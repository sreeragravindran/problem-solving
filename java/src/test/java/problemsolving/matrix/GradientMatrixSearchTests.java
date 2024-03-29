package problemsolving.matrix;

import problemsolving.matrix.GradientMatrix.GradientMatrixSearch;
import org.junit.Assert;
import org.junit.Test;

public class GradientMatrixSearchTests {

    @Test
    public void should_return_correct_position() {

        int[][] matrix = new int[][]{
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {9, 13, 15, 17},
                {10, 14, 16, 18}
        };

        GradientMatrixSearch gradientMatrix = new GradientMatrixSearch(matrix);

        Position position = gradientMatrix.search(4);
        Assert.assertEquals(new Position(1,1), position);
        Assert.assertTrue(position.movesTaken == 3);


        position = gradientMatrix.search(7);
        Assert.assertEquals(new Position(0,3), position);
        Assert.assertTrue(position.movesTaken == 6);

        position = gradientMatrix.search(100);
        Assert.assertEquals(null, position);
    }
}
