package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/21 20:08
 */
class ManacherTest {

    @Test
    void test() {
        assertEquals(3, Manacher.longestPalindrome("aaab"));
        assertEquals(5, Manacher.longestPalindrome("ababab"));
        assertEquals(3, Manacher.longestPalindrome("abcdc"));
        assertEquals(4, Manacher.longestPalindrome("abbaabc"));
    }
}
