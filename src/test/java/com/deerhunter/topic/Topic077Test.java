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
 * @date 2020-03-28
 */
class Topic077Test {
    @Test
    void solution1() {
        Topic077.Solution1 instance = new Topic077.Solution1();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        assertIterableEquals(expected, instance.combine(4, 2));
    }


    @Test
    void solution2() {
        Topic077.Solution2 instance = new Topic077.Solution2();
        List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1, 2));
        expected.add(Arrays.asList(1, 3));
        expected.add(Arrays.asList(2, 3));
        expected.add(Arrays.asList(1, 4));
        expected.add(Arrays.asList(2, 4));
        expected.add(Arrays.asList(3, 4));
        assertIterableEquals(expected, instance.combine(4, 2));
    }
}
