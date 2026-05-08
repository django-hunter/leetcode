package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-29
 */
class Topic080Test {
    @Test
    void solution1() {
        Topic080.Solution1 instance = new Topic080.Solution1();

        int[] nums = {1, 1, 1, 2, 2, 3};
        assertEquals(5, instance.removeDuplicates(nums));
        int[] expected = {1, 1, 2, 2, 3};
        assertArrayEquals(expected, Arrays.copyOf(nums,5));



        nums = new int[]{0,0,1,1,1,1,2,3,3};
        assertEquals(7, instance.removeDuplicates(nums));
         expected =new int[]{0,0,1,1,2,3,3};
        assertArrayEquals(expected, Arrays.copyOf(nums, 7));
    }

    @Test
    void solution2() {
        Topic080.Solution2 instance = new Topic080.Solution2();

        int[] nums = {1, 1, 1, 2, 2, 3};
        assertEquals(5, instance.removeDuplicates(nums));
        int[] expected = {1, 1, 2, 2, 3};
        assertArrayEquals(expected, Arrays.copyOf(nums,5));



        nums = new int[]{0,0,1,1,1,1,2,3,3};
        assertEquals(7, instance.removeDuplicates(nums));
        expected =new int[]{0,0,1,1,2,3,3};
        assertArrayEquals(expected, Arrays.copyOf(nums, 7));
    }

    @Test
    void solution3() {
        Topic080.Solution3 instance = new Topic080.Solution3();

        int[] nums = {1, 1, 1, 2, 2, 3};
        assertEquals(5, instance.removeDuplicates(nums));
        int[] expected = {1, 1, 2, 2, 3};
        assertArrayEquals(expected, Arrays.copyOf(nums,5));



        nums = new int[]{0,0,1,1,1,1,2,3,3};
        assertEquals(7, instance.removeDuplicates(nums));
        expected =new int[]{0,0,1,1,2,3,3};
        assertArrayEquals(expected, Arrays.copyOf(nums, 7));
    }
}
