package com.deerhunter.topic;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/9 20:05
 */
class Topic1914Test {

    @Test
    void test() {
        Topic1914.Solution solution = new Topic1914.Solution();
        int[][] matrix =
                new int[][] {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
                };
        int[][] expected =
                new int[][] {
                    {3, 4, 8, 12},
                    {2, 6, 7, 16},
                    {1, 10, 11, 15},
                    {5, 9, 13, 14}
                };
        int[][] output = solution.rotateGrid(matrix, 2);
    }
}
