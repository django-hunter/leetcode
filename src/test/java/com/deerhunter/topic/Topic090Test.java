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
 * @createTime 2020/4/13 17:52
 */
class Topic090Test {
    @Test
    void solution1() {
        Topic090.Solution1 instance = new Topic090.Solution1();
        int[] nums = {1, 2, 2};
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2, 2));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2, 2));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList());

        assertIterableEquals(expected, instance.subsetsWithDup(nums));
    }
}
