package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-25
 */
class Topic070Test {
    @Test
    void solution1() {
        Topic070.Solution1 instance = new Topic070.Solution1();
        assertEquals(0, instance.climbStairs(0));
        assertEquals(1, instance.climbStairs(1));
        assertEquals(2, instance.climbStairs(2));
        assertEquals(3, instance.climbStairs(3));
        assertEquals(5, instance.climbStairs(4));
        assertEquals(8, instance.climbStairs(5));
    }
}
