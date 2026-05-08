package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import com.deerhunter.common.Utils;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/11/6 10:51
 */
class Topic148Test {
    void test(Function<ListNode, ListNode> function) {
        ListNode l1 = Utils.createLinkList(4, 2, 1, 3);
        ListNode result = function.apply(l1);
        ListNode expect1 = Utils.createLinkList(1, 2, 3, 4);
        assertEquals(expect1, result);


        ListNode l2 = Utils.createLinkList(-1, 5, 3, 4, 0);
        ListNode result2 = function.apply(l2);
        ListNode expect2 = Utils.createLinkList(-1, 0, 3, 4, 5);
        assertEquals(expect2, result2);
    }

    @Test
    void solution1() {
        test(new Topic148.Solution1()::sortList);
    }

    @Test
    void solution2() {
        test(new Topic148.Solution2()::sortList);
    }

    @Test
    void solution3() {
        test(new Topic148.Solution3()::sortList);
    }
}
