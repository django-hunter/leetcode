package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-16
 */
class Topic063Test {
    @Test
    void solution1() {
        Topic063.Solution1 instance = new Topic063.Solution1();
        int[][] matrix = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        assertEquals(2, instance.uniquePathsWithObstacles(matrix));
        matrix = new int[][]{{1}};

        assertEquals(0, instance.uniquePathsWithObstacles(matrix));
    }
}
