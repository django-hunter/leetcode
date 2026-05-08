package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/12/22 15:03
 */
class Topic165Test {

    void batchTest(BiFunction<String, String, Integer> function) {
        Object[][] testCases = {
                {"1.01", "1.001", 0},
                {"1.0", "1.0.0", 0},
                {"0.1", "1.1", -1},
                {"1.0.1", "1", 1},
                {"7.5.2.4", "7.5.3", -1},
                {"0.1", "0.0.1", 1}
        };
        for (Object[] testCase : testCases) {
            System.out.print(Arrays.toString(testCase));
            test(function, (String) testCase[0], (String) testCase[1], (int) testCase[2]);
        }
    }

    void test(BiFunction<String, String, Integer> function, String s1, String s2, int i) {
        assertEquals(i, function.apply(s1, s2));
    }

    @Test
    void solution1() {
        batchTest(new Topic165.Solution1()::compareVersion);
    }
}
