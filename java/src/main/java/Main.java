import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args){
//        PowersOf2 powersOf2 = new PowersOf2(50);
//        //powersOf2.print();
//        powersOf2.printUsingRecursion(0);

        String patternString = "[0-9a-f]{8}-[0-9a-f]{4}-[34][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}";
        Pattern pattern = Pattern.compile(patternString);

        boolean matches = pattern.matcher("9b30e4a-4f36-4930-8aa7-fb664df2989f").matches();

        System.out.println(matches);

    }
}
