package interview.zolando;

import interview.zolando.BiggestTwoDigit;
import org.junit.Assert;
import org.junit.Test;

public class BiggestTwoDigitTest {

    @Test
    public void test() {
        BiggestTwoDigit biggestTwoDigit = new BiggestTwoDigit();
        String S = "10";
        int result  = 0;
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(10, result);

        S = "50552";
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(55, result);

        S = "10101";
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(10, result);

        S = "88";
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(88, result);

        S = "8";
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(8, result);

        S = "";
        result = biggestTwoDigit.solution(S);
        Assert.assertEquals(0, result);
    }
}
