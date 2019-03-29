package ProblemSolving.arrays.LastNLogs;


/*
    You run an e-commerce website and want to record the last N order ids in a log.
    Implement a data structure to accomplish this, with the following API:

        record(order_id): adds the order_id to the log

        get_last(i): gets the ith last element from the log. i is guaranteed to be smaller than or equal to N.

    You should be as efficient with time and space as possible.
 */

import com.google.common.base.Preconditions;

public class Logger implements ILogger {

    private String[] logs; // circular array

    private int currentPoistion = 0;
    private int totalCount = 0;
    private int logSize;

    public Logger(int logSize){
        this.logSize = logSize;
        logs = new String[logSize];
    }

    /***
     * records the order in the logs
     * not thread safe
     * @param orderId
     */
    public void record(String orderId){
        logs[getCurrentPoistion()] = orderId;

        incrementCurrentPoistion();
        incrementTotalCount();
    }

    private void incrementCurrentPoistion(){
        currentPoistion++;
    }

    private void incrementTotalCount(){
        totalCount++;
    }

    private int getCurrentPoistion(){
        if ( currentPoistion == logSize){ // if the log capacity is full, start over-writing from the beginning
            currentPoistion = 0;
        }
        return currentPoistion;
    }

    public String getLast(int i){

        // boundary conditions
        Preconditions.checkArgument(i <= logs.length, "not more than " + logs.length + " logs can be stored.");
        Preconditions.checkArgument(i <= totalCount, "only "+ totalCount +" logs exist.");
        Preconditions.checkArgument(i > 0, "invalid input");

        return logs[getPositionOfLast(i) - 1];
    }

    private int getPositionOfLast(int i){
        int targetPosition = (totalCount - (i - 1)) % logSize;
        return targetPosition == 0 ? logSize : targetPosition;
    }
}
