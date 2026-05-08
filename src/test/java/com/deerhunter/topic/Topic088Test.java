package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/4/11 00:52
 */
class Topic088Test {
    @Test
    void solution1() {
        Topic088.Solution1 instance = new Topic088.Solution1();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        instance.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void solution2() {
        Topic088.Solution2 instance = new Topic088.Solution2();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        instance.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void solution3() {
        Topic088.Solution3 instance = new Topic088.Solution3();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        instance.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(expected, nums1);
    }

    @Test
    void solution4() {
        Topic088.Solution4 instance = new Topic088.Solution4();
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int[] expected = {1, 2, 2, 3, 5, 6};
        instance.merge(nums1, 3, nums2, nums2.length);
        assertArrayEquals(expected, nums1);
    }
}
