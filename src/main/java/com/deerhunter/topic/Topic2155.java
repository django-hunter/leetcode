package com.deerhunter.topic;

import java.util.ArrayList;
import java.util.List;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/11 23:09
 * @see <a
 *     href="https://leetcode.cn/problems/all-divisions-with-the-highest-score-of-a-binary-array/description/"
 *     />
 */
public class Topic2155 {
    class Solution {
        public List<Integer> maxScoreIndices(int[] nums) {
            int n = nums.length;
            int[] prefix = new int[n + 1];
            for (int i = 0; i < n; i++) {
                prefix[i + 1] = prefix[i];
                if (nums[i] == 0) {
                    prefix[i + 1]++;
                }
            }

            int[] suffix = new int[n + 1];
            for (int i = n - 1; i >= 0; i--) {
                suffix[i] = suffix[i + 1];
                if (nums[i] == 1) {
                    suffix[i]++;
                }
            }
            int max = 0;
            for (int i = 0; i <= n; i++) {
                if (prefix[i] + suffix[i] > max) {
                    max = prefix[i] + suffix[i];
                }
            }

            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i <= n; i++) {
                if (prefix[i] + suffix[i] == max) {
                    ans.add(i);
                }
            }
            return ans;
        }
    }
}
