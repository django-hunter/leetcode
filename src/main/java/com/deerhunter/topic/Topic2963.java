package com.deerhunter.topic;

import java.util.HashMap;
import java.util.Map;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/13 10:49
 * @see <a href="https://leetcode.cn/problems/count-the-number-of-good-partitions/description/" />
 */
public class Topic2963 {
    class Solution {
        public int numberOfGoodPartitions(int[] nums) {
            Map<Integer, Integer> maxIndices = new HashMap<>();
            for (int i = 0; i < nums.length; i++) {
                maxIndices.put(nums[i], i);
            }

            int right = 0;

            int ans = 1;
            for (int i = 0; i < nums.length - 1; i++) {
                right = Math.max(right, maxIndices.get(nums[i]));
                if (right == i) {
                    ans = (ans << 1) % 1_000_000_007;
                }
            }
            return ans;
        }
    }
}
