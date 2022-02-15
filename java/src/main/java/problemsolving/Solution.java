package problemsolving;

class Solution {
    public boolean solution(String S, String T) {
        // write your code in Java SE 8
        // construct the decoded string with
        S = getDecodedString(S);
        T = getDecodedString(T);

        System.out.println(S);
        System.out.printf(T);
        return areEqual(S, T);
    }

    private String getDecodedString(String s) {
        StringBuilder output = new StringBuilder();
        for (char c : s.toCharArray()) {
            if (Character.isDigit(c)) {
                for (int i = 0; i < Integer.parseInt(String.valueOf(c)); i++) {
                    output.append("?");
                }
            } else {
                output.append(c);
            }
        }
        return output.toString();
    }

    private boolean areEqual(String S, String T) {
        if (S.length() != T.length()) {
            return false;
        }

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) != '?' && T.charAt(i) != '?') {
                if (S.charAt(i) != T.charAt(i)) {
                    return false;
                }
            }
        }
        return true;
    }
}
