package problemsolving.strings.validCouponCode;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ValidateCouponCodeTest {

    @Test
    public void test() {
        List<String> coupons = new ArrayList<>();
        coupons.add("abba");
        coupons.add("abc");
        coupons.add("abbabaab");
        coupons.add("baababba");

        CouponCodeValidator validator = new CouponCodeValidator();
        List<Integer> result = validator.findValidDiscountCoupons(coupons);

        Assert.assertEquals(1, (int) result.get(0));
        Assert.assertEquals(0, (int) result.get(1));
        Assert.assertEquals(1, (int) result.get(2));
        Assert.assertEquals(1, (int) result.get(3));
    }

}