package problemsolving.interview;

import java.util.HashSet;
import java.util.Set;

public class SmallestPositiveInteger {

    public int solution(int[] A) {

        Set<Integer> set = new HashSet<>();
        int max = 0;
        for (int j : A) {
            if (!set.contains(j)) {
                set.add(j);
                max = Math.max(max, j);
            }
        }

        for (int i = 1; i < max; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return max + 1;
    }
}
