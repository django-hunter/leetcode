package com.deerhunter.topic;

import java.util.ArrayDeque;
import java.util.Queue;

/**
 *
 *
 * <pre>
 *     1914. 循环轮转矩阵
 * 算术评级: 5
 * 第 247 场周赛
 * Q2
 *  同步题目状态
 *
 * 1766
 * 相关标签
 * premium lock icon
 * 相关企业
 * 提示
 * 给你一个大小为 m x n 的整数矩阵 grid​​​ ，其中 m 和 n 都是 偶数 ；另给你一个整数 k 。
 *
 * 矩阵由若干层组成，如下图所示，每种颜色代表一层：
 *
 *
 *
 * 矩阵的循环轮转是通过分别循环轮转矩阵中的每一层完成的。在对某一层进行一次循环旋转操作时，层中的每一个元素将会取代其 逆时针 方向的相邻元素。轮转示例如下：
 *
 *
 * 返回执行 k 次循环轮转操作后的矩阵。
 *
 *
 *
 * 示例 1：
 *
 *
 * 输入：grid = [[40,10],[30,20]], k = 1
 * 输出：[[10,20],[40,30]]
 * 解释：上图展示了矩阵在执行循环轮转操作时每一步的状态。
 * 示例 2：
 *
 *
 * 输入：grid = [[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]], k = 2
 * 输出：[[3,4,8,12],[2,11,10,16],[1,7,6,15],[5,9,13,14]]
 * 解释：上图展示了矩阵在执行循环轮转操作时每一步的状态。
 *
 *
 * 提示：
 *
 * m == grid.length
 * n == grid[i].length
 * 2 <= m, n <= 50
 * m 和 n 都是 偶数
 * 1 <= grid[i][j] <= 5000
 * 1 <= k <= 109
 * </pre>
 *
 * @author Django
 * @since 2026/5/9 18:21
 * @see <a
 *     href="https://leetcode.cn/problems/cyclically-rotating-a-grid/description/?envType=daily-question&envId=2026-05-09"
 *     />
 */
public class Topic1914 {
    public static class Solution {
        private static final int[][] MOVES = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};

        public int[][] rotateGrid(int[][] grid, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int layers = Math.min(m / 2, n / 2);
            for (int i = 0; i < layers; i++) {
                rotateGrid(grid, i, k);
            }
            return grid;
        }

        private void rotateGrid(int[][] grid, int layer, int k) {
            int m = grid.length;
            int n = grid[0].length;
            int cells = (m - 2 * layer) * 2 + (n - 2 * layer) * 2 - 4;
            k = k % cells;
            Queue<Integer> queue = new ArrayDeque<>();
            int startRow = layer;
            int startCol = layer;
            int maxRow = m - layer - 1;
            int maxCol = n - layer - 1;
            int row = startRow, col = startCol;
            int moveIndex = 0;

            for (int i = 0; i < cells + k; i++) {
                if (i < cells) {
                    queue.add(grid[row][col]);
                }
                if (i >= k) {
                    grid[row][col] = queue.remove();
                }
                int nextRow = row + MOVES[moveIndex][0];
                int nextCol = col + MOVES[moveIndex][1];
                if (nextRow < startRow
                        || nextRow > maxRow
                        || nextCol < startCol
                        || nextCol > maxCol) {
                    moveIndex = (moveIndex + 1) % 4;
                    nextRow = row + MOVES[moveIndex][0];
                    nextCol = col + MOVES[moveIndex][1];
                }
                row = nextRow;
                col = nextCol;
            }
        }
    }
}
