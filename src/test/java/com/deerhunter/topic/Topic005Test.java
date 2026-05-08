package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-09
 */
class Topic005Test {
    Topic005 solution = new Topic005();

    @Test
    void longestPalindrome1() {
        assertEquals("bab", solution.longestPalindrome1("abab"));
        assertEquals("aba", solution.longestPalindrome1("aba"));
        assertEquals("ababa", solution.longestPalindrome1("ababacfc"));
        assertEquals("aaaa", solution.longestPalindrome1("abaaaa"));
        assertEquals("bcvcvcb", solution.longestPalindrome1("abcvcvcb"));
    }

    @Test
    void longestPalindrome3() {
                assertEquals("aaaa", solution.longestPalindrome3("abaaaa"));
                assertEquals("abba", solution.longestPalindrome3("abbasxabb"));
//
        assertEquals("bab", solution.longestPalindrome3("abab"));
        assertEquals("aba", solution.longestPalindrome3("aba"));
        assertEquals("ababa", solution.longestPalindrome3("ababacfc"));
        assertEquals("bcvcvcb", solution.longestPalindrome3("abcvcvcb"));
    }
    @Test
    void longestPalindrome4() {
//        assertEquals("aaaa", solution.longestPalindrome4("abaaaa"));
        assertEquals("abba", solution.longestPalindrome4("abbasxabb"));
//
//        assertEquals("bab", solution.longestPalindrome4("abab"));
        assertEquals("aba", solution.longestPalindrome4("aba"));
        assertEquals("ababa", solution.longestPalindrome4("ababacfc"));
        assertEquals("bcvcvcb", solution.longestPalindrome4("abcvcvcb"));
    }
}
