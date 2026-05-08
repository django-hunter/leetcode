package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;

import static com.deerhunter.topic.TestUtils.assertEqualsIgnoreOrder;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/10/23 17:34
 */
class Topic140Test {
    void test(BiFunction<String, List<String>, List<String>> function) {
        String s = "catsanddog";
        List<String> words = Arrays.asList("cat", "cats", "and", "sand", "dog");
        List<String> result = function.apply(s, words);
        List<String> expected = Arrays.asList("cats and dog", "cat sand dog");
        TestUtils.assertEqualsIgnoreOrder(expected, result);


        s = "pineapplepenapple";
        words = Arrays.asList("apple", "pen", "applepen", "pine", "pineapple");
        result = function.apply(s, words);
        expected = Arrays.asList("pine apple pen apple",
                "pineapple pen apple",
                "pine applepen apple");
        TestUtils.assertEqualsIgnoreOrder(expected, result);

        s = "catsandog";
        words = Arrays.asList("cats", "dog", "sand", "and", "cat");
        result = function.apply(s, words);
        expected = new ArrayList<>();
        TestUtils.assertEqualsIgnoreOrder(expected, result);
    }

    @Test
    void solution1() {
        test(new Topic140.Solution1()::wordBreak);
    }

    @Test
    void solution2() {
        test(new Topic140.Solution2()::wordBreak);
    }

    @Test
    void solution3() {
        test(new Topic140.Solution3()::wordBreak);
    }

    @Test
    void solution4() {
        test(new Topic140.Solution4()::wordBreak);
    }
}
