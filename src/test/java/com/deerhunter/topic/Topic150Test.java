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
 * @createTime 2020/11/12 16:41
 */
class Topic150Test {
    void test(Function<String[], Integer> function) {
        assertEquals(9, function.apply(new String[]{"2", "1", "+", "3", "*"}));
        assertEquals(6, function.apply(new String[]{"4", "13", "5", "/", "+"}));
        assertEquals(22, function.apply(new String[]{"10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+"}));
    }

    @Test
    void solution1() {
        test(new Topic150.Solution1()::evalRPN);
    }
}
