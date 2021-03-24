package ProblemSolving.matrix.ratInMaze;

import ProblemSolving.matrix.Position;

public class Maze {

    public int[][] solveMaze(int[][] maze, Position startingPosition) {
        int size = maze.length;
        int[][] outputPath = new int[size][size];
        solveMaze(maze, startingPosition, new Position(size -1, size -1), outputPath);
        return outputPath;
    }

    public boolean solveMaze(int[][] maze, Position currentPosition, Position destinationPosition, int[][] outputPath){
        // if position is destination
        if(currentPosition == destinationPosition){
            return true;
        }


    }

    public isValidPosition(Position position){
        return position.row >= 0 && position.row <
    }
}
