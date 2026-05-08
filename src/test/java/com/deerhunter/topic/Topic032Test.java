package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-17
 */
class Topic032Test {

    @Test
    void longestValidParentheses() {
        assertEquals(2, Topic032.longestValidParentheses("()"));
        assertEquals(4, Topic032.longestValidParentheses("(())"));
        assertEquals(4, Topic032.longestValidParentheses("()()"));
        assertEquals(4, Topic032.longestValidParentheses("()())(()"));
        assertEquals(4, Topic032.longestValidParentheses(")()())"));
        assertEquals(4, Topic032.longestValidParentheses("(()()((((("));
        assertEquals(2, Topic032.longestValidParentheses("(()"));
        assertEquals(6, Topic032.longestValidParentheses("()(())"));
    }

    @Test
    void longestValidParentheses2() {
        assertEquals(2, Topic032.longestValidParentheses2("()"));
        assertEquals(4, Topic032.longestValidParentheses2("(())"));
        assertEquals(4, Topic032.longestValidParentheses2("()()"));
        assertEquals(4, Topic032.longestValidParentheses2("()())(()"));
        assertEquals(4, Topic032.longestValidParentheses2(")()())"));
        assertEquals(4, Topic032.longestValidParentheses2("(()()((((("));
        assertEquals(2, Topic032.longestValidParentheses2("(()"));
        assertEquals(6, Topic032.longestValidParentheses2("()(())"));
    }
}
