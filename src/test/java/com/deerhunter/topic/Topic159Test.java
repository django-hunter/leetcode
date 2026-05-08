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
 * @createTime 7/15/21 5:43 PM
 */
class Topic159Test {
    void test(Function<String, Integer> function) {
//        assertEquals(3, function.apply("eceba"));
//        assertEquals(5, function.apply("ccaabbb"));
//        assertEquals(7, function.apply("aaabbbbc"));
        assertEquals(4, function.apply("abaccc"));
    }

    @Test
    void solution1() {
        test(new Topic159.Solution1()::lengthOfLongestSubstringTwoDistinct);
    }
}
