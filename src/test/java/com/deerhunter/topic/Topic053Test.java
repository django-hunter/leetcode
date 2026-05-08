package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-08
 */
class Topic053Test {
    @Test
    void solution1() {
        Topic053.Solution1 instance = new Topic053.Solution1();
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void solution2() {
        Topic053.Solution2 instance = new Topic053.Solution2();
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    void solution3() {
        Topic053.Solution3 instance = new Topic053.Solution3();
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(-1, instance.maxSubArray(new int[]{-2, -1}));
    }

    @Test
    void solution4() {
        Topic053.Solution4 instance = new Topic053.Solution4();
        assertEquals(6, instance.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        assertEquals(-1, instance.maxSubArray(new int[]{-2, -1}));
    }
}
