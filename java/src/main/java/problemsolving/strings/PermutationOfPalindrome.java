/*

check if a given string is permutation of a palindrome.
i.e input : tactcoa
    output : true ( since o appears odd number of times and all other characters appear even number of times )

    so basically if one character exists odd number of times and all other characters exist even number of times, it can form a palindrome

    assumptions:
        case sensitive
        spaces are also considered as characters
*/


package problemsolving.Strings;

import java.util.HashSet;
import java.util.Set;

public class PermutationOfPalindrome {

    public boolean isPremutationOfPalindrome(String input){
        Set<Character> set = new HashSet<Character>();
        char[] charArray = input.toCharArray();
        for(char c : charArray){
            if(set.contains(c)){
                set.remove(c);
            }else {
                set.add(c);
            }
        }

        return set.size() <= 1;
    }
}
