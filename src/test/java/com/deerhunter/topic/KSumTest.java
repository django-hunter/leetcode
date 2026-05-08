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
 * @date 2019-08-31
 */
class KSumTest {

    @Test
    void sum3Test() {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(-1, -1, 2));
        res.add(Arrays.asList(-1, 0, 1));
        assertEquals(res, KSum.kSum(new int[]{-1, 0, 1, 2, -1, -4}, 3, 0));
        res.clear();
        res.add(Arrays.asList(0, 0, 0));
        assertEquals(res, KSum.kSum(new int[]{0, 0, 0}, 3, 0));
    }

    @Test
    void sum4Test() {
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(Arrays.asList(-2, -1, 1, 2));
        lists.add(Arrays.asList(-2, 0, 0, 2));
        lists.add(Arrays.asList(-1, 0, 0, 1));
        assertEquals(lists, KSum.kSum(new int[]{1, 0, -1, 0, -2, 2}, 4, 0));

        lists.clear();
        lists.add(Arrays.asList(-4, 5, 5, 5));
        lists.add(Arrays.asList(0, 1, 5, 5));
        assertEquals(lists, KSum.kSum(new int[]{0, 1, 5, 0, 1, 5, 5, -4}, 4, 11));
    }
}
