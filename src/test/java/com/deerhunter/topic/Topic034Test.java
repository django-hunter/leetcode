package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-17
 */
class Topic034Test {

    @Test
    void searchRange() {
        int[] nums = new int[]{5, 7, 7, 8, 8, 10};
        assertArrayEquals(new int[]{3, 4}, Topic034.searchRange(nums, 8));
        nums = new int[]{5, 7, 7, 8, 8, 10};
        assertArrayEquals(new int[]{-1, -1}, Topic034.searchRange(nums, 6));
        nums = new int[]{1};
        assertArrayEquals(new int[]{-1, -1}, Topic034.searchRange(nums, 0));
    }
}
