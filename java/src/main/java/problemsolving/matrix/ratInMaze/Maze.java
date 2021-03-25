package ProblemSolving.matrix.ratInMaze;

import ProblemSolving.matrix.Position;

public class Maze {

    private int[][] maze;
    private int[][] shortestPath;

    public Maze(int[][] maze){
        this.maze = maze;
        this.shortestPath = new int[maze.length][maze.length];
    }

    public int[][] solveMaze(Position startingPosition) {
        int size = maze.length;
        solveMaze(maze, startingPosition, new Position(size -1, size -1));
        return shortestPath;
    }

    private boolean solveMaze(int[][] maze, Position currentPosition, Position destinationPosition){
        // if position is destination
        if(currentPosition.equals(destinationPosition)){
            markPositionInPath(currentPosition);
            return true;
        }

        if(isValidPosition(currentPosition)) {
            markPositionInPath(currentPosition);

            if(solveMaze(maze, currentPosition.moveRight(), destinationPosition))
                return true;

            if(solveMaze(maze, currentPosition.moveDown(), destinationPosition))
                return true;

            unmarkPositionInPath(currentPosition);
        }

        return false;
    }

    private boolean isValidPosition(Position position){
        return position.row >= 0 && position.row < maze.length
                && position.col >=0 && position.col < maze.length
                && maze[position.row][position.col] == 1;
    }

    private void markPositionInPath(Position position){
        shortestPath[position.row][position.col] = 1;
    }

    private void unmarkPositionInPath(Position position){
        shortestPath[position.row][position.col] = 0;
    }
}


/** complexity

total cells n ^ 2

 time complexity = O(n*n)
    recursion can run upto the max
 space complexity O(n*n)

 **/