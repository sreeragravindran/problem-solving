package ProblemSolving.matrix;

import ProblemSolving.matrix.nearest0.BFSSolution;
import org.junit.Test;

public class Nearest0Tests {

    @Test
    public void Test(){
        BFSSolution bfsSolution = new BFSSolution();
        int[][] distance = bfsSolution.getDistanceMatrix(new int[][] {
                {0,0,0},
                {0,1,0},
                {1,1,1,}
        });
    }
}
