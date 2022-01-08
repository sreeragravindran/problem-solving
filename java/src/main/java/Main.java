import java.security.InvalidParameterException;
import java.util.Stack;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) throws InterruptedException {
//        PowersOf2 powersOf2 = new PowersOf2(50);
//        //powersOf2.print();
//        powersOf2.printUsingRecursion(0);

//        String patternString = "[0-9a-f]{8}-[0-9a-f]{4}-[34][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";
//        Pattern pattern = Pattern.compile(patternString);
//
//        boolean matches = pattern.matcher("9b30e4a-4f36-4930-8aa7-fb664df2989f").matches();
//
//        System.out.println(matches);

//        String val = String.format("Error while processing, Failed with error %s, pushing message to failed message topic : %s", "errorText", "failedTransactionEvent.toString()");
//        System.out.println(val);

        /*
        try {
            throw new InvalidParameterException("abb");
        } catch (InvalidParameterException ex) {
            System.out.println("caught " + ex.getClass().getCanonicalName());
//            throw ex;
        } catch (Exception ex) {
            System.out.println("caught " + ex.getClass().getCanonicalName());
            System.out.println("swallow " + ex.getClass().getCanonicalName());
        }
         */

        String rootVal = "main";
        String nestedValue = "1";
        switch (rootVal) {
            case "main":
                switch (nestedValue) {
                    case "1":
                        System.out.println("breaking out of nested switch, case 1");
                        break;
                    case "2":
                        System.out.println("breaking out of nested switch, case 2");
                        break;
                }
                System.out.println("breaking out of main switch, case main");
                break;
        }

//        Stack<Integer> s = new Stack<>();
//        s.
    }
}
