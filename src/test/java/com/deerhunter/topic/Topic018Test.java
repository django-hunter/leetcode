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
 * @date 2019-08-30
 */
class Topic018Test {
    private Topic018 solution = new Topic018();

    @Test
    void fourSum() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(-2, -1, 1, 2));
        lists.add(Arrays.asList(-2,  0, 0, 2));
        lists.add(Arrays.asList(-1,  0, 0, 1));
        assertEquals(lists, solution.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0));

        lists.clear();
        lists.add(Arrays.asList(-4,5,5,5));
        lists.add(Arrays.asList(0,1,5,5));
        assertEquals(lists, solution.fourSum(new int[]{0,1,5,0,1,5,5,-4}, 11));
    }

    @Test
    void fourSum1() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(-2, -1, 1, 2));
        lists.add(Arrays.asList(-2,  0, 0, 2));
        lists.add(Arrays.asList(-1,  0, 0, 1));
        assertEquals(lists, solution.fourSum2(new int[]{1, 0, -1, 0, -2, 2}, 0));

        lists.clear();
        lists.add(Arrays.asList(-4,5,5,5));
        lists.add(Arrays.asList(0,1,5,5));
        assertEquals(lists, solution.fourSum2(new int[]{0,1,5,0,1,5,5,-4}, 11));
    }
}
