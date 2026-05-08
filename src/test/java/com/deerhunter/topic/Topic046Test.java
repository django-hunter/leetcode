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
 * @date 2020-03-04
 */
class Topic046Test {
    @Test
    void permute1() {
        int[] nums = new int[]{1, 2, 3};
        List<List<Integer>> lists = Topic046.Solution1.permute(nums);
        assertIterableEquals(Arrays.asList(1, 2, 3), lists.get(0));
        assertIterableEquals(Arrays.asList(1, 3,2), lists.get(1));
        assertIterableEquals(Arrays.asList(2,1,3), lists.get(2));
        assertIterableEquals(Arrays.asList(2,3,1), lists.get(3));
        assertIterableEquals(Arrays.asList(3,1,2), lists.get(4));
        assertIterableEquals(Arrays.asList(3, 2, 1), lists.get(5));

    }
}
