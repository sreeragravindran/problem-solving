package problemsolving.strings.mininumLengthSubstring;

import java.util.HashMap;
import java.util.Map;


/**
 * this is minimum sliding window problem
 */

public class Solution {

    // Add any helper functions you may need here
    public static Map<Character, Integer> createMap(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            } else {
                map.put(s.charAt(i), 1);
            }
        }
        return map;
    }


    public static boolean contains(
            Map<Character, Integer> superset,
            Map<Character, Integer> subset) {

        for (Character key : subset.keySet()) {
            if (!superset.containsKey(key) || !superset.get(key).equals(subset.get(key))) {
                return false;
            }
        }
        return true;
    }

    public static int minLengthSubstring(String s, String t) {
        // Write your code here
        int leftIndex = 0;
        int rightIndex = t.length() - 1;
        int minimumWindow = Integer.MAX_VALUE;

        Map<Character, Integer> t_map = createMap(t);
        Map<Character, Integer> supersetMap = createMap(s.substring(leftIndex, t.length()));

        while (rightIndex < s.length() && (rightIndex - leftIndex + 1) >= t.length()) {
            if (contains(supersetMap, t_map)) {
                if (minimumWindow > (rightIndex - leftIndex + 1)) {
                    minimumWindow = (rightIndex - leftIndex + 1);
                }
                int value = supersetMap.get(s.charAt(leftIndex));
                if (value > 1) {
                    supersetMap.put(s.charAt(leftIndex), value - 1);
                } else {
                    supersetMap.remove(s.charAt(leftIndex));
                }
                leftIndex++;
            } else {
                rightIndex++;
                if (rightIndex < s.length()) {
                    if (supersetMap.containsKey(s.charAt(rightIndex))) {
                        supersetMap.put(s.charAt(rightIndex), supersetMap.get(s.charAt(rightIndex)) + 1);
                    } else {
                        supersetMap.put(s.charAt(rightIndex), 1);
                    }
                }
            }
        }

        return minimumWindow == Integer.MAX_VALUE ? -1 : minimumWindow;
    }
}
