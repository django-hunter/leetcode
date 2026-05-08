package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-31
 */
class Topic019Test {
    private Topic019 solution = new Topic019();

    @Test
    void removeNthFromEnd() {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 0; i < 5; i++) {
            cur.next = new ListNode(i + 1);
            cur = cur.next;
        }
        solution.removeNthFromEnd(head, 2);
        int index = 3;
        ListNode node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        assertEquals(3,node.val);

    }

    @Test
    void removeNthFromEnd2() {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i = 0; i < 5; i++) {
            cur.next = new ListNode(i + 1);
            cur = cur.next;
        }
        solution.removeNthFromEnd2(head, 2);
        int index = 3;
        ListNode node = head;
        for (int i = 0; i < index ; i++) {
            node = node.next;
        }
        assertEquals(3,node.val);

    }
}
