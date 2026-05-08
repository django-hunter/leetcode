package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-03
 */
class Topic045Test {
    @Test
    void solution1() {
        assertEquals(2, Topic045.Solution1.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(3, Topic045.Solution1.jump(new int[]{1, 2, 1, 1, 1}));
    }

    @Test
    void solution2() {
        assertEquals(2, Topic045.Solution2.jump(new int[]{2, 3, 1, 1, 4}));
        assertEquals(3, Topic045.Solution2.jump(new int[]{1, 2, 1, 1, 1}));
    }

    @Test
    void solution3() {
//        assertEquals(2, Topic045.Solution3.jump(new int[]{2, 3, 1, 1, 4}));
//        assertEquals(3, Topic045.Solution3.jump(new int[]{1, 2, 1, 1, 1}));
        assertEquals(3, Topic045.Solution3.jump(new int[]{1, 2, 3, 4, 5}));
    }
}
