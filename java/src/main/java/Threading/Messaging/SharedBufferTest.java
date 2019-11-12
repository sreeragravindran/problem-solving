package Threading.Messaging;

import Threading.Messaging.Buffer.Buffer;
import Threading.Messaging.Buffer.CustomSychronizedBuffer;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SharedBufferTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService  executor = Executors.newCachedThreadPool();

        //Buffer sharedLocation = new UnsynchronizedBuffer();
        //Buffer sharedLocation = new BlockingBuffer();
        //Buffer sharedLocation = new SynchronizedBuffer();
        Buffer sharedLocation = new CustomSychronizedBuffer();

        executor.execute(new Producer(sharedLocation));
        executor.execute(new Consumer(sharedLocation));


        executor.shutdown();
        executor.awaitTermination(1, TimeUnit.MINUTES);
        executor.shutdown();
        System.out.printf("%s%n","end of main thread !");
    }
}
