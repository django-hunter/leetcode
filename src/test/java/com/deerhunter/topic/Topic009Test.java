package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-14
 */
class Topic009Test {
    private Topic009 solution = new Topic009();

    @Test
    void isPalindrome() {
        assertTrue(solution.isPalindrome(121));
        assertTrue(solution.isPalindrome(0));
        assertTrue(solution.isPalindrome(1));
        assertFalse(solution.isPalindrome(-1));
        assertFalse(solution.isPalindrome(10));
    }

    @Test
    void isPalindrome2() {
        assertTrue(solution.isPalindrome2(121));
        assertTrue(solution.isPalindrome2(0));
        assertTrue(solution.isPalindrome2(1));
        assertFalse(solution.isPalindrome2(-1));
        assertFalse(solution.isPalindrome2(10));
    }

    @Test
    void bits() {
        assertEquals(1, Topic009.getBits(0));
        assertEquals(1, Topic009.getBits(3));
        assertEquals(2, Topic009.getBits(99));
        assertEquals(3, Topic009.getBits(100));
    }

    @Test
    void getNumByBit() {
        assertEquals(9, Topic009.getNumByBit(9, 0));
        assertEquals(9, Topic009.getNumByBit(91, 1));
        assertEquals(0, Topic009.getNumByBit(91, -1));
        assertEquals(0, Topic009.getNumByBit(91, 5));
        assertEquals(2, Topic009.getNumByBit(23291, 4));
    }
}
