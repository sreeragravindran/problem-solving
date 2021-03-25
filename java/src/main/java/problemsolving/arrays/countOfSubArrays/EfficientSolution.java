package ProblemSolving.arrays.countOfSubArrays;

public class EfficientSolution {
    public static int findCountOfConsecutiveSubArrays(int[] arr){
        // assumptions
        // array is not empty
        // array is sorted in increasing order

        int count = 0;
        int subArrayCount = 0;
        for(int i =1; i< arr.length; i ++){
            if(arr[i] - arr[i-1] == 1) {
                subArrayCount++;
            }
	        else {
                count += (subArrayCount+1) * (subArrayCount)/2;
                subArrayCount = 0;
            }
        }

        if(subArrayCount > 0){
            count += (subArrayCount+1) * (subArrayCount)/2;
        }

        return count;
    }
}
