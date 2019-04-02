package Threading.Messaging.Buffer;

import Threading.Messaging.Buffer.Buffer;

/*

UnsynchronizedBuffer maintains a shared buffer accessed by both Producer and Consumer
 */
public class UnsynchronizedBuffer implements Buffer {

    private int buffer = -1;

    public void put(int value) throws InterruptedException {
        buffer = value;
    }

    public int get() throws InterruptedException {
        return buffer;
    }

}
