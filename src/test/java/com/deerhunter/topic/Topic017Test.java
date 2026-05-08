package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-30
 */
class Topic017Test {
    private Topic017 solution = new Topic017();

    @Test
    void letterCombinations() {
        assertEquals(Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"), solution.letterCombinations("23"));
    }
}
