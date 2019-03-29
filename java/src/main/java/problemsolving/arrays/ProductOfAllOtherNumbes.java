package ProblemSolving.arrays;

import com.google.common.base.Preconditions;

/*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].

Constraint  : Do not use division
 */
public class ProductOfAllOtherNumbes {

    private int[] array;

    public  ProductOfAllOtherNumbes(int[] array){
        Preconditions.checkNotNull(array, "input list should not be null");
        Preconditions.checkArgument(array.length > 0, "list should contain atleast one element");

        this.array = array;
    }

    public int[] getProductOfAllOtherNumbers() {
        if(array.length == 1) return array;

        if(array.length == 2) {
            int temp = array[0];
            array[0] = array[1];
            array[1] = temp;
            return array;
        }

        int[] leftSideProducts = getLeftSideProducts();
        int product = 1;
        int lastValue = array[array.length -1];
        array[array.length - 1] = leftSideProducts[leftSideProducts.length -1];

        for(int i = array.length -2; i >=0; i--){
            product = product * lastValue;
            lastValue = array[i];
            array[i] = product * leftSideProducts[i];
        }

        return array;
    }

    private int[] getLeftSideProducts(){
        int[] leftSideProductArray =  new int[array.length];
        int product = 1;
        leftSideProductArray[0] = array[0];

        for(int i=1; i < array.length; i++){
            leftSideProductArray[i] = (product = product * array[i-1]);
        }

        return leftSideProductArray;
    }
}
