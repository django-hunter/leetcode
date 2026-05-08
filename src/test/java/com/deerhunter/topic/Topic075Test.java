package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-28
 */
class Topic075Test {
    @Test
    void solution1() {
        Topic075.Solution1 instance = new Topic075.Solution1();

        int[] arr = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);


        arr = new int[]{2, 1, 0, 2, 1, 1, 0};
        expected = new int[]{0, 0, 1, 1, 1, 2, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);

        arr = new int[]{1, 2};
        expected = new int[]{1, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);
    }

    @Test
    void solution2() {
        Topic075.Solution2 instance = new Topic075.Solution2();

        int[] arr = {2, 0, 2, 1, 1, 0};
        int[] expected = {0, 0, 1, 1, 2, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);


        arr = new int[]{2, 1, 0, 2, 1, 1, 0};
        expected = new int[]{0, 0, 1, 1, 1, 2, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);

        arr = new int[]{1, 2};
        expected = new int[]{1, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);

        arr = new int[]{2, 0, 1};
        expected = new int[]{0, 1, 2};
        instance.sortColors(arr);
        assertArrayEquals(expected, arr);
    }
}
