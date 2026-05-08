package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 18:56
 */
class Topic087Test {
    @Test
    void solution1() {
        Topic087.Solution1 instance = new Topic087.Solution1();
        assertTrue(instance.isScramble("abb", "bab"));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb"));
        assertFalse(instance.isScramble("abcde", "caebd"));
    }

    @Test
    void solution2() {
        Topic087.Solution2 instance = new Topic087.Solution2();
        assertTrue(instance.isScramble("abb", "bab"));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb"));
        assertFalse(instance.isScramble("abcde", "caebd"));
    }

    @Test
    void solution3() {
        Topic087.Solution3 instance = new Topic087.Solution3();
        assertTrue(instance.isScramble("abb", "bab" ));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb" ));
        assertFalse(instance.isScramble("abcde", "caebd" ));
    }

    @Test
    void solution4() {
        Topic087.Solution4 instance = new Topic087.Solution4();
        assertTrue(instance.isScramble("abb", "bab" ));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb" ));
        assertFalse(instance.isScramble("abcde", "caebd" ));
    }


    @Test
    void solution5() {
        Topic087.Solution5 instance = new Topic087.Solution5();
        assertTrue(instance.isScramble("abb", "bab" ));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb" ));
        assertFalse(instance.isScramble("abcde", "caebd" ));
    }

    @Test
    void solution6() {
        Topic087.Solution6 instance = new Topic087.Solution6();
        assertTrue(instance.isScramble("abb", "bab" ));
        assertTrue(instance.isScramble("great", "rgeat"));
        assertTrue(instance.isScramble("abab", "aabb" ));
        assertFalse(instance.isScramble("abcde", "caebd" ));
    }
}
