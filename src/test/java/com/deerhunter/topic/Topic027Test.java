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
 * @date 2019-09-04
 */
class Topic027Test {

    @Test
    void removeElement() {
        int[] nums = {3, 2, 2, 3};
        int len = Topic027.removeElement(nums, 3);
        assertEquals(2, len);
        assertArrayEquals(Arrays.copyOf(nums, len), new int[]{2, 2});

         nums = new int[]{0,1,2,2,3,0,4,2};
        len = Topic027.removeElement(nums, 2);
        assertEquals(5, len);
        assertArrayEquals(Arrays.copyOf(nums, len), new int[]{0, 1, 3, 0, 4});
    }
}
