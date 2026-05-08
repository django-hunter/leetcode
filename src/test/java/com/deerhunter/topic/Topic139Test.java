package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/10/23 17:05
 */
class Topic139Test {

    void test(BiFunction<String, List<String>, Boolean> function) {
        String s = "leetcode";
        List<String> wordDict = Arrays.asList("leet", "code");
        assertTrue(function.apply(s, wordDict));


        s = "applepenapple";
        wordDict = Arrays.asList("apple", "pen");
        assertTrue(function.apply(s, wordDict));


        s = "catsandog";
        wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        assertFalse(function.apply(s, wordDict));
    }

    @Test
    void solution1() {
        test(new Topic139.Solution()::wordBreak);
    }
}
