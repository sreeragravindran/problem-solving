package problemsolving.strings;

import java.util.LinkedList;
import java.util.List;

/*

Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent.

A mapping of digit to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.

Input: "23"
Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].

 */
public class PossibleLetterCombinations {
    private String[] _letterMap;

    public PossibleLetterCombinations() {
        this._letterMap = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    }

    /*

        Space Complexity : m ^ n where m is letters mapped to digit, n is the number of digits in the input

     */
    public List<String> get(String digits) {
        if (digits.length() == 0) {
            return null;
        }
        LinkedList<String> output = new LinkedList<>();
        output.add("");

        for (int i = 0; i < digits.length(); i++) {
            while (output.peek().length() == i) {
                String temp = output.remove();
                int digit = Integer.parseInt(String.valueOf(digits.charAt(i)));
                for (char c : _letterMap[digit].toCharArray())
                    output.add(temp + c);
            }
        }
        return output;
    }
}


