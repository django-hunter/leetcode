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
 * @createTime 2020/11/13 15:06
 */
class Topic153Test {
    void test(Function<int[], Integer> function) {
        assertEquals(1, function.apply(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, function.apply(new int[]{4, 5, 6, 7, 0, 1, 2}));
        assertEquals(1, function.apply(new int[]{1}));
        assertEquals(1, function.apply(new int[]{2, 1}));
    }

    @Test
    void solution1() {
        test(new Topic153.Solution()::findMin);
    }
}
