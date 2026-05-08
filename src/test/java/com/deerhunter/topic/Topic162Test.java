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
 * @createTime 2020/11/20 15:46
 */
class Topic162Test {
    void test(Function<int[], Integer> function) {
        assertEquals(2, function.apply(new int[]{1, 2, 3, 1}));
        Integer result = function.apply(new int[]{1, 2, 1, 3, 5, 6, 4});
        assert result == 1 || result == 5;
    }

    @Test
    void solution1() {
        test(new Topic162.Solution1()::findPeakElement);
    }


    @Test
    void solution2() {
        test(new Topic162.Solution2()::findPeakElement);
    }
}
