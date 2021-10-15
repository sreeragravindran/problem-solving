package problemsolving.arrays;

import problemsolving.arrays.SortKSortedArray.KSortedArraySorter;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortKSortedArrayTests {

    @Test
    public void test(){
        int k = 3;
        int[] kSortedArray = new int[] {6,5,3,2,8,10,9};
        KSortedArraySorter sorter = new KSortedArraySorter();
        List<Integer> actualResult = sorter.sort(kSortedArray, k);
        List<Integer> expected = new ArrayList<Integer>(Arrays.asList(2,3,5,6,8,9,10));

        Assert.assertTrue(expected.equals(actualResult));
    }
}


