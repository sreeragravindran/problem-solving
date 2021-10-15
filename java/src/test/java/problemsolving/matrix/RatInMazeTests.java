package problemsolving.matrix;

import problemsolving.matrix.ratInMaze.Maze;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class RatInMazeTests {

    @Test
    public void shouldFindPath(){
        int[][] inputMaze = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 0, 1},
                {0, 1, 0, 0},
                {1, 1, 1, 1}
        };

        int[][] expectedPath = new int[][]{
                {1, 0, 0, 0},
                {1, 1, 0, 0},
                {0, 1, 0, 0},
                {0, 1, 1, 1}
        };

        Maze maze = new Maze(inputMaze);
        int[][] actualPath = maze.solveMaze(new Position(0,0));
        Assert.assertTrue(Arrays.deepEquals(expectedPath, actualPath));

        // case 2

        inputMaze = new int[][]{
                {1, 1, 1, 0},
                {1, 0, 1, 1},
                {1, 1, 0, 1},
                {0, 0, 0, 1}
        };

        expectedPath = new int[][]{
                {1, 1, 1, 0},
                {0, 0, 1, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 1}
        };

        maze = new Maze(inputMaze);
        actualPath = maze.solveMaze(new Position(0,0));
        Assert.assertTrue(Arrays.deepEquals(expectedPath, actualPath));

    }
}
