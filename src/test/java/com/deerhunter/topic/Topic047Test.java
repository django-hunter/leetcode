package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-05
 */
class Topic047Test {
    @Test
    void solution1() {

        int[] nums = new int[]{1, 1, 2};
        List<List<Integer>> lists = new Topic047.Solution1().permuteUnique(nums);
        assertIterableEquals(Arrays.asList(1, 1, 2), lists.get(0));
        assertIterableEquals(Arrays.asList(1, 2,1), lists.get(1));
        assertIterableEquals(Arrays.asList(2,1,1), lists.get(2));
    }
}
