package coding.schedular;

public class CapacityOverflowException extends RuntimeException{

    public CapacityOverflowException(String message){
        super(message);
    }
}
