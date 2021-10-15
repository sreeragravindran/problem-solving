package problemsolving.strings;

import problemsolving.strings.promotionWinner.Result;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PromotionWinnerTests {

    @Test
    public void shouldReturnTrue() {
//        List<String> codeList = Arrays.asList("orange", "orange apple", "banana orange apple", "banana");
        List<String> codeList = Arrays.asList("orange", "apple apple", "banana anything apple", "anything");
        List<String> shoppingCart = Arrays.asList("orange", "apple", "apple", "banana", "orange", "apple", "banana");

        int result = Result.getResult(codeList, shoppingCart);
        Assert.assertEquals(1, result);

    }
}

