package problemsolving.matrix.minCostToTheEnd;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MinimumCostToTheEnd {

    public static class Position {
        public int row;
        public int col;
        public int cost;

        public Position(int r, int c) {
            this.row = r;
            this.col = c;
        }

        public void setCost(int cost) {
            this.cost = cost;
        }

        public Position moveRight() {
            var position = new Position(this.row, this.col + 1);
            position.setCost(this.cost);
            return position;
        }

        public Position moveDown() {
            var position = new Position(this.row + 1, this.col);
            position.setCost(this.cost);
            return position;
        }
    }

    public static int findMinimumCost(int[][] matrix) {
        PriorityQueue<Position> minHeap = new PriorityQueue<>(Comparator.comparingInt(a -> a.cost));
        Position position = new Position(0, 0);
        position.setCost(matrix[position.row][position.col]);
        minHeap.add(position);

        int loopCount = 0 ;
        while (minHeap.size() > 0) {
            loopCount++;
            Position currentPosition = minHeap.poll();

            if (currentPosition.row == matrix.length - 1 && currentPosition.col == matrix[0].length - 1) {
                System.out.println("Loop executed : " + loopCount + " times.");
                return currentPosition.cost;
            }

            if (currentPosition.col < matrix[0].length - 1) {
                Position newPosition = currentPosition.moveRight();
                newPosition.setCost(currentPosition.cost + matrix[newPosition.row][newPosition.col]);
                minHeap.add(newPosition);
            }

            if (currentPosition.row < matrix.length - 1) {
                Position newPosition = currentPosition.moveDown();
                newPosition.setCost(currentPosition.cost + matrix[newPosition.row][newPosition.col]);
                minHeap.add(newPosition);
            }
        }

        return 0;
    }
}
