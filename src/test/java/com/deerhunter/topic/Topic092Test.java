package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import com.deerhunter.common.Utils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/4/14 15:56
 */
class Topic092Test {
    @Test
    void solution1() {
        Topic092.Solution1 instance = new Topic092.Solution1();
        ListNode head = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode expected = Utils.createLinkList(1, 4, 3, 2, 5);
        assertEquals(expected, instance.reverseBetween(head, 2, 4));
    }

    @Test
    void solution2() {
        Topic092.Solution2 instance = new Topic092.Solution2();
        ListNode head = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode expected = Utils.createLinkList(1, 4, 3, 2, 5);
        assertEquals(expected, instance.reverseBetween(head, 2, 4));
    }

    @Test
    void solution3() {
        Topic092.Solution3 instance = new Topic092.Solution3();
        ListNode head = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode expected = Utils.createLinkList(1, 4, 3, 2, 5);
        assertEquals(expected, instance.reverseBetween(head, 2, 4));
    }

    @Test
    void solution4() {
        Topic092.Solution4 instance = new Topic092.Solution4();
        ListNode head = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode expected = Utils.createLinkList(1, 4, 3, 2, 5);
        assertEquals(expected, instance.reverseBetween(head, 2, 4));
    }

    @Test
    void solution5() {
        Topic092.Solution5 instance = new Topic092.Solution5();
        ListNode head = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode expected = Utils.createLinkList(1, 4, 3, 2, 5);
        assertEquals(expected, instance.reverseBetween(head, 2, 4));
    }
}
