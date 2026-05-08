package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/25 15:15
 */
class Topic134Test {
    void test(BiFunction<int[], int[], Integer> function) {
        int[] gas = new int[]{1, 2, 3, 4, 5};
        int[] cost = new int[]{3, 4, 5, 1, 2};
        Integer index = function.apply(gas, cost);
        assertEquals(3, index);

        gas = new int[]{2, 3, 4};
        cost = new int[]{3, 4, 3};
        index = function.apply(gas, cost);
        assertEquals(-1, index);
    }

    @Test
    void solution1() {
        test(new Topic134.Solution1()::canCompleteCircuit);
    }

    @Test
    void solution2() {
        test(new Topic134.Solution2()::canCompleteCircuit);
    }
}
