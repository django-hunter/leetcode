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
 * @createTime 2020/9/16 11:58
 */
class Topic123Test {

    void test(Function<int[], Integer> function) {
        int[] prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        Integer maxProfit = function.apply(prices);
        assertEquals(6, maxProfit);

        prices = new int[]{1, 2, 3, 4, 5};
        maxProfit = function.apply(prices);
        assertEquals(4, maxProfit);

        prices = new int[]{3, 3, 5, 0, 0, 3, 1, 4};
        maxProfit = function.apply(prices);
        assertEquals(6, maxProfit);

        prices = new int[]{3, 2, 6, 5, 0, 3};
        maxProfit = function.apply(prices);
        assertEquals(7, maxProfit);
    }

    @Test
    void solution1() {
        test(Topic123.Solution::maxProfit);
    }

    @Test
    void solution2() {
        test(Topic123.Solution2::maxProfit);
    }

    @Test
    void solution3() {
        test(Topic123.Solution3::maxProfit);
    }

    @Test
    void solution4() {
        test(Topic123.Solution4::maxProfit);
    }

    @Test
    void solution5() {
        test(Topic123.Solution5::maxProfit);
    }
}
