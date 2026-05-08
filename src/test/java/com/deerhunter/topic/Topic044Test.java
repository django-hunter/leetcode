package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-01
 */
class Topic044Test {
    private Topic044 instance = new Topic044();

    @Test
    void isMatchTest() {
        assertFalse(instance.isMatch("aa", "a"));
        assertTrue(instance.isMatch("aa", "*"));
        assertFalse(instance.isMatch("cb", "?a"));
        assertTrue(instance.isMatch("adceb", "*a*b"));
        assertFalse(instance.isMatch("acdcb", "a*c?b"));
        assertTrue(instance.isMatch("a", "?"));
        assertTrue(instance.isMatch("ab", "?*"));
        assertTrue(instance.isMatch("", "*"));
        assertFalse(instance.isMatch("aab", "c*a*b"));
        assertFalse(instance.isMatch("", "c*"));
        assertFalse(instance.isMatch("mississippi", "m??*ss*?i*pi"));
    }

    @Test
    void isMatch2Test() {
        assertFalse(instance.isMatch2("aa", "a"));
        assertTrue(instance.isMatch2("aab", "*a*b"));
        assertTrue(instance.isMatch2("aa", "*"));
        assertFalse(instance.isMatch2("cb", "?a"));
        assertTrue(instance.isMatch2("adceb", "*a*b"));
        assertFalse(instance.isMatch2("acdcb", "a*c?b"));
        assertTrue(instance.isMatch2("a", "?"));
        assertTrue(instance.isMatch2("ab", "?*"));
        assertTrue(instance.isMatch2("", "*"));
        assertFalse(instance.isMatch2("aab", "c*a*b"));
        assertFalse(instance.isMatch2("", "c*"));
        assertFalse(instance.isMatch2("mississippi", "m??*ss*?i*pi"));
    }
    @Test
    void isMatch3Test() {
        assertFalse(instance.isMatch3("aa", "a"));
        assertTrue(instance.isMatch3("aab", "*a*b"));
        assertTrue(instance.isMatch3("aa", "*"));
        assertFalse(instance.isMatch3("cb", "?a"));
        assertTrue(instance.isMatch3("adceb", "*a*b"));
        assertFalse(instance.isMatch3("acdcb", "a*c?b"));
        assertTrue(instance.isMatch3("a", "?"));
        assertTrue(instance.isMatch3("ab", "?*"));
        assertTrue(instance.isMatch3("", "*"));
        assertFalse(instance.isMatch3("aab", "c*a*b"));
        assertFalse(instance.isMatch3("", "c*"));
        assertFalse(instance.isMatch3("mississippi", "m??*ss*?i*pi"));
    }

    @Test
    void isMatch4Test() {
        assertFalse(instance.isMatch4("aa", "a"));
        assertTrue(instance.isMatch4("aab", "*a*b"));
        assertTrue(instance.isMatch4("aa", "*"));
        assertFalse(instance.isMatch4("cb", "?a"));
        assertTrue(instance.isMatch4("adceb", "*a*b"));
        assertFalse(instance.isMatch4("acdcb", "a*c?b"));
        assertTrue(instance.isMatch4("a", "?"));
        assertTrue(instance.isMatch4("ab", "?*"));
        assertTrue(instance.isMatch4("", "*"));
        assertFalse(instance.isMatch4("aab", "c*a*b"));
        assertFalse(instance.isMatch4("", "c*"));
        assertFalse(instance.isMatch4("mississippi", "m??*ss*?i*pi"));
    }
}
