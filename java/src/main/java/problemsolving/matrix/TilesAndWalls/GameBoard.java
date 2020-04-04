package ProblemSolving.matrix.TilesAndWalls;

/*

You are given an M by N matrix consisting of booleans that represents a board. Each True boolean represents a wall.
Each False boolean represents a tile you can walk on.

Given this matrix, a start coordinate, and an end coordinate, return the minimum number of steps required to reach the end coordinate from the start. If there is no possible path, then return null. You can move up, left, down, and right. You cannot move through walls. You cannot wrap around the edges of the board.

For example, given the following board:

[[f, f, f, f],
[t, t, f, t],
[f, f, f, f],
[f, f, f, f]]
and start = (3, 0) (bottom left) and end = (0, 0) (top left), the minimum number of steps required to reach the end is 7, since we would need to go through (1, 2) because there is a wall everywhere else on the second row.
*/


import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class GameBoard {

    private boolean[][] board ;


    public GameBoard(boolean[][] board) {
        this.board = board;

    }

    public Integer getMinimumSteps(Position startPosition, Position endPosition) {

        if(startPosition.equals(endPosition)) {
            return 0;
        }

        LinkedList<Position> queue = new LinkedList<>();

        // cache of visited positions
        Set<Position> visitedPositions = new HashSet<Position>();

        visitedPositions.add(startPosition);

        queue.add(startPosition);

        while(!queue.isEmpty()){
            Position currentPosition = queue.remove();

            if(currentPosition.equals(endPosition)){
                return currentPosition.movesTaken;
            }



            // go over all possible next positions
            if(canMoveTop(currentPosition)){
                Position newPosition = moveTop(currentPosition);
                if(!visitedPositions.contains(newPosition)){
                    queue.add(newPosition);
                    visitedPositions.add(newPosition);
                }

            }

            if(canMoveRight(currentPosition)){
                Position newPosition = moveRight(currentPosition);
                if(!visitedPositions.contains(newPosition)){
                    queue.add(newPosition);
                    visitedPositions.add(newPosition);
                }


            }

            if(canMoveDown(currentPosition)){
                Position newPosition = moveDown(currentPosition);
                if(!visitedPositions.contains(newPosition)){
                    queue.add(newPosition);
                    visitedPositions.add(newPosition);
                }

            }

            if(canMoveLeft(currentPosition  )){
                Position newPosition = moveLeft(currentPosition);
                if(!visitedPositions.contains(newPosition)){
                    queue.add(newPosition);
                    visitedPositions.add(newPosition);

                }

            }

        }


        return  null;
    }

    private boolean isTile(int row, int col){
        return !board[row][col];
    }

    public boolean canMoveTop(Position position){
        if(position.row > 0 && isTile(position.row -1, position.col)) {
            return true;
        }
        return false;
    }

    public Position moveTop(Position position){
        Position newPosition = new Position(position.row -1, position.col);
        newPosition.movesTaken = position.movesTaken + 1;
        return newPosition;
    }

    public boolean canMoveRight(Position position){
        if(position.col < board[0].length -1 && isTile(position.row, position.col +1))
            return true;

        return false;
    }

    public Position moveRight(Position position ){
        Position newPosition = new Position(position.row, position.col + 1);
        newPosition.movesTaken = position.movesTaken + 1;
        return newPosition;
    }

    public  boolean canMoveDown(Position position){
        if(position.row < board.length-1 && isTile(position.row + 1, position.col) ) {
            return true;
        }
        return false;
    }

    public Position moveDown(Position position){
        Position newPosition = new Position(position.row + 1, position.col);
        newPosition.movesTaken = position.movesTaken + 1;
        return newPosition;
    }

    public boolean canMoveLeft(Position position){
        if(position.col > 0  && isTile(position.row, position.col -1))
            return true;

        return false;
    }

    public Position moveLeft(Position position){
        Position newPosition = new Position(position.row, position.col - 1);
        newPosition.movesTaken = position.movesTaken + 1;
        return newPosition;
    }

}
