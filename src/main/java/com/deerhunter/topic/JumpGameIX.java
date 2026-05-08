package com.deerhunter.topic;

import java.util.Deque;
import java.util.LinkedList;

/**
 * <a href="https://leetcode.cn/problems/jump-game-ix/"></a>
 *
 * @author Django
 * @since 2026/5/8 22:59
 */
public class JumpGameIX {
    // 区间分治
    public static class Solution1 {
        public int[] maxValue(int[] nums) {
            int n = nums.length;

            int[] prefixMaxIndices = new int[n + 1];
            int maxIndex = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] > nums[maxIndex]) {
                    maxIndex = i;
                }
                prefixMaxIndices[i + 1] = maxIndex;
            }

            int[] ans = new int[n];
            dfs(nums, prefixMaxIndices, ans, n, Integer.MAX_VALUE);
            return ans;
        }

        private void dfs(int[] nums, int[] prefixMaxIndice, int[] ans, int right, int rightMin) {
            if (right <= 0) {
                return;
            }
            int maxIndex = prefixMaxIndice[right];
            int maxValue = nums[maxIndex];
            if (nums[maxIndex] > rightMin) {
                maxValue = ans[right];
            }
            for (int i = maxIndex; i < right; i++) {
                if (nums[i] < rightMin) {
                    rightMin = nums[i];
                }
                ans[i] = maxValue;
            }

            dfs(nums, prefixMaxIndice, ans, maxIndex, rightMin);
        }
    }

    // 单调栈
    public static class Solution2 {
        public int[] maxValue(int[] nums) {
            Deque<Item> stack = new LinkedList<>();
            int n = nums.length;
            for (int i = 0; i < n; i++) {
                int value = nums[i];
                int max = value;
                int left = i;
                while (!stack.isEmpty() && stack.peekLast().max() > value) {
                    Item item = stack.removeLast();
                    max = Math.max(max, item.max());
                    left = item.left;
                }
                stack.addLast(new Item(left, i, max));
            }

            int[] ans = new int[n];
            while (!stack.isEmpty()) {
                Item item = stack.removeFirst();
                for (int i = item.left; i <= item.right; i++) {
                    ans[i] = item.max;
                }
            }
            return ans;
        }

        record Item(int left, int right, int max) {}
    }
}
