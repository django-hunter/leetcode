package com.deerhunter.topic;


import java.util.ArrayList;
import java.util.List;

/**
 * 给定两个整数 n 和 k，返回 1 ... n 中所有可能的 k 个数的组合。
 * <p>
 * 示例:
 * <p>
 * 输入: n = 4, k = 2
 * 输出:
 * [
 * [2,4],
 * [3,4],
 * [2,3],
 * [1,2],
 * [1,3],
 * [1,4],
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/combinations
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-28
 */
public class Topic077 {
    /**
     * 回溯法
     */
    public static class Solution1 {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            findCombine(n, k, ans, new ArrayList<>());
            return ans;
        }

        private void findCombine(int n, int k, List<List<Integer>> ans, List<Integer> combine) {
            if (combine.size() == k) {
                ans.add(new ArrayList<>(combine));
            }
            int start = combine.size() == 0 ? 1 : combine.get(combine.size() - 1) + 1;
            for (int i = start; i <= n; i++) {
                combine.add(i);
                findCombine(n, k, ans, combine);
                combine.remove(combine.size() - 1);
            }
        }
    }

    /**
     * 字典序 (二进制排序) 组合
     */
    public static class Solution2 {
        public List<List<Integer>> combine(int n, int k) {
            List<List<Integer>> ans = new ArrayList<>();
            List<Integer> nums = new ArrayList<>();
            for (int i = 0; i < k; i++) {
                nums.add(i + 1);
            }
            nums.add(n + 1);
            int j = 0;
            while (j < k) {
                ans.add(new ArrayList<>(nums.subList(0, k)));
                j = 0;
                while (j < k && nums.get(j) + 1 == nums.get(j + 1)) {
                    nums.set(j, j + 1);
                    j++;
                }
                nums.set(j, nums.get(j) + 1);
            }
            return ans;
        }
    }
}
