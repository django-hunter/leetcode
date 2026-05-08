package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 6/29/21 1:29 PM
 */
class Topic229Test {
    void test(Function<int[], List<Integer>> function) {
        TestUtils.assertListEquals(Arrays.asList(3), function.apply(new int[]{3, 2, 3}));
        TestUtils.assertListEquals(Arrays.asList(1), function.apply(new int[]{2, 1, 1, 3, 1, 4, 5, 6}));
    }

    @Test
    void solution1() {
        test(new Topic229.Solution1()::majorityElement);
    }

    @Test
    void solution2() {
        test(new Topic229.Solution2()::majorityElement);
    }
}
