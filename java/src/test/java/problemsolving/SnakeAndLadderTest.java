package problemsolving;

import org.junit.Assert;
import org.junit.Test;

public class SnakeAndLadderTest {

    @Test
    public void should_return_3_moves_100() {
        int[][] ladders = new int[][]{
                {32,62},
                {42,68},
                {12,98}
        };

        int[][] snakes = new int[][]{
                {95,13},
                {97, 25},
                {93, 37},
                {79, 27},
                {75, 19},
                {49, 47},
                {67, 17}
        };

        int moves = SnakeAndLadder.quickestWayUp(ladders, snakes);
        Assert.assertEquals(3, moves);
    }
}
