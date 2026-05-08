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
 * @date 2019-08-28
 */
class Topic015Test {
    private Topic015 solution = new Topic015();

    @Test
    void threeSum1() {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(-1, 0, 1));
        res.add(Arrays.asList(-1, -1, 2));
        assertEquals(res, solution.threeSum1(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    void threeSum() {
        List<List<Integer>> res = new ArrayList<>();
        res.add(Arrays.asList(-1, -1, 2));
        res.add(Arrays.asList(-1, 0, 1));
        assertEquals(res, solution.threeSum2(new int[]{-1, 0, 1, 2, -1, -4}));
        res.clear();
        res.add(Arrays.asList(0, 0, 0));
        assertEquals(res, solution.threeSum2(new int[]{0,0,0}));
    }
}
