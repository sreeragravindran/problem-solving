package coding.threading.deadlock;

public class Main {
    public static void main(String args[]) throws Exception {
        NonReentrantLock nreLock = new NonReentrantLock();

        // First locking would be successful
        nreLock.lock();
        System.out.println(" Acquired first lock");

//        nreLock.lock();
//        System.out.println("Acquired second lock"); // never gets here

        Thread t2 = new Thread() {
            @Override
            public void run() {
                try {
                    // Second locking results in a self deadlock
                    System.out.println("t2 Trying to acquire lock");
                    nreLock.lock();
                } catch(InterruptedException ignored) {
                }

            }
        };


        Thread t3 = new Thread() {
            @Override
            public void run() {
                try {
                    // Second locking results in a self deadlock
                    System.out.println("t3 Trying to acquire lock");
                    nreLock.lock();
                } catch(InterruptedException ignored) {
                }

            }
        };

        t2.start();
        t3.start();

        System.out.println("Acquired second lock");
    }
}
