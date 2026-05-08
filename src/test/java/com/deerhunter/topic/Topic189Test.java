package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiConsumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/1/7 19:07
 */
class Topic189Test {
    void batchTest(BiConsumer<int[], Integer> function) {
        Object[][] testCases = {
                {new int[]{1, 2, 3, 4, 5, 6, 7}, 1, new int[]{7, 1, 2, 3, 4, 5, 6}},
                {new int[]{1, 2, 3, 4, 5, 6, 7}, 2, new int[]{6, 7, 1, 2, 3, 4, 5}},
                {new int[]{1, 2, 3, 4, 5, 6, 7}, 3, new int[]{5, 6, 7, 1, 2, 3, 4}},
                {new int[]{1, 2, 3, 4, 5, 6}, 2, new int[]{5, 6, 1, 2, 3, 4}},
        };
        for (Object[] testCase : testCases) {
            test(function, (int[]) testCase[0], (int) testCase[1], (int[]) testCase[2]);
        }
    }

    void test(BiConsumer<int[], Integer> function, int[] nums, int k, int[] result) {
        function.accept(nums, k);
        assertArrayEquals(result, nums);
    }

    @Test
    void solution3() {
        batchTest(new Topic189.Solution3()::rotate);
    }
}
