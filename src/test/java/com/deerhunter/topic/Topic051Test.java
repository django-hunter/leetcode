package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-07
 */
class Topic051Test {
    @Test
    void solution1() {
        Topic051.Solution1 instance = new Topic051.Solution1();
        List<List<String>> lists = instance.solveNQueens(4);
        assertIterableEquals(Arrays.asList(".Q..", "...Q", "Q...", "..Q."), lists.get(0));
        assertIterableEquals(Arrays.asList("..Q.", "Q...", "...Q", ".Q.."), lists.get(1));
    }
}
