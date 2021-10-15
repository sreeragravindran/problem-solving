package problemsolving.Graphs.minimisingPermutations;

import problemsolving.graphs.minimizingPermutations.Solution;
import groovy.lang.Tuple2;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {

    @Test
    public void testReversablePortions(){
        int startIndex = 0;
        int endIndex = 0;

        List<Tuple2<Integer, Integer>> result = new ArrayList<>();
        int[] arr = {5,4,3,2,7,9,8};

        for(int i =0; i < arr.length-1; i++){
            startIndex = i;
            endIndex = i;
            while( i < arr.length-1 && arr[i] >= arr[i+1]){
                endIndex= i+1;
                i++;
            }

            if(endIndex > startIndex){
                result.add(new Tuple2<>(startIndex, endIndex));
            }
        }

        Assert.assertEquals(2, result.size());
        Assert.assertTrue(result.get(0).getFirst() == 0 && result.get(0).getSecond() == 3);
        Assert.assertTrue(result.get(1).getFirst() == 5 && result.get(1).getSecond() == 6);
    }

    public int[] reversePortion(int[] sourceArr, int startIndex, int endIndex){
        int[] reversedArray = sourceArr.clone();
        for(int i= endIndex, j = startIndex; i >= startIndex; i--, j++){
            reversedArray[j] = sourceArr[i];
        }
        return reversedArray;
    }

    @Test
    public void testReversePortion(){
        int[] arr = {5,4,3,2,10};
        int[] result = reversePortion(arr, 0, 3);

        Assert.assertTrue(Arrays.equals(new int[]{2,3,4,5,10}, result));
    }

    @Test
    public void shouldPass(){

        Solution minimisingPermutations = new Solution();
        int[] arr = {5,4,3,2,10};
        int result = minimisingPermutations.minOperations(arr);
        int expected = 1;
        Assert.assertEquals(expected, result);

        arr = new int[]{3,1,2};
        result = minimisingPermutations.minOperations(arr);
        expected = 2;
        Assert.assertEquals(expected, result);

        arr = new int[]{3, 2, 5, 4, 1};
        result = minimisingPermutations.minOperations(arr);
        expected = 2;
        Assert.assertEquals(expected, result);

        arr = new int[]{1,2,3,4,5} ;
        result = minimisingPermutations.minOperations(arr);
        expected = 0;
        Assert.assertEquals(expected, result);
    }

}
