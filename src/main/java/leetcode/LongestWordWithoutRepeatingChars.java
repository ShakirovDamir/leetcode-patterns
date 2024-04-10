package leetcode;

/*
Given a string s, find the length of the longest substring without repeating characters.

3. Longest Substring Without Repeating Characters https://www.youtube.com/watch?v=Jj66XXja4LY

 */

import java.util.HashSet;
import java.util.Set;

public class LongestWordWithoutRepeatingChars {

    public int determine(String s) {
        int left = 0;
        int right = 0;
        int max = 0;

        var chars = s.toCharArray();

        Set set = new HashSet();

        while (right < chars.length) {
            if (set.contains(chars[right])) {
                set.remove(chars[left]);
                left++;
            } else {
                set.add(chars[right]);
                right++;
                max = Math.max(max, set.size());
            }
        }
        return max;
    }
}
