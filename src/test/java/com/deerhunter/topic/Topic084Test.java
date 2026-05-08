package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-04-02
 */
class Topic084Test {
    @Test
    void solution1() {
        Topic084.Solution1 instance = new Topic084.Solution1();
        assertEquals(10, instance.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    void solution2() {
        Topic084.Solution2 instance = new Topic084.Solution2();
        assertEquals(10, instance.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    void solution3() {
        Topic084.Solution3 instance = new Topic084.Solution3();
        assertEquals(10, instance.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }
}
