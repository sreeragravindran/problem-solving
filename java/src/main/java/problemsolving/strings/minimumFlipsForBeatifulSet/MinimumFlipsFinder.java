package problemsolving.strings.minimumFlipsForBeatifulSet;

/*
    Given a set of coins in any arrangement, find the minimum number of flips to arrange it in a beautiful set.
    Each coin has 2 side ( H (head) & T(Tail) ) and can be flipped.
    A beautiful set is one in which all Head facing ones are arranged first, followed by Tail facing ones.
    All Heads / Tails is also a beautiful set.
    Example of beautiful set : HHTTT HTTTT etc.

    Consider 0(heads) and 1(tails) for the sake of the program.

Solution:
For given input : 010001
find flips required to get to the set of all 1s.
111111 = 4 flips required to get this valid set

011111
  - with index 0 flipped to 0, value at index 0 is same as the original value in the same position, it will take 1 flip LESS than what was required for previous set
  - hence, 3 flips
001111
  - with index 1 flipped to 0, value at index 1 is NOT the same as the original value in the same position, it will take 1 flip MORE than what was required for previous set
  - hence, 4 flips
000111
  - with index 2 flipped to 0, value at index 2 is same as the original value in the same position, it will take 1 flip LESS than what was required for previous set
  - hence, 3 flips
000011
  - with index 3 flipped to 0, value at index 2 is same as the original value in the same position, it will take 1 flip LESS than what was required for previous set
  - hence, 2 flips
000001
  - with index 4 flipped to 0, value at index 4 is same as the original value in the same position, it will take 1 flip LESS than what was required for previous set
  - hence, 1 flips
000000
  - with index 5 flipped to 0, value at index 5 is NOT ame as the original value in the same position, it will take 1 flip MORE than what was required for previous set
  - hence, 2 flips

 Minimum of all the flips required to get any of the above valid beautiful set is 1 .
 */
public class MinimumFlipsFinder {
    public static int findMinimumFlips(String input) {
        char[] validSet = new char[input.length()];
        int min = Integer.MAX_VALUE;
        // start with the valid set of all 1s
        int previousValue = 0;
        for (int i = 0; i < input.length(); i++) {
            validSet[i] = '1';
            // find flips required to get to the above set ( all 1s )
            if (validSet[i] != input.charAt(i)) {
                previousValue++;
            }
        }

        min = previousValue;
        // for all other valid sets
        for (int i = 0; i < input.length(); i++) {
            validSet[i] = '0';
            if (input.charAt(i) == validSet[i]) {
                previousValue = previousValue - 1;
            } else {
                previousValue = previousValue + 1;
            }
            min = Math.min(min, previousValue);
        }

        return min;
    }
}
