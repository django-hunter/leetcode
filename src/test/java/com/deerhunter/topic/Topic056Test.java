package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-10
 */
class Topic056Test {
    @Test
    void solution1() {
        Topic056.Solution1 instance = new Topic056.Solution1();
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 6}, merged[0]);
        assertArrayEquals(new int[]{8, 10}, merged[1]);
        assertArrayEquals(new int[]{15, 18}, merged[2]);

        intervals = new int[][]{
                {1, 4},
                {4, 5}
        };
        merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 5}, merged[0]);


        intervals = new int[][]{
                {1, 4},
                {2, 3}
        };
        merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 4}, merged[0]);

    }

    @Test
    void solution2() {
        Topic056.Solution2 instance = new Topic056.Solution2();
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };
        int[][] merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 6}, merged[0]);
        assertArrayEquals(new int[]{8, 10}, merged[1]);
        assertArrayEquals(new int[]{15, 18}, merged[2]);

        intervals = new int[][]{
                {1, 4},
                {4, 5}
        };
        merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 5}, merged[0]);


        intervals = new int[][]{
                {1, 4},
                {2, 3}
        };
        merged = instance.merge(intervals);
        assertArrayEquals(new int[]{1, 4}, merged[0]);

    }
}
