package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/14 19:22
 */
class Topic115Test {
    void test(BiFunction<String, String, Integer> function) {
        String s = "rabbbit";
        String t = "rabbit";
        Integer count = function.apply(s, t);
        assertEquals(3, count);

         s = "babgbag";
         t = "bag";
         count = function.apply(s, t);
        assertEquals(5, count);
    }

    @Test
    void solution1() {
        test(Topic115.Solution1::numDistinct);
    }
    @Test
    void solution2() {
        test(Topic115.Solution2::numDistinct);
    }
}
