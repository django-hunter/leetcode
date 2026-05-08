package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-27
 */
class Topic074Test {
    @Test
    void solution1() {
        Topic074.Solution instance = new Topic074.Solution();

        int[][] matrix = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        assertTrue(instance.searchMatrix(matrix, 3));


        assertFalse(instance.searchMatrix(matrix, 13));


    }
}
