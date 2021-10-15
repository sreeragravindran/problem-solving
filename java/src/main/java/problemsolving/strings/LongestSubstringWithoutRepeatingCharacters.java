package problemsolving.strings;

//
/*
https://leetcode.com/problems/longest-substring-without-repeating-characters/
Given a string, find the length of the longest substring without repeating characters.

Example 1:

Input: "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: "p wkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
             Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
 */
public class LongestSubstringWithoutRepeatingCharacters {

    public int find(String inputString){
        char[] input = inputString.toCharArray();
        int left =0, recon =0, right = input.length -1;

        while(left < right || recon < right){
            if(input[left] == input[right]){
                left = left + 1;
                if(recon <= left){
                    recon = left;
                }
                continue;
            }
            if(input[recon] == input[right]){
                right = right - 1;
                continue;
            }
            if(recon > left && input[recon] == input[left]){
                left = left + 1;
                continue;
            }
            recon = left + 1;
        }
        return right - left + 1;
    }
}
