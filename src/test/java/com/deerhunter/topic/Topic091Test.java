package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/4/13 18:20
 */
class Topic091Test {
    @Test
    void solution1() {
        Topic091.Solution1 instance = new Topic091.Solution1();
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(3, instance.numDecodings("226"));
        assertEquals(1, instance.numDecodings("10"));
        assertEquals(0, instance.numDecodings("100"));
        assertEquals(1, instance.numDecodings("110"));
        assertEquals(2, instance.numDecodings("17"));
    }

    @Test
    void solution2() {
        Topic091.Solution2 instance = new Topic091.Solution2();
        assertEquals(2, instance.numDecodings("12"));
        assertEquals(3, instance.numDecodings("226"));
        assertEquals(1, instance.numDecodings("10"));
        assertEquals(0, instance.numDecodings("100"));
        assertEquals(1, instance.numDecodings("110"));
        assertEquals(2, instance.numDecodings("17"));
        assertEquals(2, instance.numDecodings("227"));
    }
}
