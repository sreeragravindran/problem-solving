package problemsolving.matrix;

import problemsolving.matrix.TilesAndWalls.GameBoard;
import org.junit.Assert;
import org.junit.Test;

public class TilesAndWallsTests {

    @Test
    public void should_return_minimum_steps(){
        boolean [][] board = new boolean[][] {
                {false, false , false, false},
                {true, true, false, true},
                {false, false, false, false},
                {false, false, false, false}
        };

        GameBoard gameBoard = new GameBoard(board);

        Assert.assertTrue(gameBoard.getMinimumSteps(new Position(3,0), new Position(0,0)) == 7);
        Assert.assertTrue(gameBoard.getMinimumSteps(new Position(0,0), new Position(3,0)) == 7);

    }

}
