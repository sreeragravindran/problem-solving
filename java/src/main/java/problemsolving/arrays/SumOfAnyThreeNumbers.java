package ProblemSolving.arrays;


/*
    Given a list of numbers and a number k, return whether any three numbers from the list add up to k.
     For example, given [10, 15, 3, 7, 5, 10, 8, 9, 1] and k of 9, return true since 3 + 5 + 1 is 9.
 */


import com.google.common.base.Preconditions;

import java.util.*;

public class SumOfAnyThreeNumbers {

    private List<Integer> list;

    public SumOfAnyThreeNumbers(List<Integer> list){
        Preconditions.checkNotNull(list, "the input list should not be null");
        this.list = list;
    }

    /*
        the sorting takes O(nlogn) time
        and the loop takes O(n ^ 2) time
     */

    public boolean equalsSum(int sum){
        if(list.size() < 3) return false;

        Collections.sort(list); // O(nlogn )

        int left = 0;
        int right = 0;
        int guess = 0;

        for(int i = 0; i < list.size(); i++){ // O(n ^ 2) ?
            left = i + 1;
            right = list.size() - 1;

            while(left < right){
                guess = list.get(i) + list.get(left) + list.get(right);
                if(guess == sum) return true;

                if(guess < sum) {
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return false;
    }
}
