package ProblemSolving.matrix;

public class Position {

    public int row;
    public int col;

    public int movesTaken; // number of moves to get to this position

    public Position(int row, int col){
        this.row = row;
        this.col = col;
    }

    @Override
    public boolean equals(Object obj) {

        if(this == obj)
            return true;

        if(obj == null || obj.getClass() != this.getClass())
            return false;

        Position that = (Position)obj;
        return this.row == that.row && this.col == that.col;
    }

    @Override
    public int hashCode() {
        return (int)(Math.pow(row +1 ,1) + Math.pow(col +1, 2));
    }


}
