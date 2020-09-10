package Interview.Schedular;


import org.junit.Assert;
import org.junit.Test;

import java.time.Instant;
import java.util.Date;

public class JobTest {

    public class myJob extends Job{

        public  myJob(Date date){
            super(date);
        }

        @Override
        public void run() {

        }
    }

    @Test
    public void should_exclude_seconds_from_date(){
        Job job = new myJob(Date.from(Instant.now()));
        Assert.assertTrue(job.getScheduledTime().getSeconds() == 0);
    }
}
