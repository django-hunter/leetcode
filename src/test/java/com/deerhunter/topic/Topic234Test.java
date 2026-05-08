package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import com.deerhunter.common.Utils;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 6/30/21 4:51 PM
 */
class Topic234Test {

    void test(Function<ListNode, Boolean> function) {
//        assertFalse(function.apply(Utils.createLinkList(1, 2, 3)));
        assertFalse(function.apply(Utils.createLinkList(1, 2)));
        assertTrue(function.apply(Utils.createLinkList(1, 2, 3, 2, 1)));
        assertTrue(function.apply(Utils.createLinkList(1, 2, 3, 3, 2, 1)));
    }

    @Test
    void solution1() {
        test(new Topic234.Solution1()::isPalindrome);
    }

    @Test
    void solution2() {
        test(new Topic234.Solution2()::isPalindrome);
    }

    @Test
    void solution3() {
        test(new Topic234.Solution3()::isPalindrome);
    }
}
