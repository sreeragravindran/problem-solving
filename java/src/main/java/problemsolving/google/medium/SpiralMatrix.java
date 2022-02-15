package problemsolving.google.medium;

/*
Given an m x n matrix, return all elements of the matrix in spiral order.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [1,2,3,6,9,8,7,4,5]

Input: matrix = [[1,2,3,4],[5,6,7,8],[9,10,11,12]]
Output: [1,2,3,4,8,12,11,10,9,5,6,7]
 */

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

    public static List<Integer> getSpiralOrder(int[][] matrix) {

        // starting ranges
        int rStart = 0;
        int rEnd = matrix.length - 1;

        int cStart = 0;
        int cEnd = matrix[0].length - 1;

        List<Integer> output = new ArrayList();

        while (rStart <= rEnd && cStart <= cEnd) {
            // add top row left-right
            for (int c = cStart; c <= cEnd; c++) {
                output.add(matrix[rStart][c]);
            }

            // add last col top-bottom
            for(int r = rStart +1; r <= rEnd; r++) {
                output.add(matrix[r][cEnd]);
            }

            // add last row right -> left
            for(int c = cEnd-1 ; c >= cStart; c--) {
                output.add(matrix[rEnd][c]);
            }

            // add first col bottom up
            for(int r = rEnd-1 ; r >= rStart + 1; r--) {
                output.add(matrix[r][cStart]);
            }

            //  reduce ranges

            rStart = rStart + 1;
            rEnd = rEnd - 1;
            cStart = cStart + 1;
            cEnd = cEnd -1;
        }

        return  output;
    }
}
