package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-01
 */
class Topic022Test {

    @Test
    void generateParenthesis() {
        List<String> ans = new LinkedList<>();
        ans.add("((()))");
        ans.add("(()())");
        ans.add("(())()");
        ans.add("()(())");
        ans.add("()()()");
        assertEquals(ans, Topic022.generateParenthesis(3));
    }

    @Test
    void generateParenthesis2() {
        List<String> ans = new LinkedList<>();
        ans.add("()()()");
        ans.add("()(())");
        ans.add("(())()");
        ans.add("(()())");
        ans.add("((()))");
        assertEquals(ans, Topic022.generateParenthesis2(3));
    }
}
