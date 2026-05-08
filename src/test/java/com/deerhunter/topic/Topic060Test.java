package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-12
 */
class Topic060Test {
    @Test
    void solution1() {
        Topic060.Solution1 instance = new Topic060.Solution1();
        assertEquals("213", instance.getPermutation(3, 3));
        assertEquals("2314", instance.getPermutation(4, 9));
    }

    @Test
    void solution2() {
        Topic060.Solution2 instance = new Topic060.Solution2();
        assertEquals("213", instance.getPermutation(3, 3));
        assertEquals("2314", instance.getPermutation(4, 9));
    }

    @Test
    void solution3() {
        Topic060.Solution3 instance = new Topic060.Solution3();
        assertEquals("213", instance.getPermutation(3, 3));
        assertEquals("2314", instance.getPermutation(4, 9));
    }
}

