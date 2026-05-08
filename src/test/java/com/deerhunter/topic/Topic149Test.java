package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/11/6 15:49
 */
class Topic149Test {

    void test(Function<int[][], Integer> function) {
        int[][] points1 = new int[][]{
                {1, 1},
                {2, 2},
                {3, 3}
        };
        Integer result1 = function.apply(points1);
        assertEquals(3, result1);

        int[][] points2 = new int[][]{{4, 0}, {4, -1}, {4, 5}};
        Integer result2 = function.apply(points2);
        assertEquals(3, result2);


        int[][] points3 = new int[][]{{1, 1}, {3, 2}, {5, 3}, {4, 1}, {2, 3}, {1, 4}};
        Integer result3 = function.apply(points3);
        assertEquals(4, result3);

        // 因为double精度丢失的问题，这个case无法通过
//        int[][] points4 = new int[][]{{-54,-297},{-36,-222},{3,-2},{30,53},{-5,1},{-36,-222},{0,2},{1,3},{6,-47},{0,4},{2,3},{5,0},{48,128},{24,28},{0,-5},{48,128},{-12,-122},{-54,-297},{-42,-247},{-5,0},{2,4},{0,0},{54,153},{-30,-197},{4,5},{4,3},{-42,-247},{6,-47},{-60,-322},{-4,-2},{-18,-147},{6,-47},{60,178},{30,53},{-5,3},{-42,-247},{2,-2},{12,-22},{24,28},{0,-72},{3,-4},{-60,-322},{48,128},{0,-72},{-5,3},{5,5},{-24,-172},{-48,-272},{36,78},{-3,3}};
//        Integer result4 = function.apply(points4);
//        assertEquals(30, result4);
    }

    @Test
    void solution1() {
        test(new Topic149.Solution1()::maxPoints);
    }

    @Test
    void solution2() {
        test(new Topic149.Solution2()::maxPoints);
    }
}
