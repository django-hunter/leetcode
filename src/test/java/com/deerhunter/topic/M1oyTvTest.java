package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/4/20 下午11:04
 */
class M1oyTvTest {
    private M1oyTv instance = new M1oyTv();

    void test(BiFunction<String, String, String> function) {
        assertEquals("BANC", function.apply("ADOBECODEBANC", "ABC"));
    }

    @Test
    void minWindow() {
        test(instance::minWindow);
    }
}
