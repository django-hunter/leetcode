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
 * @createTime 7/12/21 12:07 PM
 */
class Topic264Test {
    void test(Function<Integer, Integer> function) {
        assertEquals(12, function.apply(10));
    }

    @Test
    void solution3() {
        test(new Topic264.Solution3()::nthUglyNumber);
    }
}
