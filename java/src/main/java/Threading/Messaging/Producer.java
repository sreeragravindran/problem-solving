package Threading.Messaging;

import Threading.Messaging.Buffer.Buffer;

import java.security.SecureRandom;

public class Producer implements Runnable {

    private static final SecureRandom generator = new SecureRandom();
    private final Buffer sharedLocation;

    public Producer(Buffer sharedLocation){
        this.sharedLocation = sharedLocation;
    }

    // store values 1 to 10 in shared location
    public void run(){
        int sum = 0;

        for(int count=1; count <= 10; count++)
        {
            try
            { // sleep 0 to 3 seconds, then place value in buffer

                Thread.sleep(generator.nextInt(3000));
                sharedLocation.put(count);
                sum = sum + count;
                //System.out.printf("\t%2d%n", sum);
            }
            catch(InterruptedException ex)
            {
                System.out.printf("%S%n", "Producer was interrupted ");
                Thread.currentThread().interrupt();
            }
        }

        System.out.printf("Producer done producing%nTerminating Producer%n");
    }
}
