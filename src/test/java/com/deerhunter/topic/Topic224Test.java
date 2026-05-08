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
 * @createTime 6/24/21 6:17 PM
 */
class Topic224Test {
    void test(Function<String, Integer> function) {
        assertEquals(2, function.apply("1 + 1"));
        assertEquals(2, function.apply("(1 + 1)"));
        assertEquals(3, function.apply(" 2-1 + 2 "));
        assertEquals(5, function.apply(" 2+1 + 2 "));
        assertEquals(5, function.apply("( 2+1) + 2 "));
        assertEquals(23, function.apply("(1+(4+5+2)-3)+(6+8)"));
        assertEquals(3, function.apply("2-(5-6)"));
    }

    @Test
    void solution1() {
        test(new Topic224.Solution1()::calculate);
    }

    @Test
    void solution2() {
        test(new Topic224.Solution2()::calculate);
    }

    @Test
    void solution3() {
        test(new Topic224.Solution3()::calculate);
    }
}
