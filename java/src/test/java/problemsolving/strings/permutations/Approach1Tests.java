package problemsolving.strings.permutations;

import problemsolving.strings.permuations.Approach1;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class Approach1Tests {

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
    public void should_generate_all_combinations(){
        Approach1 approach1 = new Approach1();

        List<String> combinations = approach1.generatePermutationsForChar('b', "ota");
        Assert.assertTrue(combinations.size() == 4);
        Assert.assertTrue(combinations.contains("bota"));
        Assert.assertTrue(combinations.contains("obta"));
        Assert.assertTrue(combinations.contains("otba"));
        Assert.assertTrue(combinations.contains("otab"));
    }

    @Test
    public void print_all_combinations(){
        Approach1 approach1 = new Approach1();
        List<String> combinations = approach1.generatePermutationsForChar('a', "t");
        Assert.assertTrue(combinations.contains("ta"));
        Assert.assertTrue(combinations.contains("at"));
    }

}
