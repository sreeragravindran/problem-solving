package Threading.Messaging.Buffer;

public interface Buffer {

    public void put(int value) throws InterruptedException;

    public int get() throws InterruptedException;

}
