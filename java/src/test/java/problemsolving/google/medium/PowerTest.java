package problemsolving.google.medium;

import org.junit.Assert;
import org.junit.Test;

public class PowerTest {

    @Test
    public void testPowerIterative() {
        Assert.assertEquals(16,  Power.powerIterative(2, 4));
    }

    @Test
    public void testPowerRecursive() {
        Assert.assertEquals(16,  Power.powerRecursive(2, 4));
        Assert.assertEquals(64,  Power.powerRecursive(2, 6));
    }
}