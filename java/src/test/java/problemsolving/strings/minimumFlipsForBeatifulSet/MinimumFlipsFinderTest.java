package problemsolving.strings.minimumFlipsForBeatifulSet;

import org.junit.Assert;
import org.junit.Test;

public class MinimumFlipsFinderTest {

    @Test
    public void shouldFindMinimumFlips() {
        String input = "010001";
        int expectedMinFlips = 1;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "010010";
        expectedMinFlips = 2;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "00110";
        expectedMinFlips = 1;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "010110";
        expectedMinFlips = 2;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "00011000";
        expectedMinFlips = 2;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "0000";
        expectedMinFlips = 0;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "11111";
        expectedMinFlips = 0;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "000111";
        expectedMinFlips = 0;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));

        input = "111000";
        expectedMinFlips = 3;
        Assert.assertEquals(expectedMinFlips, MinimumFlipsFinder.findMinimumFlips(input));
    }

}