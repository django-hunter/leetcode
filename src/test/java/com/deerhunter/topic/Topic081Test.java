package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-30
 */
class Topic081Test {
    @Test
    void solution1() {
        Topic081.Solution1 instance = new Topic081.Solution1();

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        assertTrue(instance.search(nums, 0));

        assertFalse(instance.search(nums, 3));

        nums = new int[]{1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{3, 1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{1, 1, 3, 1};
        assertTrue(instance.search(nums, 3));
    }

    @Test
    void solution2() {
        Topic081.Solution2 instance = new Topic081.Solution2();

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        assertTrue(instance.search(nums, 0));

        assertFalse(instance.search(nums, 3));

        nums = new int[]{1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{3, 1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{1, 1, 3, 1};
        assertTrue(instance.search(nums, 3));
    }

    @Test
    void solution3_findPivot() {
        Topic081.Solution3 instance = new Topic081.Solution3();
        int[] nums = {3, 4, 5, 0, 1, 2};
        assertEquals(3, instance.findPivot(nums));

        nums = new int[]{3, 4, 5, 0, 1, 2, 3, 3};
        assertEquals(3, instance.findPivot(nums));

        nums = new int[]{3, 4, 5, 7, 0, 1, 2, 3, 3};
        assertEquals(4, instance.findPivot(nums));

        nums = new int[]{};
        assertEquals(0, instance.findPivot(nums));

        nums = new int[]{1};
        assertEquals(1, instance.findPivot(nums));


        nums = new int[]{1, 2, 3};
        assertEquals(3, instance.findPivot(nums));
    }

    @Test
    void solution3() {
        Topic081.Solution3 instance = new Topic081.Solution3();

        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        assertTrue(instance.search(nums, 0));

        assertFalse(instance.search(nums, 3));

        nums = new int[]{1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{3, 1};
        assertTrue(instance.search(nums, 1));

        nums = new int[]{1, 1, 3, 1};
        assertTrue(instance.search(nums, 3));
    }
}
