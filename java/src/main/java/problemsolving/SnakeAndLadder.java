package ProblemSolving;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;


public class SnakeAndLadder {

    static int quickestWayUp(int[][] ladders, int[][] snakes) {

        class BoardPosition {
            public int position;
            public int movesToPosition;

            public BoardPosition(int position, int movesToPosition){
                this.position = position;
                this.movesToPosition = movesToPosition;
            }
        }

        class Board{
            private boolean[] visited = new boolean[101];
            private Map<Integer, Integer> ladders;
            private Map<Integer, Integer> snakes;

            public Board(Map<Integer, Integer> ladders, Map<Integer, Integer> snakes){
                this.ladders = ladders;
                this.snakes = snakes;
            }

            public void setVisited(BoardPosition boardPosition){
                visited[boardPosition.position] = true;
            }

            public boolean isVisited(BoardPosition boardPosition){
                return visited[boardPosition.position];
            }

            public BoardPosition moveToPosition(BoardPosition boardPosition){
                if(ladders.containsKey(boardPosition.position)){
                    boardPosition.position = ladders.get(boardPosition.position);
                } else if(snakes.containsKey(boardPosition.position)){
                    boardPosition.position = snakes.get(boardPosition.position);
                }

                return boardPosition;
            }
        }


        // track the visited positions
        LinkedList<BoardPosition> queue = new LinkedList<BoardPosition>();

        // convert laddders matrix to map
        Map<Integer, Integer> ladderMap = new HashMap<Integer, Integer>();
        for(int[] row : ladders){
            ladderMap.put(row[0], row[1]);
        }

        Map<Integer, Integer> snakesMap = new HashMap<Integer, Integer>();
        for(int[] row : snakes){
            snakesMap.put(row[0], row[1]);
        }

        Board board = new Board(ladderMap, snakesMap);

        BoardPosition boardPosition = new BoardPosition(1, 0);
        queue.add(boardPosition);
        board.setVisited(boardPosition);

        while(!queue.isEmpty()){
            BoardPosition currentPosition = queue.remove();
            if(currentPosition.position == 100){
                return currentPosition.movesToPosition;
            }

            for(int i = 1; i <= 6 && currentPosition.position + i <= 100; i++){

                BoardPosition newPosition = board.moveToPosition(new BoardPosition(
                        currentPosition.position + i,
                        currentPosition.movesToPosition + 1));

                if(newPosition.position == 100) {
                    return newPosition.movesToPosition;
                }

                if(!board.isVisited(newPosition)){
                    board.setVisited(newPosition);
                    queue.add(newPosition);
                }
            }
        }

        return -1;

    }
}
