package ProblemSolving.arrays;

import org.junit.Test;

public class MultidimensionalArrayTest {

    @Test
    public void length_of_jagged_array() {
        int[][] array = new int[][]{
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        for(int[] row : array){
            System.out.println("array length: " + row.length);
            for(int col : row){
                System.out.print(col);
            }
            System.out.println("");
        }

        String word = "A";
        System.out.println(word.substring(1,1));
    }

}
