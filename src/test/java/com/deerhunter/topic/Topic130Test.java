package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/20 19:39
 */
class Topic130Test {

    void test(Consumer<char[][]> consumer) {
        char[][] board = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        consumer.accept(board);
        char[][] expected = new char[][]{
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], board[i]);
        }
    }

    @Test
    void solution1() {
        test(new Topic130.Solution1()::solve);
    }

    @Test
    void solution2() {
        test(new Topic130.Solution2()::solve);
    }
}
