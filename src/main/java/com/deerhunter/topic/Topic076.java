package com.deerhunter.topic;

import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 给你一个字符串 S、一个字符串 T，请在字符串 S 里面找出：包含 T 所有字母的最小子串。
 * <p>
 * 示例：
 * <p>
 * 输入: S = "ADOBECODEBANC", T = "ABC"
 * 输出: "BANC"
 * 说明：
 * <p>
 * 如果 S 中不存这样的子串，则返回空字符串 ""。
 * 如果 S 中存在这样的子串，我们保证它是唯一的答案。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-window-substring
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-28
 */
public class Topic076 {
    public static class Solution1 {
        public String minWindow(String s, String t) {
            if (s.isEmpty() || t.isEmpty() || t.length() > s.length()) {
                return "";
            }
            Map<Character, List<Integer>> map = new HashMap<>();
            for (int i = 0; i < t.length(); i++) {
                char c = t.charAt(i);
                map.putIfAbsent(c, new ArrayList<>());
            }

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (map.containsKey(c)) {
                    map.get(c).add(i);
                }
            }

            List<int[]> subs = new ArrayList<>();
            findSub(t, 0, new boolean[s.length()], map, subs);

            if (subs.size() == 0) {
                return "";
            }

            int[] shortestSub = subs.get(0);
            int shortestLen = shortestSub[1] - shortestSub[0];
            for (int i = 1; i < subs.size(); i++) {
                int[] sub = subs.get(i);
                int len = sub[1] - sub[0];
                if (len < shortestLen) {
                    shortestSub = sub;
                    shortestLen = len;
                }
            }
            return s.substring(shortestSub[0], shortestSub[1] + 1);
        }

        private void findSub(String t, int cur, boolean[] book, Map<Character, List<Integer>> map, List<int[]> subs) {
            if (cur == t.length()) {
                int start = 0;
                int end = book.length - 1;
                while (!book[start]) {
                    start++;
                }
                while (!book[end]) {
                    end--;
                }
                subs.add(new int[]{start, end});
                return;
            }
            char c = t.charAt(cur);
            List<Integer> indexes = map.get(c);
            if (indexes.size() == 0) {
                return;
            }
            for (int index : indexes) {
                if (!book[index]) {
                    book[index] = true;
                    findSub(t, cur + 1, book, map, subs);
                    book[index] = false;
                }
            }
        }
    }

    /**
     * 滑动窗口
     */
    public static class Solution2 {
        public String minWindow(String s, String t) {
            int M = s.length();
            int N = t.length();

            if (M * N == 0 || M < N) {
                return "";
            }

            Map<Character, Integer> tCount = new HashMap<>();
            for (int i = 0; i < N; i++) {
                tCount.merge(t.charAt(i), 1, Integer::sum);
            }

            int left = 0;
            int right = 0;
            // 目标字符串包含的不同字符的数量
            int required = tCount.size();
            // 当前窗口已经满足的不同字符的数量
            int formed = 0;
            // 保存当前的满足条件的最短子串，第一位表示长度，第二位表示起始下标，第三位表示终止下标。
            int[] ans = {-1, -1, -1};
            Map<Character, Integer> windowCount = new HashMap<>();

            while (right < M) {
                char c = s.charAt(right);

                // 遇到t中不包含的字符无需处理
                if (!tCount.containsKey(c)) {
                    right++;
                    continue;
                }

                windowCount.merge(c, 1, Integer::sum);
                if (windowCount.get(c).intValue() == tCount.get(c)) {
                    formed++;
                }

                while (formed == required && left <= right) {
                    // 更新最短子串
                    if (ans[0] == -1 || ans[0] > right - left + 1) {
                        ans[0] = right - left + 1;
                        ans[1] = left;
                        ans[2] = right;
                    }

                    c = s.charAt(left);
                    left++;

                    // 遇到t中不包含的字符无需处理
                    if (!tCount.containsKey(c)) {
                        continue;
                    }

                    windowCount.merge(c, -1, Integer::sum);
                    if (windowCount.get(c) < tCount.get(c)) {
                        formed--;
                    }
                }
                right++;
            }
            return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        }
    }

    /**
     * 官方题解解法二
     */
    public static class Solution3 {
        public String minWindow(String s, String t) {
            int M = s.length();
            int N = t.length();

            if (M * N == 0 || M < N) {
                return "";
            }

            Map<Character, Integer> tCount = new HashMap<>();
            for (int i = 0; i < N; i++) {
                tCount.merge(t.charAt(i), 1, Integer::sum);
            }

            List<Pair<Integer, Character>> filteredS = new ArrayList<>();
            for (int i = 0; i < M; i++) {
                char c = s.charAt(i);
                if (tCount.containsKey(c)) {
                    filteredS.add(Pair.of(i, c));
                }
            }

            int left = 0;
            int right = 0;
            // 目标字符串包含的不同字符的数量
            int required = tCount.size();
            // 当前窗口已经满足的不同字符的数量
            int formed = 0;
            // 保存当前的满足条件的最短子串，第一位表示长度，第二位表示起始下标，第三位表示终止下标。
            int[] ans = {-1, -1, -1};
            Map<Character, Integer> windowCount = new HashMap<>();

            while (right < filteredS.size()) {
                char c = filteredS.get(right).getValue();
                windowCount.merge(c, 1, Integer::sum);
                if (windowCount.get(c).intValue() == tCount.get(c)) {
                    formed++;
                }
                while (formed == required && left <= right) {

                    int start = filteredS.get(left).getKey();
                    int end = filteredS.get(right).getKey();
                    if (ans[0] == -1 || end - start + 1 < ans[0]) {
                        ans[0] = end - start + 1;
                        ans[1] = start;
                        ans[2] = end;
                    }

                    c = filteredS.get(left).getValue();
                    windowCount.merge(c, -1, Integer::sum);
                    if (windowCount.get(c) < tCount.get(c)) {
                        formed--;
                    }
                    left++;
                }
                right++;
            }
            return ans[0] == -1 ? "" : s.substring(ans[1], ans[2] + 1);
        }
    }
}
