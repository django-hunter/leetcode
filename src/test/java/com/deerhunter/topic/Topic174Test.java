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
 * @createTime 2020/12/27 21:24
 */
class Topic174Test {

    void batchTest(Function<int[][], Integer> function) {
        Object[][] testCases = {
                {
                        new int[][]{
                                {-2, -3, 3},
                                {-5, -10, 1},
                                {10, 30, -5}
                        },
                        7
                },
                {
                        new int[][]{
                                {3, -20, 30},
                                {-3, 4, 0}
                        },
                        1
                },
                {
                        new int[][]{
                                {1, -3, 3},
                                {0, -2, 0},
                                {-3, -3, -3}
                        },
                        3
                }
        };
        for (Object[] testCase : testCases) {
            test(function, (int[][]) testCase[0], (int) testCase[1]);
        }
    }

    void test(Function<int[][], Integer> function, int[][] dungeon, int minHealth) {
        assertEquals(minHealth, function.apply(dungeon));
    }

    @Test
    void solution1() {
        batchTest(new Topic174.Solution1()::calculateMinimumHP);
    }

    @Test
    void solution2() {
        batchTest(new Topic174.Solution2()::calculateMinimumHP);
    }

    @Test
    void solution3() {
        batchTest(new Topic174.Solution3()::calculateMinimumHP);
    }
}
