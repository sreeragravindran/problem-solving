package problemsolving.arrays;

import java.util.*;
import com.google.common.base.Preconditions;
import com.sun.xml.internal.xsom.impl.scd.Iterators;


/*
 *   Given a list of numbers and a number k, return whether any two numbers from the list add up to k.
 *   For example, given [10, 15, 3, 7] and k of 17, return true since 10 + 7 is 17.
 *
 *   solve in O(n) time complexity
 */

public class SumOfAnyTwoNumbers {

    private List<Integer> list;


    public SumOfAnyTwoNumbers(List<Integer> list){

        Preconditions.checkNotNull(list, "input list should not be null");
        Preconditions.checkArgument(list.size() >= 2, "list should contain at least 2 items");
        this.list = list;
    }


    public boolean equalsSum(int sum){

        if(list.size() < 2) { return false; }

        HashMap<Integer, Integer> hashMap = new HashMap<Integer, Integer>();

        for (int element : list) {
            int guess = sum - element;
            if(hashMap.containsKey(guess)){
                return true;
            }
            else  {
                hashMap.put(element, element);
            }
        }

        return false;
    }
}
