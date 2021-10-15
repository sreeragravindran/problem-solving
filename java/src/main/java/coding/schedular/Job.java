package coding.schedular;

import java.util.Date;
import java.util.UUID;

public abstract class Job {

    private String id;

    private Date scheduledTime;

    protected Job(Date scheduledTime){
        this.id = UUID.randomUUID().toString();
        // exclude seconds from the time
        scheduledTime.setSeconds(0);
        this.scheduledTime = scheduledTime;
    }

    public Date getScheduledTime(){
        return scheduledTime;
    }

    public abstract void run();
}
