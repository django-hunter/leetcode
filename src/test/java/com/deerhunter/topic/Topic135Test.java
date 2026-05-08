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
 * @createTime 2020/9/25 17:11
 */
class Topic135Test {
    void test(Function<int[], Integer> function) {
        int[] ratings = new int[]{1, 0, 2};
        Integer result = function.apply(ratings);
        assertEquals(5, result);

        ratings = new int[]{1, 2, 2};
        result = function.apply(ratings);
        assertEquals(4, result);

        ratings = new int[]{1, 3, 2, 2, 1};
        result = function.apply(ratings);
        assertEquals(7, result);

        ratings = new int[]{1, 3, 4, 5, 2};
        result = function.apply(ratings);
        assertEquals(11, result);
    }

    @Test
    void solution1() {
        test(new Topic135.Solution()::candy);
    }
}
