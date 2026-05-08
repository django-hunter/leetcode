package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/18 00:28
 */
class Topic126Test {
    @FunctionalInterface
    public interface TriFunction<A, B, C, D> {
        public D apply(A a, B b, C c);
    }

    void test(TriFunction<String, String, List<String>, List<List<String>>> function) {
        String beginWord = "hit";
        String endWord = "cog";
        List<String> wordList = Arrays.asList("hot", "dot", "dog", "lot", "log", "cog");
        List<List<String>> result = function.apply(beginWord, endWord, wordList);
        List<List<String>> expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList("hit", "hot", "lot", "log", "cog"));
        expectedResult.add(Arrays.asList("hit", "hot", "dot", "dog", "cog"));
        assertEquals(expectedResult.size(), result.size());
        for (List<String> expectedLine : expectedResult) {
            boolean findMatch = false;
            for (List<String> line : result) {
                if (Objects.equals(expectedLine, line)) {
                    findMatch = true;
                    break;
                }
            }
            assertTrue(findMatch);
        }

        beginWord = "hit";
        endWord = "cog";
        wordList = Arrays.asList("hot", "dot", "dog", "lot", "log");
        result = function.apply(beginWord, endWord, wordList);
        assertEquals(0, result.size());

        beginWord = "hot";
        endWord = "dog";
        wordList = Arrays.asList("hot", "dog");
        result = function.apply(beginWord, endWord, wordList);
        assertEquals(0, result.size());

        beginWord = "ab";
        endWord = "yx";
        wordList = Arrays.asList("ap", "aq", "zp", "zq", "zx", "yx");
        result = function.apply(beginWord, endWord, wordList);
        expectedResult = new ArrayList<>();
        expectedResult.add(Arrays.asList("ab", "aq", "zq", "zx", "yx"));
        expectedResult.add(Arrays.asList("ab", "ap", "zp", "zx", "yx"));
        assertEquals(expectedResult.size(), result.size());
        for (List<String> expectedLine : expectedResult) {
            boolean findMatch = false;
            for (List<String> line : result) {
                if (Objects.equals(expectedLine, line)) {
                    findMatch = true;
                    break;
                }
            }
            assertTrue(findMatch);
        }
    }

    @Test
    void solution1() {
        test(new Topic126.Solution1()::findLadders);
    }


    @Test
    void solution2() {
        test(new Topic126.Solution2()::findLadders);
    }

    @Test
    void solution3() {
        test(new Topic126.Solution3()::findLadders);
    }

    @Test
    void solution4() {
        test(new Topic126.Solution4()::findLadders);
    }

}
