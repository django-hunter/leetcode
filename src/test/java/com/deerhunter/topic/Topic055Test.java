package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-09
 */
class Topic055Test {
    @Test
    void solution1() {
        Topic055.Solution1 instance = new Topic055.Solution1();
        assertTrue(instance.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(instance.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void solution2() {
        Topic055.Solution2 instance = new Topic055.Solution2();
        assertTrue(instance.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(instance.canJump(new int[]{3,2,1,0,4}));
    }
    @Test
    void solution3() {
        Topic055.Solution3 instance = new Topic055.Solution3();
        assertTrue(instance.canJump(new int[]{0}));
        assertTrue(instance.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(instance.canJump(new int[]{3,2,1,0,4}));
    }

    @Test
    void solution4() {
        Topic055.Solution4 instance = new Topic055.Solution4();
        assertTrue(instance.canJump(new int[]{0}));
        assertTrue(instance.canJump(new int[]{2, 3, 1, 1, 4}));
        assertFalse(instance.canJump(new int[]{3,2,1,0,4}));
    }
}
