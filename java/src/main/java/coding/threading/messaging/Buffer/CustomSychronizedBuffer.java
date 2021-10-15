package coding.threading.messaging.Buffer;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CustomSychronizedBuffer implements  Buffer{

    private final Lock accessLock = new ReentrantLock();
    private Condition canWrite = accessLock.newCondition();
    private Condition canRead = accessLock.newCondition();

    private int buffer = -1;
    private boolean occupied = false;

    @Override
    public void put(int value) throws InterruptedException {

        try {
            // acquires lock on the object
            accessLock.lock();
            while(occupied){
                System.out.println("Producer tries to write, buffer full. Producer waits.");
                // the thread goes in to wait state on canWrite condition
                // this makes sure the thread releases the lock on this object
                // also re-acquires the lock when notified to continue
                canWrite.await();
            }

            buffer = value;
            occupied = true;

            displayState("Producer writes " + buffer);
            // signals all threads waiting on canRead condition to get ready to continue execution
            canRead.signalAll();
        }
        finally {
            accessLock.unlock();
        }

    }

    @Override
    public int get() throws  InterruptedException{

        try{
            accessLock.lock();
            while(!occupied){
                System.out.println("Consumer tries to read, buffer empty. Consumer waits.");
                canRead.await();
            }
            occupied = false;
            displayState("Consumer reads " + buffer);
            canWrite.signalAll();
            return buffer;
        }
        finally{
            accessLock.unlock();
        }
    }

    private synchronized  void displayState(String operation){
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
}
