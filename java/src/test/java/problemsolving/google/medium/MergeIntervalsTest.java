package problemsolving.google.medium;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervalsTest {

    @Test
    public void testGetNonOverlappingIntervals() {

        List<List<Integer>> intervals = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 6), Arrays.asList(8, 10), Arrays.asList(15, 18));
        var actualIntervals = MergeIntervals.getNonOverlappingIntervals(intervals);
        var expectedIntervals = List.of(List.of(1, 6), List.of(8, 10), List.of(15, 18));

        assertIntervals(expectedIntervals, actualIntervals);

        intervals = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(2, 6), Arrays.asList(15, 18), Arrays.asList(4, 10));
        actualIntervals = MergeIntervals.getNonOverlappingIntervals(intervals);
        expectedIntervals = List.of(List.of(1, 10), List.of(15, 18));

        assertIntervals(expectedIntervals, actualIntervals);
    }

    private void assertIntervals(List<List<Integer>> expected, List<List<Integer>> actual) {
        for (int i = 0; i < expected.size(); i++) {
            for (int j = 0; j < expected.get(i).size(); j++) {
                Assert.assertEquals(expected.get(i).get(j), actual.get(i).get(j));
            }
        }
    }
}