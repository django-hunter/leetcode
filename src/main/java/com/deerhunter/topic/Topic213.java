package com.deerhunter.topic;

/**
 * 213. House Robber II
 * Medium
 * <p>
 * 2635
 * <p>
 * 62
 * <p>
 * Add to List
 * <p>
 * Share
 * You are a professional robber planning to rob houses along a street. Each house has a certain amount of money stashed. All houses at this place are arranged in a circle. That means the first house is the neighbor of the last one. Meanwhile, adjacent houses have a security system connected, and it will automatically contact the police if two adjacent houses were broken into on the same night.
 * <p>
 * Given a list of non-negative integers nums representing the amount of money of each house, return the maximum amount of money you can rob tonight without alerting the police.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [2,3,2]
 * Output: 3
 * Explanation: You cannot rob house 1 (money = 2) and then rob house 3 (money = 2), because they are adjacent houses.
 * Example 2:
 * <p>
 * Input: nums = [1,2,3,1]
 * Output: 4
 * Explanation: Rob house 1 (money = 1) and then rob house 3 (money = 3).
 * Total amount you can rob = 1 + 3 = 4.
 * Example 3:
 * <p>
 * Input: nums = [0]
 * Output: 0
 * <p>
 * <p>
 * Constraints:
 * <p>
 * 1 <= nums.length <= 100
 * 0 <= nums[i] <= 1000
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/2/24 17:39
 */
public class Topic213 {
    /**
     * 动态规划
     */
    public static class Solution {
        public int rob(int[] nums) {
            int n = nums.length;
            if (n == 1) {
                return nums[0];
            }
            return Math.max(rob(nums, 0, n - 1), rob(nums, 1, n));
        }

        private int rob(int[] nums, int left, int right) {
            int[] dp = new int[2];
            for (int i = left; i < right; i++) {
                int temp = dp[0];
                dp[0] = Math.max(dp[0], dp[1]);
                dp[1] = temp + nums[i];
            }
            return Math.max(dp[0], dp[1]);
        }
    }
}
