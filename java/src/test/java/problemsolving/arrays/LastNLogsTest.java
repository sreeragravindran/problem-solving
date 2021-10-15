package problemsolving.arrays;

import org.junit.Assert;
import org.junit.Test;
import problemsolving.arrays.LastNLogs.ILogger;
import problemsolving.arrays.LastNLogs.Logger;

public class LastNLogsTest {

    @Test
    public void should_return_the_last_nth_log(){
        ILogger logger = new Logger(5);

        logger.record("1");
        logger.record("2");
        logger.record("3");
        logger.record("4");

        String thirdLast = logger.getLast(3);
        Assert.assertEquals("2", thirdLast);

        String secondLast = logger.getLast(2);
        Assert.assertEquals("3", secondLast);

        logger.record("5");
        logger.record("6");
        logger.record("7");
        logger.record("8");

        secondLast = logger.getLast(2);
        Assert.assertEquals("7", secondLast);

        thirdLast = logger.getLast(3);
        Assert.assertEquals("6", thirdLast);

        String fifthLast = logger.getLast(5);
        Assert.assertEquals("4", fifthLast);

        String last = logger.getLast(1);
        Assert.assertEquals("8", last);

    }


    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_log_contains_4_elements_and_we_ask_for_fifth_last(){
        ILogger logger = new Logger(5);

        logger.record("1");
        logger.record("2");
        logger.record("3");
        logger.record("4");

        logger.getLast(5);
    }

    @Test(expected = IllegalArgumentException.class)
    public void should_throw_exception_when_log_size_is_5_elements_and_we_ask_for_sixth_last(){
        ILogger logger = new Logger(5);

        logger.record("1");
        logger.record("2");
        logger.record("3");
        logger.record("4");
        logger.record("5");

        logger.getLast(6);
    }
}
