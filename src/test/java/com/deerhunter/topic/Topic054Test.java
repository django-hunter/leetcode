package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-09
 */
class Topic054Test {

    @Test
    void soluton1() {
        Topic054.Solution1 instance = new Topic054.Solution1();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        assertIterableEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), instance.spiralOrder(matrix));

    }
    @Test
    void soluton2() {
        Topic054.Solution2 instance = new Topic054.Solution2();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> actual = instance.spiralOrder(matrix);
        assertIterableEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), actual);

    }
    @Test
    void soluton3() {
        Topic054.Solution3 instance = new Topic054.Solution3();
        int[][] matrix = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        List<Integer> actual = instance.spiralOrder(matrix);
        assertIterableEquals(Arrays.asList(1, 2, 3, 6, 9, 8, 7, 4, 5), actual);

    }
}
