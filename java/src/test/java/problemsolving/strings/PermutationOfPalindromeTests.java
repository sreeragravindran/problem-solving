package problemsolving.strings;

import org.junit.Test;
import junit.framework.Assert;
import problemsolving.strings.PermutationOfPalindrome;

public class PermutationOfPalindromeTests {

    @Test
    public void should_return_true_for_malayalam(){
        String input = "malayalam";

        PermutationOfPalindrome permutationOfPalindrome = new PermutationOfPalindrome();

        boolean result = permutationOfPalindrome.isPremutationOfPalindrome(input);

        Assert.assertTrue(result);
    }

    @Test
    public void should_return_false_for_abcda(){
        String input = "MaLaYalam";

        PermutationOfPalindrome permutationOfPalindrome = new PermutationOfPalindrome();

        boolean result = permutationOfPalindrome.isPremutationOfPalindrome(input);

        Assert.assertFalse(result);
    }


    @Test
    public void should_return_true_for_tactcoa(){
        String input = "tact  coa";

        PermutationOfPalindrome permutationOfPalindrome = new PermutationOfPalindrome();

        boolean result = permutationOfPalindrome.isPremutationOfPalindrome(input);

        Assert.assertTrue(result);
    }

    @Test
    public void should_return_false_for_gibberish(){
        String input = "gibberish";

        PermutationOfPalindrome permutationOfPalindrome = new PermutationOfPalindrome();

        boolean result = permutationOfPalindrome.isPremutationOfPalindrome(input);

        Assert.assertFalse(result);
    }

}
