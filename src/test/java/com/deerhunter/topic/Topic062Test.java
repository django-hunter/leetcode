package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-15
 */
class Topic062Test {
    @Test
    void solution1() {
        Topic062.Solution1 instance = new Topic062.Solution1();
        assertEquals(3, instance.uniquePaths(3, 2));
        assertEquals(28, instance.uniquePaths(7, 3));
    }

    @Test
    void solution2() {
        Topic062.Solution2 instance = new Topic062.Solution2();
        assertEquals(3, instance.uniquePaths(3, 2));
        assertEquals(28, instance.uniquePaths(7, 3));
        assertEquals(48620, instance.uniquePaths(10, 10));
        assertEquals(193536720, instance.uniquePaths(23, 12));
    }

    @Test
    void solution3() {
        Topic062.Solution3 instance = new Topic062.Solution3();
        assertEquals(3, instance.uniquePaths(3, 2));
        assertEquals(28, instance.uniquePaths(7, 3));
        assertEquals(48620, instance.uniquePaths(10, 10));
        assertEquals(193536720, instance.uniquePaths(23, 12));
    }

    @Test
    void factorial() {
        Topic062.Solution3 instance = new Topic062.Solution3();
        assertEquals(1,instance.factorial(0));
        assertEquals(1,instance.factorial(1));
        assertEquals(2,instance.factorial(2));
        assertEquals(6,instance.factorial(3));
        assertEquals(24,instance.factorial(4));
        assertEquals(120,instance.factorial(5));
    }
}
