package coding.threading.interruption;

public class PrintNumbers implements  Runnable{

    @Override
    public void run() {
        for(int i=1; i<=10; i++){
            try {
                System.out.println("printing " + i);
                Thread.sleep(1000);
            } catch (InterruptedException ex){
                System.out.println("PrintNumbers is interrupted ! ");
                Thread.currentThread().interrupt();
                break;
            }
        }
    }
}
