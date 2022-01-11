package problemsolving.recursion.possibleIPs;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class GeneratePossibleIPsTest {

    @Test
    public void ShouldGenerateValidIPs() {
        String ipSource = "2542540123";
        GeneratePossibleIPs  generatePossibleIPs= new GeneratePossibleIPs();
        List<String> ipList = generatePossibleIPs.generate(ipSource);
        Assert.assertTrue(ipList.containsAll(Arrays.asList("254.254.0.123","254.25.40.123")));

        ipSource = "25525511135";
        ipList = generatePossibleIPs.generate(ipSource);
        Assert.assertTrue(ipList.containsAll(Arrays.asList("255.255.11.135", "255.255.111.35")));

        ipSource = "25505011535";
        ipList = generatePossibleIPs.generate(ipSource);
        Assert.assertEquals(0, ipList.size());
    }

}