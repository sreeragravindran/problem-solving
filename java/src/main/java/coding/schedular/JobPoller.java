package coding.schedular;

public class JobPoller {

    private ScheduledJobs scheduledJobs;

    Executor executor;
    // polls for the jobs and give it to executor
    public JobPoller(ScheduledJobs scheduledJobs, Executor executor){
       // startPolling();
    }

    private void startPolling(){
        // run on a seprate thread
        // when it is time
//        executor.execute();
    }
}
