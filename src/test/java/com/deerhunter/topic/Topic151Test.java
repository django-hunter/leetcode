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
 * @createTime 2020/11/12 17:00
 */
class Topic151Test {
    void test(Function<String, String> function) {
        assertEquals("the sky is blue", function.apply("blue is sky the"));
        assertEquals("world! hello", function.apply("  hello world!  "));
        assertEquals("example good a", function.apply("a good   example"));
        assertEquals("Alice Loves Bob", function.apply("  Bob    Loves  Alice   "));
        assertEquals("bob like even not does Alice", function.apply("Alice does not even like bob"));
    }

    @Test
    void solution1() {
        test(new Topic151.Solution1()::reverseWords);
    }

    @Test
    void solution2() {
        test(new Topic151.Solution2()::reverseWords);
    }
}
