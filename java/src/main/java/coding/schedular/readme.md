/*

In-memory Job Scheduler (library)

requirements 
1. Should be able to schedule a job  
2. Should limit the numbers of jobs scheduled in parallel  
3. parallelism is tunable by client 
 
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
