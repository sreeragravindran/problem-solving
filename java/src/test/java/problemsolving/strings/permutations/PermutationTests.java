package problemsolving.strings.permutations;

import problemsolving.strings.permuations.Approach1;
import org.junit.Assert;
import org.junit.Test;
import problemsolving.strings.permuations.Approach2;
import problemsolving.strings.permuations.Approach3;

import java.util.List;
import java.util.Set;

public class PermutationTests {

    @Test
    public void should_generate_all_permutations_for_word_BOAT(){
        Approach1 approach1 = new Approach1();

        List<String> combinations = approach1.getPermutations("boat");
        Assert.assertTrue(combinations.size() == 24);
        Assert.assertTrue(combinations.contains("bota"));
        Assert.assertTrue(combinations.contains("obta"));
        Assert.assertTrue(combinations.contains("otba"));
        Assert.assertTrue(combinations.contains("otab"));
    }

    @Test
    public void should_generate_all_permutations_for_word_COMBINATIONS(){
        Approach1 approach1 = new Approach1();

        List<String> combinations = approach1.getPermutations("combinatio");
        Assert.assertTrue(combinations.size() == 3628800);
    }

    @Test
    public void ShouldReturnAllPermutations() {
        String input = "abcdefghijk";

        List<String> permutations1  = Approach1.getPermutations(input);
//        Set<String> permutations2 = Approach2.findPermutations(input);
        List<String> permutations3  = Approach3.getPermutations(input);
//        Assert.assertEquals(permutations1.size(), permutations2.size());
//        Assert.assertEquals(permutations2.size(), permutations3.size());
//        Assert.assertEquals(24, permutations.size());
    }

}
