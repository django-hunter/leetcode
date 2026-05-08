package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-21
 */
class Topic066Test {
    @Test
    void solution1() {
        Topic066.Solution1 instance = new Topic066.Solution1();
        int[] digits = {1, 2, 3};
        assertArrayEquals(new int[]{1, 2, 4}, instance.plusOne(digits));

        digits = new int[]{1, 2, 9};
        assertArrayEquals(new int[]{1, 3, 0}, instance.plusOne(digits));


        digits = new int[]{9, 9, 9};
        assertArrayEquals(new int[]{1, 0, 0, 0}, instance.plusOne(digits));
    }
}
