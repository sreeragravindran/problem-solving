package coding.oop;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class ReduceImplTest  {

    @Test
    public void shouldAdd() {
        ReduceImpl reduce = new ReduceImpl();
        var input = Arrays.asList(1,2,3,4,5);
        int sum = reduce.sum(input);
        Assert.assertEquals(15, sum);
    }
}