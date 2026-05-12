package com.deerhunter.topic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/11 23:28
 * @see <a href="https://leetcode.cn/problems/count-servers-that-communicate/" />
 */
public class Topic1267 {
    class Solution {
        public int countServers(int[][] grid) {
            Map<String, Integer> count = new HashMap<>();
            List<int[]> servers = new ArrayList<>();
            for (int i = 0; i < grid.length; i++) {
                for (int j = 0; j < grid[0].length; j++) {
                    if (grid[i][j] == 1) {
                        count.merge("row" + i, 1, Integer::sum);
                        count.merge("col" + j, 1, Integer::sum);
                        servers.add(new int[] {i, j});
                    }
                }
            }
            int cnt = 0;
            for (int[] server : servers) {
                if (count.get("row" + server[0]) > 1 || count.get("col" + server[1]) > 1) {
                    cnt++;
                }
            }
            return cnt;
        }
    }
}
