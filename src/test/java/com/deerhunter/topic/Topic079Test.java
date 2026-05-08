package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-29
 */
class Topic079Test {
    @Test
    void solution1() {
        Topic079.Solution1 instance = new Topic079.Solution1();

        char[][] board = {
                {'A', 'B', 'C', 'E'},
                {'S', 'F', 'C', 'S'},
                {'A', 'D', 'E', 'E'}
        };
//        assertTrue(instance.exist(board,"ABCCED"));
//        assertTrue(instance.exist(board,"SEE"));
        assertFalse(instance.exist(board,"ABCB"));
    }
}
