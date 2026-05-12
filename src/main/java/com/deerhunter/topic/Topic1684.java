package com.deerhunter.topic;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/12 09:52
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-consistent-strings/description/"
 *     />
 */
public class Topic1684 {
    class Solution {
        public int countConsistentStrings(String allowed, String[] words) {
            boolean[] dict = new boolean[26];
            for (char c : allowed.toCharArray()) {
                dict[c - 'a'] = true;
            }
            int ans = 0;
            for (String word : words) {
                boolean valid = true;
                for (char c : word.toCharArray()) {
                    if (!dict[c - 'a']) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans++;
                }
            }

            return ans;
        }
    }
}
