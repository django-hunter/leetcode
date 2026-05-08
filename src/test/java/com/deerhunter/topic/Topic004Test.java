package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-08
 */
class Topic004Test {
    private Topic004 solution = new Topic004();

    @Test
    void findMedianSortedArrays() {
        int[] a = {1,2,3,5,6};

        int[] b = {4};
        assertEquals(3.5, solution.findMedianSortedArrays(a, b));
    }
}
