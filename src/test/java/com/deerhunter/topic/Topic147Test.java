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
 * @createTime 2020/11/5 17:44
 */
class Topic147Test {
    void test(Function<ListNode, ListNode> function) {
        ListNode l1 = Utils.createLinkList(4, 2, 1, 3);
        ListNode result = function.apply(l1);
        ListNode expect = Utils.createLinkList(1, 2, 3, 4);
        assertEquals(expect, result);
    }

    @Test
    void solution1() {
        test(new Topic147.Solution()::insertionSortList);
    }
}
