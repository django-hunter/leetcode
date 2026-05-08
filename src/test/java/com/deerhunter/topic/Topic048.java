package com.deerhunter.topic;

/**
 * 给定一个 n × n 的二维矩阵表示一个图像。
 * <p>
 * 将图像顺时针旋转 90 度。
 * <p>
 * 说明：
 * <p>
 * 你必须在原地旋转图像，这意味着你需要直接修改输入的二维矩阵。请不要使用另一个矩阵来旋转图像。
 * <p>
 * 示例 1:
 * <p>
 * 给定 matrix =
 * [
 * [1,2,3],
 * [4,5,6],
 * [7,8,9]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [7,4,1],
 * [8,5,2],
 * [9,6,3]
 * ]
 * 示例 2:
 * <p>
 * 给定 matrix =
 * [
 * [ 5, 1, 9,11],
 * [ 2, 4, 8,10],
 * [13, 3, 6, 7],
 * [15,14,12,16]
 * ],
 * <p>
 * 原地旋转输入矩阵，使其变为:
 * [
 * [15,13, 2, 5],
 * [14, 3, 4, 1],
 * [12, 6, 8, 9],
 * [16, 7,10,11]
 * ]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/rotate-image
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-06
 */
public class Topic048 {
    public static class Solution1 {
        public void rotate(int[][] matrix) {
            for (int i = 0; i < (matrix.length + 1) / 2; i++) {
                int[] row = matrix[i];
                for (int j = i; j < row.length - i - 1; j++) {
                    rotate90DegreeClockWise(matrix, i, j);
                }
            }
        }

        private void rotate90DegreeClockWise(int[][] matrix, int row, int column) {
            int nextRow = row, nextCol = column;
            while (true) {
                int temp = nextRow;
                nextRow = nextCol;
                nextCol = matrix.length - 1 - temp;
                if (nextRow == row && nextCol == column) {
                    break;
                }
                int temp1 = matrix[row][column];
                matrix[row][column] = matrix[nextRow][nextCol];
                matrix[nextRow][nextCol] = temp1;
            }
        }

    }
}
