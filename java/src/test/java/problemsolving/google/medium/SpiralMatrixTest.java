package problemsolving.google.medium;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class SpiralMatrixTest {

    @Test
    public void testGetSpiralOrder() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> spiralOrder = SpiralMatrix.getSpiralOrder(matrix);
        List<Integer> expectedOrder = Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5);
        for(int i = 0 ; i < expectedOrder.size(); i++) {
            Assert.assertEquals(expectedOrder.get(i), spiralOrder.get(i));
        }

        matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        spiralOrder = SpiralMatrix.getSpiralOrder(matrix);
        expectedOrder = Arrays.asList(1, 2, 3, 6, 9, 12, 11, 10, 7, 4, 5, 8);
        for(int i = 0 ; i < expectedOrder.size(); i++) {
            Assert.assertEquals(expectedOrder.get(i), spiralOrder.get(i));
        }
    }
}