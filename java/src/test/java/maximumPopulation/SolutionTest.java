package maximumPopulation;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {

    @Test
    public void shouldReturnMaxPopulationYear() {

        Solution solution = new Solution();
        List<Person> personList = new ArrayList<>();
        personList.add( new Person(1990, 2021));
        personList.add( new Person(1980, 1989));
        personList.add( new Person(1981, 2000));

        int result = solution.findYearOfMaximumPopulation(personList);
        Assert.assertEquals(1981, result);

        personList.add(new Person(2000, 2005));
        personList.add(new Person(2000, 2005));
        personList.add(new Person(2000, 2005));

        result = solution.findYearOfMaximumPopulation(personList);

        Assert.assertEquals(2000, result);
    }

}