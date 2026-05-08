package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 6/30/21 1:43 PM
 */
class Topic233Test {
    void test(Function<Integer, Integer> function) {
        assertEquals(13, function.apply(30));
        assertEquals(301, function.apply(1000));
        assertEquals(300, function.apply(999));
        assertEquals(21, function.apply(100));
        assertEquals(2, function.apply(10));
        assertEquals(4001, function.apply(10000));
    }

    @Test
    void countDigit() {
        assertEquals(1, Topic233.countDigitOne(1));
        assertEquals(3, Topic233.countDigitOne(111));
        assertEquals(2, Topic233.countDigitOne(101));
        assertEquals(2, Topic233.countDigitOne(110));
        assertEquals(0, Topic233.countDigitOne(9527));
        assertEquals(1, Topic233.countDigitOne(9187));
    }

    @Test
    void solution1() {
        test(Topic233.Solution1::countDigitOne);
    }

    @Test
    void solution2() {
        test(Topic233.Solution2::countDigitOne);
    }

    @Test
    void solution3() {
        test(Topic233.Solution3::countDigitOne);
    }
}
