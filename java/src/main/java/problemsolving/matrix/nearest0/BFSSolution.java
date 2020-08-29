package ProblemSolving.matrix.nearest0;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSolution {

    public class Position {
        public int row;
        public int col;

        public Position(int row, int col){
            this.row = row;
            this.col = col;
        }
    }

    public int[][] getDistanceMatrix(int[][] matrix){
        int rows = matrix.length;
        if (rows == 0)
            return matrix;
        int cols = matrix[0].length;

        Queue<Position> q = new LinkedList<>();

        int[][] dist = new int[rows][cols];
        for(int i=0; i<rows; i++){
            for(int j=0; j< cols; j++){
                if (matrix[i][j] == 0) {
                    dist[i][j] = 0;
                    q.add(new Position(i,j)); //Put all 0s in the queue.
                } else {
                    dist[i][j] = Integer.MAX_VALUE;
                }
            }
        }

        // possible 4 directions
        int[][] directions = new int[][] {{ -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 }};
        while (!q.isEmpty()) {
            Position curr = q.peek();;
            q.poll();
            for (int i = 0; i < 4; i++) {
                int new_r = curr.row + directions[i][0], new_c = curr.col + directions[i][1];
                // if calculated position is valid in the matrix
                if (new_r >= 0 && new_c >= 0 && new_r < rows && new_c < cols) {

                    if (dist[new_r][new_c] > dist[curr.row][curr.col] + 1) {
                        dist[new_r][new_c] = dist[curr.row][curr.col] + 1;
                        q.add(new Position(new_r, new_c));
                    }
                }
            }
        }
        return dist;
    }
}
