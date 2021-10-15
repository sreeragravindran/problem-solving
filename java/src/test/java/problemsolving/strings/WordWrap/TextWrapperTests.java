package problemsolving.strings.WordWrap;

import org.junit.Assert;
import org.junit.Test;

public class TextWrapperTests {

    @Test
    public void should_wrap_texts() throws Exception{
        String input = "this is a test of the text-wrap function.";
        String expectedOutput = "this \nis a \ntest \nof \nthe \ntext-\nwrap \nfunct\nion.\n";
        TextWrapper textWrapper = new TextWrapper();

        WrappedText wrappedText = textWrapper.Wrap(input, 5);
        Assert.assertEquals(expectedOutput , wrappedText.toString());
    }
}
