package com.deerhunter.topic;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-08
 */
class Topic004002Test {

    Topic004002 solution = new Topic004002();

    @ParameterizedTest
    @MethodSource("getArrays")
    void findMedianSortedArrays(int[] a, int[] b) {
        assertEquals(solution.getMedian(a, b),solution.findMedianSortedArrays(a, b));
    }

    static Stream<Arguments> getArrays() {
        int repeat = 100;
        Arguments[] arguments = new Arguments[repeat];
        for (int i = 0; i < repeat; i++) {
            Random random = new Random();
            int maxLen = 1000;
            // 最大绝对值
            int maxAbsolute = 10000;
            int[] a = random.ints(random.nextInt(maxLen) + 1, -maxAbsolute, maxAbsolute).toArray();
            Arrays.sort(a);
            int[] b = random.ints(random.nextInt(maxLen), -maxAbsolute, maxAbsolute).toArray();
            Arrays.sort(b);
            arguments[i] = Arguments.of(a, b);
        }

        return Stream.of(arguments);
    }

    @Test
    void getMedian() {
        int[] a = {1};
        int[] b = {4, 5, 6};
        assertEquals(4.5, solution.getMedian(a, b));
    }
    @Test
    void findMedianSortedArrays() {
        int[] a = {};
        int[] b = {4, 5, 6};
        assertEquals(5, solution.findMedianSortedArrays(a, b));
    }
}
