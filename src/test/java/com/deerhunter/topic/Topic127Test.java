package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/18 18:22
 */
class Topic127Test {
    @FunctionalInterface
    public interface TriFunction<A, B, C, D> {
        public D apply(A a, B b, C c);
    }

    void test(Topic126Test.TriFunction<String, String, List<String>, Integer> function) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        Integer result = function.apply(beginWord, endWord, wordList);
        assertEquals(5, result);

        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
         result = function.apply(beginWord, endWord, wordList);
        assertEquals(0, result);

        beginWord = "hot";
        endWord = "dog";
        wordList = Arrays.asList("hot", "dog");
        result = function.apply(beginWord, endWord, wordList);
        assertEquals(0, result);

        beginWord = "ab";
        endWord = "yx";
        wordList = Arrays.asList("ap", "aq", "zp", "zq", "zx", "yx");
        result = function.apply(beginWord, endWord, wordList);
        assertEquals(5, result);
    }

    @Test
    void solution1() {
        test(new Topic127.Solution1()::ladderLength);

    }

    @Test
    void solution2() {
        test(new Topic127.Solution2()::ladderLength);

    }
}
