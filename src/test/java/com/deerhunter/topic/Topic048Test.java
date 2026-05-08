package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-06
 */
class Topic048Test {
    @Test
    void solution1() {
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        new Topic048.Solution1().rotate(matrix);
        assertArrayEquals(new int[]{7, 4, 1}, matrix[0]);
        assertArrayEquals(new int[]{8, 5, 2}, matrix[1]);
        assertArrayEquals(new int[]{9, 6, 3}, matrix[2]);

    }
}
