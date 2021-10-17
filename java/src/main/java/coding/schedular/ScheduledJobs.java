package coding.schedular;

/* an abstraction to hold schduled jobs */


import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ScheduledJobs {

    private Map<Date, List<Job>> scheduledJobs;

    public ScheduledJobs() {
        scheduledJobs = new ConcurrentHashMap<>();
    }

    public synchronized void add(Job job) {
        if (scheduledJobs.get(job.getScheduledTime()) == null) {
            List<Job> newJob = new ArrayList<>();
            newJob.add(job);
            scheduledJobs.put(job.getScheduledTime(), newJob);
        } else {
            List<Job> jobs = scheduledJobs.get(job.getScheduledTime());
            jobs.add(job);
        }
    }

    public Optional<List<Job>> getJobs(Date date) {
        if (scheduledJobs.get(date) == null) {
            return Optional.empty();
        }
        return Optional.of(scheduledJobs.get(date));
    }

    public int getJobCount(Date date) {
        Optional<List<Job>> jobs = getJobs(date);
        if (jobs.isPresent()) {
            return jobs.get().size();
        }
        return 0;
    }

    public void remove(Job job) {
        Optional<List<Job>> jobs = getJobs(job.getScheduledTime());
        if (jobs.isPresent()) {
            // remove from the list

        }
    }
}
