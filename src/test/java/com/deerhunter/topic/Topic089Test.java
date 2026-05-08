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
 * @createTime 2020/4/11 22:45
 */
class Topic089Test {
    @Test
    void solution1() {
        Topic089.Solution1 instance = new Topic089.Solution1();
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertIterableEquals(expected, instance.grayCode(2));
    }

    @Test
    void solution2() {
        Topic089.Solution2 instance = new Topic089.Solution2();
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertIterableEquals(expected, instance.grayCode(2));

        expected = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        assertIterableEquals(expected, instance.grayCode(3));
    }

    @Test
    void solution3() {
        Topic089.Solution3 instance = new Topic089.Solution3();
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertIterableEquals(expected, instance.grayCode(2));

        expected = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        assertIterableEquals(expected, instance.grayCode(3));
    }

    @Test
    void solution4() {
        Topic089.Solution4 instance = new Topic089.Solution4();
        List<Integer> expected = Arrays.asList(0, 1, 3, 2);
        assertIterableEquals(expected, instance.grayCode(2));

        expected = Arrays.asList(0, 1, 3, 2, 6, 7, 5, 4);
        assertIterableEquals(expected, instance.grayCode(3));
    }
}
