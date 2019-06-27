package ProblemSolving.strings.WordWrap;

import org.junit.Assert;
import org.junit.Test;
public class LineTests {

    @Test()
    public void should_split_word_into_two() throws LineOverFlowException{
        Line line = new Line(5);

        line.addCharacter('h');
        line.addCharacter('e');
        line.addCharacter('l');
        line.addCharacter(' ');
        line.addCharacter('l');

        Line newLine = line.splitFromLastWord();

        Assert.assertEquals("hel ", line.toString());
        Assert.assertEquals("l", newLine.toString());

    }

    @Test()
    public void should_contain_only_one_word() throws LineOverFlowException{
        Line line = new Line(5);

        line.addCharacter(' ');
        line.addCharacter('h');
        line.addCharacter('e');
        line.addCharacter('l');
        line.addCharacter('l');

        Assert.assertTrue(line.hasOnlyOneWord());
    }

    @Test()
    public void should_contain_more_than_one_word() throws LineOverFlowException{
        Line line = new Line(5);

        line.addCharacter('h');
        line.addCharacter('e');
        line.addCharacter('l');
        line.addCharacter(' ');
        line.addCharacter('l');

        Assert.assertFalse(line.hasOnlyOneWord());
    }

    @Test(expected = LineOverFlowException.class)
    public void should_throw_exception() throws LineOverFlowException{
        Line line = new Line(5);

        line.addCharacter('h');
        line.addCharacter('e');
        line.addCharacter('l');
        line.addCharacter(' ');
        line.addCharacter('l');
        line.addCharacter('o');

    }
}
