package poc;

import org.junit.Test;

public class StringSplitTest {

    @Test
    public void should_split_with_multiple_delimiters() {
        String text ="ISTANBUL AND NEW YORK AND PARIS OR TOKYO AND MOSCOW";
        String[] cities = text.split("AND|OR");

        for(String city : cities){
            System.out.println(city);
        }
    }
}
