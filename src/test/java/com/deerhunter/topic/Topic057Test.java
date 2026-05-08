package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static com.deerhunter.common.Utils.checkArrayEqual;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-11
 */
class Topic057Test {
    @Test
    void solution1() {
        Topic057.Solution1 instance = new Topic057.Solution1();
        int[][] intervals = {
                {1, 3},
                {6, 9}
        };
        int[] newInterval = {2, 5};
        int[][] expected = {
                {1, 5},
                {6, 9}
        };
        int[][] actual = instance.insert(intervals, newInterval);
        checkArrayEqual(expected, actual);


        intervals = new int[][]{
                {1, 2},
                {3, 5},
                {6, 7},
                {8, 10},
                {12, 16}
        };
        newInterval = new int[]{4, 8};
        expected = new int[][]{
                {1, 2},
                {3,10},
                {12,16}
        };
        actual = instance.insert(intervals, newInterval);
        checkArrayEqual(expected, actual);

    }
}
