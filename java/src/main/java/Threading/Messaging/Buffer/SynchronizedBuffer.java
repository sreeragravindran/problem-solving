package Threading.Messaging.Buffer;

public class SynchronizedBuffer implements Buffer {

    private int buffer = -1;

    private boolean occupied = false;

    @Override
    public synchronized void put(int value) throws InterruptedException {
        while(occupied){
            System.out.println("Producer tries to write, buffer full. Producer waits.");
            wait();
        }
        buffer = value;
        occupied = true;
        displayState("Producer writes " + buffer);
        notifyAll();
    }

    @Override
    public synchronized int get() throws  InterruptedException{
        while(!occupied){
            System.out.println("Consumer tries to read, buffer empty. Consumer waits.");
            wait();
        }

        occupied = false;
        displayState("Consumer reads " + buffer);
        notifyAll();
        return buffer;
    }

    private synchronized  void displayState(String operation){
        System.out.printf("%-40s%d\t\t%b%n%n", operation, buffer, occupied);
    }
}
