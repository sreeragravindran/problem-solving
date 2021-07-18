package ProblemSolving.strings.promotionWinner;

import java.util.Arrays;
import java.util.List;

public class Result {

    /*
     * Complete the 'foo' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. STRING_ARRAY codeList
     *  2. STRING_ARRAY shoppingCart
     */
    private static int index = 0;
    private static String anything = "anything";
    public static int getResult(List<String> codeList, List<String> shoppingCart) {

        System.out.println("codeList");
        codeList.forEach(i -> System.out.println(i));

        System.out.println("shoppingCart");
        shoppingCart.forEach(i -> System.out.println(i));

        System.out.println("---------------");
        // Write your code here

        if(codeList == null || codeList.size() == 0 ){
            return 1;
        }

        for(String code : codeList) {
            List<String> codeGroup = Arrays.asList(code.split(" "));
            if(!searchCodeGroup(shoppingCart, codeGroup)) {
                return 0;
            }
        }

        return 1;
    }

    public static boolean searchCodeGroup(List<String> shoppingCart, List<String> codeGroup) {

        System.out.println("---------------");

        System.out.println("code Group ");
        codeGroup.forEach(i -> System.out.println(i));

        System.out.println("shoppingCart");
        shoppingCart.forEach(i -> System.out.println(i));
        System.out.println("index " + index);
        System.out.println("---------------");


        //int targetSize = codeGroup.size();
        while(index < shoppingCart.size()) {
            if(shoppingCart.get(index).equals(codeGroup.get(0)) || codeGroup.get(0).equals(anything)) {
                int tempIndex = index;
                int codeGroupIndex = 0;

                // found a match with the start of the group
                while( tempIndex < shoppingCart.size() && tempIndex <= index + codeGroup.size() - 1) {
                    if(shoppingCart.get(tempIndex).equals(codeGroup.get(codeGroupIndex)) || codeGroup.get(codeGroupIndex).equals(anything)) {
                        codeGroupIndex ++;
                    }
                    else {
                        return false;
                    }
                    tempIndex++;
                }

                if(codeGroupIndex == codeGroup.size()) {
                    index = index + codeGroupIndex;
                    return true;
                }
            }
            index++;
        }

        return false;
    }

}
