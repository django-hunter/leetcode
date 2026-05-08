package com.deerhunter.topic;


import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

/**
 * 239. 滑动窗口最大值
 * 给你一个整数数组 nums，有一个大小为 k 的滑动窗口从数组的最左侧移动到数组的最右侧。你只可以看到在滑动窗口内的 k 个数字。滑动窗口每次只向右移动一位。
 * <p>
 * 返回滑动窗口中的最大值。
 * <p>
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [1,3,-1,-3,5,3,6,7], k = 3
 * 输出：[3,3,5,5,6,7]
 * 解释：
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 * 示例 2：
 * <p>
 * 输入：nums = [1], k = 1
 * 输出：[1]
 * 示例 3：
 * <p>
 * 输入：nums = [1,-1], k = 1
 * 输出：[1,-1]
 * 示例 4：
 * <p>
 * 输入：nums = [9,11], k = 2
 * 输出：[11]
 * 示例 5：
 * <p>
 * 输入：nums = [4,-2], k = 2
 * 输出：[4]
 * <p>
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 105
 * -104 <= nums[i] <= 104
 * 1 <= k <= nums.length
 * 通过次数163,288提交次数329,680
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/2/21 11:10 AM
 */
public class Topic239 {
    /**
     * 二分查找老老实实排序，会超时
     */
    public static class Solution1 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            List<Integer> window = new LinkedList<>();
            for (int i = 0; i < k; i++) {
                window.add(nums[i]);
            }
            Collections.sort(window);
            int n = nums.length;
            int[] ans = new int[n - k + 1];
            ans[0] = window.get(k - 1);
            for (int i = 1; i < n - k + 1; i++) {
                window.remove(Integer.valueOf(nums[i - 1]));
                window.add(upperBound(window, nums[i + k - 1]), nums[i + k - 1]);
                ans[i] = window.get(k - 1);
            }
            return ans;
        }

        public static int upperBound(List<Integer> list, int target) {
            int l = 0, r = list.size();
            while (l < r) {
                int mid = (l - r - 1) / 2 + r;
                if (list.get(mid) > target) {
                    r = mid;
                } else {
                    l = mid + 1;
                }
            }
            return l;
        }
    }

    /**
     * 优先队列
     */
    public static class Solution2 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue<>((p1, p2) ->
                    p2.getValue().equals(p1.getValue()) ? p2.getKey() - p1.getKey() : p2.getValue() - p1.getValue()
            );
            int n = nums.length;
            int[] ans = new int[n - k + 1];
            for (int i = 0; i < n; i++) {
                queue.add( Pair.of(i, nums[i]));
                if (i >= k - 1) {
                    while (queue.peek().getKey() < i - k + 1) {
                        queue.remove();
                    }
                    ans[i - k + 1] = queue.peek().getValue();
                }
            }
            return ans;
        }
    }

    /**
     * 单调队列
     */
    public static class Solution3 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            Deque<Integer> deque = new ArrayDeque<>();
            int[] ans = new int[n - k + 1];
            for (int i = 0; i < n; i++) {
                while (!deque.isEmpty() && nums[deque.peekLast()] <= nums[i]) {
                    deque.removeLast();
                }
                deque.add(i);
                if (deque.peek() < i - k + 1) {
                    deque.pop();
                }
                if (i >= k - 1) {
                    ans[i - k + 1] = nums[deque.peek()];
                }
            }
            return ans;
        }
    }

    /**
     * 分块处理+前后缀
     */
    public static class Solution4 {
        public int[] maxSlidingWindow(int[] nums, int k) {
            int n = nums.length;
            int[] prefixMax = new int[n];
            for (int i = 0; i < n; i++) {
                if (i % k == 0) {
                    prefixMax[i] = nums[i];
                } else {
                    prefixMax[i] = Math.max(prefixMax[i - 1], nums[i]);
                }
            }
            int[] suffixMax = new int[n];
            suffixMax[n - 1] = nums[n - 1];
            for (int i = n - 2; i >= 0; i--) {
                if ((i + 1) % k == 0) {
                    suffixMax[i] = nums[i];
                } else {
                    suffixMax[i] = Math.max(suffixMax[i + 1], nums[i]);
                }
            }
            int[] ans = new int[n - k + 1];
            for (int i = 0; i < n - k + 1; i++) {
                ans[i] = Math.max(suffixMax[i], prefixMax[i + k - 1]);
            }
            return ans;
        }
    }
}
