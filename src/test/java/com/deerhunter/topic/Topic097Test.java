package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/6 23:02
 */
class Topic097Test {

    @Test
    void solution1() {
        assertTrue(Topic097.Solution1.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(Topic097.Solution1.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        assertFalse(Topic097.Solution1.isInterleave("ab", "bc", "bbac"));
    }
    @Test
    void solution2() {
        assertTrue(Topic097.Solution2.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(Topic097.Solution2.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        assertFalse(Topic097.Solution2.isInterleave("ab", "bc", "bbac"));
    }

    @Test
    void solution3() {
        assertTrue(Topic097.Solution3.isInterleave("aabcc", "dbbca", "aadbbcbcac"));
        assertFalse(Topic097.Solution3.isInterleave("aabcc", "dbbca", "aadbbbaccc"));
        assertFalse(Topic097.Solution3.isInterleave("ab", "bc", "bbac"));
    }
}
