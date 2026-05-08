package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/11/13 13:52
 */
class Topic152Test {
    void test(Function<int[], Integer> function) {
        assertEquals(6, function.apply(new int[]{2, 3, -2, 4}));
        assertEquals(0, function.apply(new int[]{-2, 0, -1}));
        assertEquals(2, function.apply(new int[]{0, 2}));
        assertEquals(4, function.apply(new int[]{3, -1, 4}));
    }

    @Test
    void solution1() {
        test(new Topic152.Solution1()::maxProduct);
    }
}
