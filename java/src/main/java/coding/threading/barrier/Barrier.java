package coding.threading.barrier;

class Barrier {

    int count = 0;
    int totalThreads;
    int released = 0;

    public Barrier(int totalThreads) {
        this.totalThreads = totalThreads;
    }

    public synchronized void await() throws InterruptedException {

        // block any new threads from proceeding till,
        // all threads from previous barrier are released
        while(count == totalThreads) {
            System.out.println(Thread.currentThread().getName() + " is waiting for existing queue to clear");
            wait();
        }

        // increment the counter whenever a thread arrives at the barrier
        System.out.println("Thread " + Thread.currentThread().getName() + " arrived at the barrier");
        count++;

        if (count == totalThreads) {
            // wake up all the threads in the barrier
            notifyAll();
            released = totalThreads;
        } else {
            // wait till the capacity threads reach the barrier
            // if the waiting threads are spuriously woken up, they shouldn't be let through, hence the while loop
            while(count < totalThreads) {
                wait();
            }
        }
        released--;
        if(released == 0) {
            // reset the count to 0 if the outgoing thread is the last in the current barrier
            count = 0;
            // notify threads waiting at the new barrier ( line #18 )
            notifyAll();
        }

        System.out.println("Thread " + Thread.currentThread().getName() + " went past the barrier");
    }

    public static void runTest() throws InterruptedException {
        final Barrier barrier = new Barrier(3);

        Thread p1 = new Thread(new Runnable() {
            public void run() {
                try {
                    barrier.await();
                    barrier.await();
                    barrier.await();
                } catch (InterruptedException ie) {
                }
            }
        });
        p1.setName("t1");

        Thread p2 = new Thread(new Runnable() {
            public void run() {
                try {
                    Thread.sleep(500);
                    barrier.await();
                    Thread.sleep(500);
                    barrier.await();
                    Thread.sleep(500);
                    barrier.await();
                } catch (InterruptedException ie) {
                }
            }
        });
        p2.setName("t2");

        Thread p3 = new Thread(new Runnable() {
            public void run() {
                try {
                    barrier.await();
                    barrier.await();
                    barrier.await();
                } catch (InterruptedException ie) {
                }
            }
        });
        p3.setName("t3");

        p1.start();
        p2.start();
        p3.start();

        p1.join();
        p2.join();
        p3.join();
    }
}