package problemsolving.interview;

import org.apache.commons.lang3.StringUtils;

public class BiggestTwoDigit {

    public int solution(String S) {
        // write your code in Java SE 8
        if(StringUtils.isEmpty(S)) {
            return 0;
        }

        if (S.length() <= 2) {
            return Integer.parseInt(S);
        }
        int max = Integer.parseInt(S.substring(0, 2));
        for (int i = 1; i < S.length() - 1; i++) {
            max = Math.max(max, Integer.parseInt(S.substring(i, i + 2)));
        }

        return max;
    }
}
