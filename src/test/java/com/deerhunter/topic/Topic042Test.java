package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-11-19
 */
class Topic042Test {

    @Test
    void trap() {
        Topic042 solution = new Topic042();
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, solution.trap(new int[]{4, 2, 3}));
        assertEquals(3, solution.trap(new int[]{9,6,8,8,5,6,3}));
    }

    @Test
    void officialSolution1() {
        Topic042.OfficialSolution solution = new Topic042.OfficialSolution();
        assertEquals(6, solution.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, solution.trap(new int[]{4, 2, 3}));
        assertEquals(3, solution.trap(new int[]{9,6,8,8,5,6,3}));
    }

    @Test
    void officialSolution2() {
        Topic042.OfficialSolution solution = new Topic042.OfficialSolution();
        assertEquals(6, solution.trap2(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, solution.trap2(new int[]{4, 2, 3}));
        assertEquals(3, solution.trap2(new int[]{9,6,8,8,5,6,3}));
    }

    @Test
    void officialSolution3() {
        Topic042.OfficialSolution solution = new Topic042.OfficialSolution();
        assertEquals(6, solution.trap3(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, solution.trap3(new int[]{4, 2, 3}));
        assertEquals(3, solution.trap3(new int[]{9,6,8,8,5,6,3}));
    }
    @Test
    void officialSolution4() {
        Topic042.OfficialSolution solution = new Topic042.OfficialSolution();
        assertEquals(6, solution.trap4(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(1, solution.trap4(new int[]{4, 2, 3}));
        assertEquals(3, solution.trap4(new int[]{9,6,8,8,5,6,3}));
    }
}
