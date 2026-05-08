package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/15 16:37
 */
class Topic121Test {

    @Test
    void solution1() {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        int maxProfit = Topic121.Solution.maxProfit(prices);
        assertEquals(5, maxProfit);

        prices = new int[]{7, 6, 4, 3, 1};
        maxProfit = Topic121.Solution.maxProfit(prices);
        assertEquals(0, maxProfit);
    }
}
