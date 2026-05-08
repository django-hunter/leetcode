package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/1/29 17:43
 */
class Topic207Test {
    public static void test(BiFunction<Integer, int[][], Boolean> function) {
//        int nCourses1 = 7;
//        int[][] prerequisites1 = {
//                {1, 0},
//                {0, 3},
//                {0, 2},
//                {3, 2},
//                {2, 5},
//                {4, 5},
//                {5, 6},
//                {2, 4}
//        };
//        assertTrue(function.apply(nCourses1, prerequisites1));
//
//        int nCourses2 = 5;
//        int[][] prerequisites2 = {
//                {3, 1},
//                {3, 2},
//                {1, 4},
//                {2, 4}
//        };
//        assertTrue(function.apply(nCourses2, prerequisites2));


        int nCourses3 = 4;
        int[][] prerequisites3 = {
                {0, 1},
                {0, 2},
                {1, 3},
                {3, 0}
        };
        assertFalse(function.apply(nCourses3, prerequisites3));
    }

    @Test
    void solution1() {
        test(new Topic207.Solution1()::canFinish);
    }

    @Test
    void solution2() {
        test(new Topic207.Solution2()::canFinish);
    }
}
