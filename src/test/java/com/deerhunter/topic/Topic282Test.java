package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/14/21 1:37 PM
 */
class Topic282Test {

    void test(BiFunction<String, Integer, List<String>> function) {
        TestUtils.assertEqualsIgnoreOrder(Arrays.asList("1+2+3", "1*2*3"), function.apply("123", 6));
        TestUtils.assertEqualsIgnoreOrder(Arrays.asList("2*3+2", "2+3*2"), function.apply("232", 8));
        TestUtils.assertEqualsIgnoreOrder(Arrays.asList("1*0+5", "10-5"), function.apply("105", 5));
        TestUtils.assertEqualsIgnoreOrder(Arrays.asList("0+0", "0-0", "0*0"), function.apply("00", 0));
        TestUtils.assertEqualsIgnoreOrder(Collections.emptyList(), function.apply("3456237490", 9191));
        TestUtils.assertEqualsIgnoreOrder(Collections.emptyList(), function.apply("2147483648", Integer.MIN_VALUE));
    }

    @Test
    void solution1() {
        test(new Topic282.Solution1()::addOperators);
    }
}
