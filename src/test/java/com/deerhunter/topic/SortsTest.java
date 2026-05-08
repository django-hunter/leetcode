package com.deerhunter.topic;

import com.deerhunter.common.Sorts;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-20
 */
class SortsTest {
    static Stream<int[]> numsProvider() {
        List<int[]> arrays = new LinkedList<>();
        int cnt = 1000;
        int maxLen = 10000;
        Random random = new Random();
        for (int i = 0; i < cnt; i++) {
            arrays.add(random.ints(random.nextInt(maxLen)).toArray());
        }
        return arrays.stream();
    }

    @ParameterizedTest
    @MethodSource("numsProvider")
    void quickSort(int[] nums) {
        int[] copiedNums = new int[nums.length];
        System.arraycopy(nums, 0, copiedNums, 0, nums.length);
        Arrays.sort(copiedNums);
        Sorts.quickSort(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(copiedNums, nums);
    }

    @ParameterizedTest
    @MethodSource("numsProvider")
    void shellSort(int[] nums) {
        int[] copiedNums = new int[nums.length];
        System.arraycopy(nums, 0, copiedNums, 0, nums.length);
        Arrays.sort(copiedNums);
        Sorts.shellSort(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(copiedNums, nums);
    }

    @ParameterizedTest
    @MethodSource("numsProvider")
    void heapSort(int[] nums) {
        int[] copiedNums = new int[nums.length];
        System.arraycopy(nums, 0, copiedNums, 0, nums.length);
        Arrays.sort(copiedNums);
        Sorts.heapSort(nums);
        System.out.println(Arrays.toString(nums));
        assertArrayEquals(copiedNums, nums);
    }
}
