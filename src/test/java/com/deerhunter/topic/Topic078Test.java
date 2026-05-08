package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-29
 */
class Topic078Test {
    @Test
    void solution1() {
        Topic078.Solution1 instance = new Topic078.Solution1();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));
        assertIterableEquals(expected, instance.subsets(new int[]{1, 2, 3}));
    }

    @Test
    void solution2() {
        Topic078.Solution2 instance = new Topic078.Solution2();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));
        assertIterableEquals(expected, instance.subsets(new int[]{1, 2, 3}));
    }

    @Test
    void solution3() {
        Topic078.Solution3 instance = new Topic078.Solution3();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));
        assertIterableEquals(expected, instance.subsets(new int[]{1, 2, 3}));
    }

    @Test
    void solution4() {
        Topic078.Solution4 instance = new Topic078.Solution4();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Collections.emptyList());
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(2));
        expected.add(Arrays.asList(3));
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 2, 3));
        assertIterableEquals(expected, instance.subsets(new int[]{1, 2, 3}));
    }
}
