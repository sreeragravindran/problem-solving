package poc;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.ReentrantLock;

public class ThreadLocking {

    public static void main(String[] args) throws InterruptedException {
        runTest();
    }

    private int republicans = 0;
    private int democrats = 0;

    private Semaphore demsWaiting = new Semaphore(0);
    private Semaphore repubsWaiting = new Semaphore(0);

    ReentrantLock lock = new ReentrantLock();
    CyclicBarrier barrier = new CyclicBarrier(2);

    void seatDemocrat() throws InterruptedException, BrokenBarrierException {

        boolean rideLeader = false;
        lock.lock();
        System.out.println("Thread " + Thread.currentThread().getName() + " acquire lock to critical path");
        democrats++;

        if (democrats == 2) {
            // Seat all the democrats in the Uber ride.
            demsWaiting.release(1);
            System.out.println("Thread " + Thread.currentThread().getName() + " notified waiting threads to execute");
            democrats -= 2;
            rideLeader = true;
        } else {
            lock.unlock();
            System.out.println("Thread " + Thread.currentThread().getName() + " released lock of critical path");
            System.out.println("Thread " + Thread.currentThread().getName() + " waiting to acquire semaphore.");
            demsWaiting.acquire();
            System.out.println("Thread " + Thread.currentThread().getName() + " acquired semaphore.");
        }

//        seated();
        System.out.println("Thread " + Thread.currentThread().getName() + " waiting at the barrier");
        barrier.await();
        System.out.println("Thread " + Thread.currentThread().getName() + " crossed the barrier .");
        if (rideLeader) {
//            drive();
            lock.unlock();
            System.out.println("Thread " + Thread.currentThread().getName() + " released lock of critical path");
        }
    }

    public static void runTest() throws InterruptedException {

        final ThreadLocking threadLockingTest = new ThreadLocking();
        Set<Thread> allThreads = new HashSet<Thread>();

        Thread t1 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadLockingTest.seatDemocrat();
                } catch (InterruptedException ie) {
//                    System.out.println("We have a problem");

                } catch (BrokenBarrierException bbe) {
//                    System.out.println("We have a problem");
                }
            }
        }, "t1");

        Thread t2 = new Thread(new Runnable() {
            public void run() {
                try {
                    threadLockingTest.seatDemocrat();
                } catch (InterruptedException ie) {
//                    System.out.println("We have a problem");

                } catch (BrokenBarrierException bbe) {
//                    System.out.println("We have a problem");
                }
            }
        }, "t2");

        t1.start();
        Thread.sleep(500);
        t2.start();

        t1.join();
        t2.join();
    }
}
