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
 * @createTime 6/28/21 5:20 PM
 */
class Topic227Test {
    void test(Function<String, Integer> function) {
        assertEquals(7, function.apply("3+2*2"));
        assertEquals(-3, function.apply("1 -2*2"));
        assertEquals(-1, function.apply("1 -2*2/2"));
        assertEquals(-1, function.apply("1 -3*2/  2  +  5/5"));

    }

    @Test
    void solution1() {
        test(new Topic227.Solution1()::calculate);
    }
}
