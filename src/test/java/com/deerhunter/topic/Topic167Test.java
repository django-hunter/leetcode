package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/12/24 10:07
 */
class Topic167Test {
    void batchTest(BiFunction<int[], Integer, int[]> function) {
        Object[][] testCases = {
                {new int[]{2, 7, 11, 15}, 9, new int[]{1, 2}},
                {new int[]{3, 4, 5, 6, 15}, 10, new int[]{2, 4}}
        };
        for (Object[] testCase : testCases) {
            test(function, (int[])testCase[0], (int)testCase[1], (int[])testCase[2]);
        }
    }

    void test(BiFunction<int[], Integer, int[]> function, int[] nums, int target, int[] expectedResult) {
        assertArrayEquals(expectedResult, function.apply(nums, target));
    }

    @Test
    void solution1() {
        batchTest(new Topic167.Solution1()::twoSum);
    }

    @Test
    void solution2() {
        batchTest(new Topic167.Solution2()::twoSum);
    }

    @Test
    void solution3() {
        batchTest(new Topic167.Solution3()::twoSum);
    }
}
