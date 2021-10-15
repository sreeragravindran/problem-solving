package problemsolving.strings.minimumLengthSubstring;

import problemsolving.strings.mininumLengthSubstring.Solution;
import org.junit.Assert;
import org.junit.Test;

public class MinimumLengthSubstringTests {

    @Test
    public void test1() {
        String s = "dcbefebce";
        String t = "fd";
        int expected = 5;
        int actual = Solution.minLengthSubstring(s,t);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test2() {
        String s = "bfbeadbcbcbfeaaeefcddcccbbbfaaafdbebedddf";
        String t = "cbccfafebccdccebdd";
        int expected = -1;
        int actual = Solution.minLengthSubstring(s,t);
        Assert.assertEquals(expected, actual);
    }
}
