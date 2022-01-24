package problemsolving.strings.validCouponCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*

Input : Given a list of coupon codes
Output: return a list of valid / invalid markers ( 1 if valid, 0 if invalid )

Following are the rules for the coupon to be valid :
1. empty character is a valid coupon code
2. if A is a valid code, any character (x) added on either side of A also makes for a valid code - ie. xAx
3. if A & B are valid codes, concatenated values are valid codes as well - ie. AB, BA

examples:
Input : bb, abba, abc, dbbccd
Output: 1 ,1 , 0, 1

Explanation:
   bb
        - valid : according to rule 2, b is added to either side of empty string
   abba
        - valid : 'b' is added to either side of empty string and then 'a' is added to either side of bb
   abc
        - invalid - cant be formed with the given rules
   dbbccd
        - valid : bb is valid ( rule 2), cc is valid(rule 2 ), bbcc is valid (rule 3),  dbbccd ( rule 2 )


*  */

public class CouponCodeValidator {

    public List<Integer> findValidDiscountCoupons(List<String> coupons) {
        List<Integer> output = new ArrayList<>();
        for (String couponCode : coupons) {
            output.add(isValid(couponCode));
        }
        return output;
    }

    // remove the subsequent duplicates
    private static int isValid(String couponCode) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < couponCode.length(); i++) {
            if (stack.isEmpty()) {
                stack.push(couponCode.charAt(i));
            } else if (couponCode.charAt(i) == stack.peek()) {
                stack.pop();
            } else {
                stack.push(couponCode.charAt(i));
            }
        }
        return stack.size() > 0 ? 0 : 1;
    }

}
