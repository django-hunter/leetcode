package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-28
 */
class Topic076Test {
    @Test
    void solution1() {
        Topic076.Solution1 instance = new Topic076.Solution1();
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC","ABC"));
    }

    @Test
    void solution2() {
        Topic076.Solution2 instance = new Topic076.Solution2();
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC","ABC"));
    }


    @Test
    void solution3() {
        Topic076.Solution3 instance = new Topic076.Solution3();
        assertEquals("BANC", instance.minWindow("ADOBECODEBANC","ABC"));
    }

}
