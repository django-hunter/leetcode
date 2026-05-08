package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/15 15:01
 */
class Topic120Test {

    void test(Function<List<List<Integer>>, Integer> function) {
        List<List<Integer>> triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(2));
        triangle.add(Arrays.asList(3, 4));
        triangle.add(Arrays.asList(6, 5, 7));
        triangle.add(Arrays.asList(4, 1, 8, 3));
        Integer shortestPath = function.apply(triangle);
        assertEquals(11, shortestPath);


        triangle = new ArrayList<>();
        triangle.add(Collections.singletonList(-1));
        triangle.add(Arrays.asList(-2,-3));
         shortestPath = function.apply(triangle);
        assertEquals(-4, shortestPath);
    }

    @Test
    void solution1() {
        test(Topic120.Solution::minimumTotal);
    }
}
