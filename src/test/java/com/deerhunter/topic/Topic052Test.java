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
class Topic052Test {
    @Test
    void solution1() {
        Topic052.Solution1 instance = new Topic052.Solution1();
        assertEquals(2, instance.totalNQueens(4));
    }
}
