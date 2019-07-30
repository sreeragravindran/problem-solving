package ProblemSolving.arrays;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ListTest {

    @Test
    public void list_of_strings_are_equal_when_content_are_the_sames(){

        List<String> firstList = new ArrayList<String>() {};
        firstList.add("one");
        firstList.add("two");
        firstList.add("three");

        List<String> secondList = new ArrayList<String>() {};
        secondList  .add("one");
        secondList.add("two");
        secondList.add("three");

        Assert.assertTrue(firstList.equals(secondList));
    }

    @Test
    public void optional_list_of_strings_are_equal_when_content_are_the_same(){

        List<String> firstList = new ArrayList<String>() {};
        firstList.add("one");
        firstList.add("two");
        firstList.add("three");

        List<String> secondList = new ArrayList<String>() {};
        secondList.add("one");
        secondList.add("two");
        secondList.add("three");

        Assert.assertTrue(Optional.of(firstList).equals(Optional.of(secondList)));
    }
}
