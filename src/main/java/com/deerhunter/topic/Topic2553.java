package com.deerhunter.topic;

import java.util.ArrayList;
import java.util.List;

/**
 * 2553. 分割数组中数字的数位 算术评级: 2 第 97 场双周赛 Q1 同步题目状态
 *
 * <p>1217 相关标签 premium lock icon 相关企业 提示 给你一个正整数数组 nums ，请你返回一个数组 answer ，你需要将 nums 中每个整数进行数位分割后，按照
 * nums 中出现的 相同顺序 放入答案数组中。
 *
 * <p>对一个整数进行数位分割，指的是将整数各个数位按原本出现的顺序排列成数组。
 *
 * <p>比方说，整数 10921 ，分割它的各个数位得到 [1,0,9,2,1] 。
 *
 * <p>示例 1：
 *
 * <p>输入：nums = [13,25,83,77] 输出：[1,3,2,5,8,3,7,7] 解释： - 分割 13 得到 [1,3] 。 - 分割 25 得到 [2,5] 。 - 分割 83
 * 得到 [8,3] 。 - 分割 77 得到 [7,7] 。 answer = [1,3,2,5,8,3,7,7] 。answer 中的数字分割结果按照原数字在数组中的相同顺序排列。 示例 2：
 *
 * <p>输入：nums = [7,1,3,9] 输出：[7,1,3,9] 解释：nums 中每个整数的分割是它自己。 answer = [7,1,3,9] 。
 *
 * <p>提示：
 *
 * <p>1 <= nums.length <= 1000 1 <= nums[i] <= 105
 *
 * @author Django
 * @since 2026/5/11 22:57
 * @see <a
 *     href="https://leetcode.cn/problems/separate-the-digits-in-an-array/?envType=daily-question&envId=2026-05-11"
 *     />
 */
public class Topic2553 {
    class Solution {
        public int[] separateDigits(int[] nums) {
            List<Integer> list = new ArrayList<>();
            for (int num : nums) {
                list.addAll(split(num));
            }
            int[] ans = new int[list.size()];
            for (int i = 0; i < list.size(); i++) {
                ans[i] = list.get(i);
            }
            return ans;
        }

        private List<Integer> split(int num) {
            List<Integer> list = new ArrayList<>();
            while (num > 0) {
                list.addFirst(num % 10);
                num /= 10;
            }
            return list;
        }
    }
}
