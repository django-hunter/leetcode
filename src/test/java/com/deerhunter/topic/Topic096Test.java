package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/5 17:25
 */
class Topic096Test {
    @Test
    void solution1() {
        assertEquals(1, Topic096.Solution1.numTrees(1));
        assertEquals(2, Topic096.Solution1.numTrees(2));
        assertEquals(5, Topic096.Solution1.numTrees(3));
        assertEquals(14, Topic096.Solution1.numTrees(4));
        assertEquals(42, Topic096.Solution1.numTrees(5));
    }
    @Test
    void solution2() {
        assertEquals(1, Topic096.Solution2.numTrees(1));
        assertEquals(2, Topic096.Solution2.numTrees(2));
        assertEquals(5, Topic096.Solution2.numTrees(3));
        assertEquals(14, Topic096.Solution2.numTrees(4));
        assertEquals(42, Topic096.Solution2.numTrees(5));
    }

    @Test
    void solution3() {
        assertEquals(1, Topic096.Solution3.numTrees(1));
        assertEquals(2, Topic096.Solution3.numTrees(2));
        assertEquals(5, Topic096.Solution3.numTrees(3));
        assertEquals(14, Topic096.Solution3.numTrees(4));
        assertEquals(42, Topic096.Solution3.numTrees(5));
    }
}
