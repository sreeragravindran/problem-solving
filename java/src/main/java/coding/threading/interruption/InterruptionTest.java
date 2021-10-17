package coding.threading.interruption;

import java.util.concurrent.*;

public class InterruptionTest {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future printNumbers = executor.submit(new PrintNumbers());

//        Thread.sleep(3000);
//        printNumbers.cancel(true);

        executor.shutdown();
        executor.awaitTermination(100000, TimeUnit.MILLISECONDS);
        System.out.printf("main thread terminated !");
    }
}
