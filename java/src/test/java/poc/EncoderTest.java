package poc;

import org.junit.Test;
import sun.jvm.hotspot.utilities.Assert;

import javax.swing.text.html.Option;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EncoderTest {

    @Test
    public void test(){
        String hash = Encoder.base62Encode(9999);

        Assert.that( hash.length() > 0, "hash should not be empty");

        List<String> list = new ArrayList<>();
        //Assert.that(list.get(-1) == null, "");
        Object obj = null;

        String s = null;
        String s1 = null;

        if(Optional.ofNullable(s).equals(s1)){
            System.out.println("strings are equal");
        }

        //list.stream().filter(e -> e.length() > 2).map(e -> e);
        //int a = Optional.of(obj).map(e -> e.hashCode()).orElse(1);


        //LocalDateTime minTime = ZonedDateTime.parse("1900-01-01T00:00:00.000Z").toLocalDateTime();
    }
}
