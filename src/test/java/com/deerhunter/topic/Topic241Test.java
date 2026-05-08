package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

import static com.deerhunter.topic.TestUtils.assertListEquals;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/6/21 1:09 PM
 */
class Topic241Test {
    void test(Function<String, List<Integer>> function) {
        assertListEquals(Arrays.asList(11), function.apply("11"));
    }

    @Test
    void solution1() {
        test(new Topic241.Solution1()::diffWaysToCompute);
    }
}
