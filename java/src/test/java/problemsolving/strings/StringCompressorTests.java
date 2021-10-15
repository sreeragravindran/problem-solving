package problemsolving.strings;

import org.junit.Assert;
import org.junit.Test;
import problemsolving.Strings.StringCompressor;

public class StringCompressorTests {

    @Test
    public void should_return_a2b1c5a3_for_aabcccccaaa(){
        StringCompressor stringCompressor = new StringCompressor();
        String compressedString = stringCompressor.compress("aabcccccaaa");

        Assert.assertEquals("a2b1c5a3", compressedString);
    }

    @Test
    public void should_return_abc_for_abc(){
        StringCompressor stringCompressor = new StringCompressor();
        String compressedString = stringCompressor.compress("abc");

        Assert.assertEquals("abc", compressedString);
    }
}
