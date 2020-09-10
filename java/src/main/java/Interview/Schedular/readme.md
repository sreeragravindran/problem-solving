/*

In-memory Job Scheduler (library)

1. Runs a job at a given point of time
2. Parallelism is tunable by client

    number of the jobs running in parallel 
    each job runs sequentially underneath 
*/

JobSchedular {
    
    maxJobs; 
    
    
    
    /* 
    
    10:45 - 5 jobs 
    10.46 - 3 
    
    */
    
    queue<Job> runningJobs; 
    
    Map<time, Job> scheduledJobs; 
    
    add(Job){
        // 
    }
    
    schedule(Job job) {
        /* 
        check if the capacity if full for that minute. 
        if full, 
         throw 
        else 
            put in the queue 
        */
    }
    
    pollForJobs(){
        // look for job at that minute 
        
        
    }    
}

Job {
    
    run(){
        
    }
    
    time;
    
}


jobScheduler.schedule(Job())
