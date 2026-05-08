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
 * @createTime 2020/12/23 12:10
 */
class Topic166Test {

    void batchTest(BiFunction<Integer, Integer, String> function) {
        Object[][] testCases = {
//                {1, 2, "0.5"},
//                {2, 1, "2"},
//                {2, 3, "0.(6)"},
//                {4, 333, "0.(012)"},
//                {1, 6, "0.1(6)"},
//                {500, 10, "50"},
//                {1, 5, "0.2"},
//                {0, 1, "0"},
//                {20, 4, "5"},
//                {20, 4, "5"},
//                {-1, 4, "-0.25"},
//                {-1, -4, "0.25"},
                {-2147483648, -1, "2147483648"},
        };
        for (Object[] testCase : testCases) {
            test(function, (int) testCase[0], (int) testCase[1], (String) testCase[2]);
        }
    }

    void test(BiFunction<Integer, Integer, String> function, int i, int j, String expectedResult) {
        assertEquals(expectedResult, function.apply(i, j));
    }

    @Test
    void solution1() {
        batchTest(new Topic166.Solution1()::fractionToDecimal);
    }

    @Test
    void solution2() {
        batchTest(new Topic166.Solution2()::fractionToDecimal);
    }
}
