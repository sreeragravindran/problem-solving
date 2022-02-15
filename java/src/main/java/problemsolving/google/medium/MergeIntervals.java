package problemsolving.google.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*

Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlaps, merge them into [1,6].

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.

 */
public class MergeIntervals {


    public static List<List<Integer>> getNonOverlappingIntervals(List<List<Integer>> intervals) {

        intervals.sort(Comparator.comparingInt(a -> a.get(0)));
        List<List<Integer>> output = new ArrayList<>();

        List<Integer> currentInterval = Arrays.asList(intervals.get(0).get(0), intervals.get(0).get(1));
        output.add(currentInterval);

        for (int i = 1; i < intervals.size(); i++) {
            if(currentInterval.get(1) >= intervals.get(i).get(0) ) {
                currentInterval.set(1, intervals.get(i).get(1));
            } else {
                currentInterval =  Arrays.asList(intervals.get(i).get(0),intervals.get(i).get(1));
                output.add(currentInterval);
            }
        }

        return output;
    }
}
