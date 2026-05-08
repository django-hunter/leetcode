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
 * @createTime 2020/11/16 15:38
 */
class Topic154Test {
    void test(Function<int[], Integer> function) {
        assertEquals(1, function.apply(new int[]{3, 4, 5, 1, 2}));
        assertEquals(0, function.apply(new int[]{2, 2, 2, 0, 1}));
        assertEquals(1, function.apply(new int[]{1}));
        assertEquals(1, function.apply(new int[]{2, 1}));
    }

    @Test
    void solution1() {
        test(new Topic154.Solution1()::findMin);
    }

    @Test
    void solution2() {
        test(new Topic154.Solution2()::findMin);
    }
}
