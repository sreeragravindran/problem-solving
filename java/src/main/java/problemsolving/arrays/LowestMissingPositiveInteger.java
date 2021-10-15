package problemsolving.arrays;

import com.google.common.base.Preconditions;

/*
Given an array of integers, find the first missing positive integer in linear time and constant space.
In other words, find the lowest positive integer that does not exist in the array.
The array can contain duplicates and negative numbers as well.

For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

You can modify the input array in-place.
*/

public class LowestMissingPositiveInteger {

    private int[] inputArray;

    public  LowestMissingPositiveInteger(int[] inputArray){
        Preconditions.checkNotNull(inputArray, "input should not be null");

        this.inputArray = inputArray;
    }

    /*
        use the positive values in the array as index to mark its presence
        in the second pass, the index at which no presence is recorded is the missing number
     */
    public int getLowestMissingPositiveInteger(){

        for(int index = 0; index < inputArray.length ; index++){
            if(inputArray[index] > 0 && inputArray[index] <= inputArray.length ){
                inputArray[inputArray[index] - 1] = 1;
            }
        }

        for(int index = 0; index < inputArray.length; index++){
            if(inputArray[index] != 1)
                return index + 1;
        }

        return inputArray.length + 1;
    }
}
