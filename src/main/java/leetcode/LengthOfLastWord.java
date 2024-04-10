package leetcode;

/*
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.

58. Length of Last Word                       https://www.youtube.com/watch?v=Kev5TpsfKT4

 */

import java.util.regex.Pattern;

public class LengthOfLastWord {

    public int determine(String s) {
        s = s.trim();
        int spaceIndex = -1;

        for (var i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                spaceIndex = i;
            }
        }
        return s.length() - spaceIndex - 1;
    }

    public int determineWithoutTrim(String s) {
        var right = s.length() - 1;
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        var left = right;
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }
        return right - left;
    }

    public static final Pattern PATTERN = Pattern.compile("\\w+(?=\\s*$)");

    public int determineUsingRegex(String s) {
        var matcher = PATTERN.matcher(s);
        matcher.find();
        return matcher.end() - matcher.start();
    }
}












