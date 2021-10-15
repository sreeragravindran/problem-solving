package coding.threading;

import coding.threading.threadpool.ThreadPool;
import org.junit.Test;

public class ThreadPoolTest {

    @Test
    public void testThreadPool() throws Exception {

        /*
         create a thread pool of 2 threads
         execute 5 tasks
         */

        ThreadPool threadPool = new ThreadPool(2, 3);

        threadPool.execute(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                System.out.println("Task 1: interrupted");
//            }
            System.out.println("Task 1: executed");
        });

        threadPool.execute(() -> {
//            try {
//                Thread.sleep(2000);
//            } catch (InterruptedException ex) {
//                System.out.println("Task 2: interrupted");
//            }
            System.out.println("Task 2: executed");
        });

        threadPool.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 3: executed");
            } catch (InterruptedException ex) {
                System.out.println("Task 3: interrupted");
            }
        });

        threadPool.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 4: executed");
            } catch (InterruptedException ex) {
                System.out.println("Task 4: interrupted");
            }
        });

        threadPool.execute(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Task 5: executed");
            } catch (InterruptedException ex) {
                System.out.println("Task 5: interrupted");
            }
        });

        Thread.sleep(2000);
        threadPool.stop();
    }
}
