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
 * @createTime 2020/12/24 11:38
 */
class Topic168Test {
    void batchTest(Function<Integer, String> function) {
        Object[][] testCases = {
                {1, "A"},
                {26, "Z"},
                {25, "Y"},
                {28, "AB"},
                {701, "ZY"},
                {52, "AZ"}
        };
        for (Object[] testCase : testCases) {
            test(function, (int) testCase[0], (String) testCase[1]);
        }
    }

    void test(Function<Integer, String> function, int n, String s) {
        assertEquals(s, function.apply(n));
    }

    @Test
    void solution1() {
        batchTest(new Topic168.Solution()::convertToTitle);
    }
}
