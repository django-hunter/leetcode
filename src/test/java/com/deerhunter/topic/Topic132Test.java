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
 * @createTime 2020/9/21 15:55
 */
class Topic132Test {
    void test(Function<String, Integer> function) {
        assertEquals(1, function.apply("aab"));
        assertEquals(2, function.apply("leet"));
        assertEquals(0, function.apply("aabaa"));
    }

    @Test
    void solution1() {
        test(new Topic132.Solution1()::minCut);
    }

    @Test
    void solution2() {
        test(new Topic132.Solution2()::minCut);
    }

    @Test
    void solution3() {
        test(new Topic132.Solution3()::minCut);
    }

    @Test
    void solution4() {
        test(new Topic132.Solution4()::minCut);
    }
}
