package poc;

import java.math.BigDecimal;

public class Encoder {

    public static String base62Encode(Integer deci){

        String s = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ" ;

        StringBuilder hashString = new StringBuilder();

        while (deci > 0){
                hashString.append(s.charAt(deci % 62));
            deci /= 62;
        }

        return hashString.toString();
    }

}
