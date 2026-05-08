package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/16 16:27
 */
class Topic125Test {

    @Test
    void solution1() {
        assertTrue(Topic125.Solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(Topic125.Solution.isPalindrome("race a car"));
    }
}
