package problemsolving.binarySearch;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class RotatedSortedArrayTest {

    @Test
    public void shouldSearch() {
        Assert.assertEquals(4, RotatedSortedArray.search(new int[] {4,5,6,7,0,1,2}, 0));
        Assert.assertEquals(2, RotatedSortedArray.search(new int[]{6, 7, 0, 1, 2, 3, 4}, 0));
        Assert.assertEquals(1, RotatedSortedArray.search(new int[]{6, 7, 0, 1, 2, 3, 4}, 7));
        Assert.assertEquals(-1, RotatedSortedArray.search(new int[]{6, 7, 0, 1, 2, 4}, 3));
    }

}