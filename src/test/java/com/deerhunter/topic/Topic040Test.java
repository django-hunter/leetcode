package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-11-18
 */
class Topic040Test {

    @Test
    void combinationSum() {
        Topic040 solution = new Topic040();
        int[] cadinates = {10, 1, 2, 7, 6, 1, 5};
        int target = 8;
        List<List<Integer>> combinations = solution.combinationSum(cadinates, target);
        List<List<Integer>> expect = new ArrayList<>();
        expect.add(Arrays.asList(1, 1, 6));
        expect.add(Arrays.asList(1, 2, 5));
        expect.add(Arrays.asList(1, 7));
        expect.add(Arrays.asList(2, 6));
        assertEquals(expect, combinations);

        solution = new Topic040();
        cadinates = new int[]{2, 5,2,1,2};
        target = 5;
        combinations = solution.combinationSum(cadinates, target);
        expect = new ArrayList<>();
        expect.add(Arrays.asList(1,2,2));
        expect.add(Arrays.asList(5));
        assertEquals(expect, combinations);
    }
}
