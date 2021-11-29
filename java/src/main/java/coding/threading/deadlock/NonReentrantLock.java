package coding.threading.deadlock;

import java.util.concurrent.locks.ReentrantLock;

public class NonReentrantLock {
//    ReentrantLock lock;
    boolean isLocked;

    public NonReentrantLock() {
        isLocked = false;
    }

    public synchronized void lock() throws InterruptedException {
        System.out.println("entered lock method");
        while (isLocked) {
            System.out.println("object is already locked, please wait..");
            wait(); // OS releases the thread from CPU - thread is in waiting state
        }
        isLocked = true;
    }

    public synchronized void unlock() {
        isLocked = false;
        notify();
    }
}
