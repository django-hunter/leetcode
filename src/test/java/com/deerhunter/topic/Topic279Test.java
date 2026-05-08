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
 * @createTime 7/14/21 10:50 AM
 */
class Topic279Test {
    void test(Function<Integer, Integer> function) {
        assertEquals(1, function.apply(1));
        assertEquals(2, function.apply(2));
        assertEquals(3, function.apply(3));
        assertEquals(1, function.apply(4));
        assertEquals(2, function.apply(8));
        assertEquals(1, function.apply(9));
        assertEquals(3, function.apply(12));
    }

    @Test
    void solution1() {
        test(new Topic279.Solution1()::numSquares);

    }
}
