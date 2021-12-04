package poc;

import java.util.concurrent.Semaphore;

public class SemaphoreTest {

    static Semaphore semaphore = new Semaphore(0);

    public static void main(String[] args) throws InterruptedException {

        var t1 = new Thread(() -> {
            try {
                acquire();
                System.out.println("T1 acquired semaphore");
                System.out.println("T1 : available permits after acquire: " + semaphore.availablePermits());
            } catch (InterruptedException ex) {
            }
        }, "T1");

        var t2 = new Thread(() -> {
            System.out.println("T2 : available permits before release: " + semaphore.availablePermits());
            release();
            System.out.println("T2 : available permits after release: " + semaphore.availablePermits());
        }, "T2");

        t1.start();
        Thread.sleep(1000);
        t2.start();
        t1.join();
        t2.join();

    }

    public static void acquire() throws InterruptedException {
        semaphore.acquire();
    }

    public static void release() {
        semaphore.release(3);
    }
}
