package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/20 21:18
 */
class Topic131Test {
    void test(Function<String, List<List<String>>> function) {
        String s = "aab";
        List<List<String>> result = function.apply(s);
        List<List<String>> expected = new ArrayList<>();
        expected.add(Arrays.asList("aa", "b"));
        expected.add(Arrays.asList("a", "a", "b"));
        TestUtils.checkTwoDimensionalListEqual(expected, result);
    }

    @Test
    void solution1() {
        test(new Topic131.Solution1()::partition);
    }

    @Test
    void solution2() {
        test(new Topic131.Solution2()::partition);
    }
}
