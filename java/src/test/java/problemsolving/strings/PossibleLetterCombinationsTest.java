package problemsolving.strings;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PossibleLetterCombinationsTest {

    @Test
    public void should_get_all_combinations_for_23() {
        PossibleLetterCombinations possibleLetterCombinations = new PossibleLetterCombinations();
        List<String> actual = possibleLetterCombinations.get("23");
        List<String> expected = Arrays.asList("ad", "bd", "cd", "ae", "be", "ce", "af", "bf", "cf");
        Assert.assertTrue(actual.size() == expected.size());
        Assert.assertTrue(actual.stream().allMatch(e -> expected.contains(e)));
    }
}
