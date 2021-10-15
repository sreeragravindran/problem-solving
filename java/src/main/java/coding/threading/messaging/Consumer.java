package coding.threading.messaging;

import coding.threading.messaging.Buffer.Buffer;

import java.security.SecureRandom;

public class Consumer implements  Runnable{

    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;

    public Consumer(Buffer sharedLocation){
        this.sharedLocation = sharedLocation;
    }

    @Override
    public void run() {
        int sum = 0;
        for(int count = 1; count <= 10; count++){
            try
            {
                Thread.sleep(generator.nextInt(3000));
                sum  += sharedLocation.get();
                //System.out.printf("\t\t\t%2d%n",sum);
            }
            catch (InterruptedException ex)
            {
                System.out.printf("%S%n", "Consumer was interrupted ");
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("%n%s %d%n%s%n",
                "Consumer read values totaling", sum, "Terminating Consumer");
    }
}
