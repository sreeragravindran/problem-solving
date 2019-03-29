package Threading.Messaging;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService  executor = Executors.newCachedThreadPool();

        Buffer sharedLocation = new UnsynchronizedBuffer();

        executor.execute(new Producer(sharedLocation));
        executor.execute(new Consumer(sharedLocation));

        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
    }
}
