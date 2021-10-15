package coding.schedular;

import java.util.*;

public class JobSchedular implements Executor {

    //todo: schedular should be a singleton
    private static JobSchedular INSTANCE;

    private int capacity;

    private ScheduledJobs scheduledJobs;

    private JobPoller jobPoller;

    private JobSchedular(int capacity){
        this.capacity = capacity;
        this.scheduledJobs = new ScheduledJobs();
        this.jobPoller = new JobPoller(scheduledJobs, this);

        // start polling on a new thread

//        ExecutorService executorService = new
//        }
    }

    public synchronized JobSchedular getInstance(int capacity){
        if(INSTANCE == null){
            INSTANCE = new JobSchedular(capacity);
        }
        return INSTANCE;
    }

    /* add jobs to be scheduled */
    public void schedule(Job job){
        // should be scheduled in future time


        // validate if capacity is full
        if(isFullFor(job.getScheduledTime())){
            throw new CapacityOverflowException("capacity is full for the time, please try another slot");
        }

        // schedule the job
        scheduledJobs.add(job);
    }


    private boolean isFullFor(Date date){
        // full if scheduled jobs for date is equal to capacity
        return (scheduledJobs.getJobCount(date) == capacity);
    }

//    /* poll for jobs every minute */
//    public void pollForJobs(){
//        // has to poll for job, pick it up and run it
//        // this has to be running on a seprate thread
//        //jobPoller.
//    }

    // run the job,
    // on completion needs to be removed from the scheduled list
    @Override
    public void execute(Job job) {
        job.run(); // assuming job is sychronous;
        scheduledJobs.remove(job);
    }
}
