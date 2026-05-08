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
 * @createTime 2021/1/4 15:28
 */
class Topic188Test {
    void batchTest(BiFunction<Integer, int[], Integer> function) {
        Object[][] testCases = {
                {2, new int[]{2, 4, 1}, 2},
                {2, new int[]{3, 2, 6, 5, 0, 3}, 7},
                {2, new int[]{1,2,4,2,5,7,2,4,9,0}, 13},
                {2, new int[]{1,2,4,2,5,7,2,4,9,0,9}, 17}
        };
        for (Object[] testCase : testCases) {
            test(function, (int) testCase[0], (int[]) testCase[1], (int) testCase[2]);
        }
    }

    void test(BiFunction<Integer, int[], Integer> function, int k, int[] prices, int maxProfit) {
        assertEquals(maxProfit, function.apply(k, prices));
    }

    @Test
    void solution1() {
        batchTest(new Topic188.Solution1()::maxProfit);
    }

    @Test
    void solution2() {
        batchTest(new Topic188.Solution2()::maxProfit);
    }
}
