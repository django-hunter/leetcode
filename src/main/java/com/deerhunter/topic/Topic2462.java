package com.deerhunter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/12 10:08
 * @see <a href="https://leetcode.cn/problems/maximum-sum-with-at-most-k-elements/" />
 */
public class Topic2462 {
    class Solution {
        public long maxSum(int[][] grid, int[] limits, int k) {
            int n = grid.length;
            int m = grid[0].length;
            List<Integer> candidates = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                int[] row = grid[i];
                Arrays.sort(row);
                for (int j = m - 1; j >= m - limits[i]; j--) {
                    candidates.add(row[j]);
                }
            }
            candidates.sort(Collections.reverseOrder());
            long ans = 0;
            for (int i = 0; i < k; i++) {
                ans += candidates.get(i);
            }
            return ans;
        }
    }
}
