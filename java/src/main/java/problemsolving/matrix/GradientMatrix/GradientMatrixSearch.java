package ProblemSolving.matrix.GradientMatrix;

import ProblemSolving.matrix.Position;


/*
    A gradient matrix is one where the values are sorted horizontally and vertically
 */
public class GradientMatrixSearch {

    int[][] matrix ;
    int rowSize;
    int colSize;

    public GradientMatrixSearch(int[][] matrix){

        // assumption, the input matrix is always a gradient matrix
        this.matrix = matrix;
        this.rowSize = matrix.length;
        this.colSize = matrix[0].length;
    }

    public Position search(int value){
        try {
            Position position = startPosition();
            while(valueAt(position) != value){
                position = moveNext(position, value);
            }
            return position;
        } catch (IndexOutOfBoundsException iEx){
            return null;
        }
    }


    private int valueAt(Position position){
        return matrix[position.row][position.col];
    }

    private Position startPosition(){
        return new Position(rowSize -1,0);
    }

    private Position moveNext(Position position, int value){
        Position newPosition;
        if(valueAt(position) > value ){
            newPosition = moveUp(position);
        } else {
            newPosition = moveRight(position);
        }
        newPosition.movesTaken = position.movesTaken + 1;
        return newPosition;
    }

    private Position moveUp(Position position){
        return new Position(position.row - 1, position.col);
    }


    private Position moveRight(Position position){
        return new Position(position.row, position.col+1);
    }
}


