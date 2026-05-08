package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/15 17:53
 */
class Topic122Test {
    void test(Function<int[], Integer> function) {
        int[] prices = new int[]{1, 2, 3, 4, 5};
        Integer maxProfit = function.apply(prices);
        assertEquals(4, maxProfit);

        prices = new int[]{7, 1, 5, 3, 6, 4};
        maxProfit = function.apply(prices);
        assertEquals(7, maxProfit);

        prices = new int[]{7, 6, 4, 3, 1};
        maxProfit = function.apply(prices);
        assertEquals(0, maxProfit);
    }

    @Test
    void solution1() {
        test(Topic122.Solution1::maxProfit);
    }

    @Test
    void solution2() {
        test(Topic122.Solution2::maxProfit);
    }
    @Test
    void solution3() {
        test(Topic122.Solution3::maxProfit);
    }

}
