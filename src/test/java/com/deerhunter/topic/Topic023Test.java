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
 * @date 2019-09-01
 */
class Topic023Test {

    @Test
    void mergeKLists() {
        ListNode l1 = Utils.createLinkList(new int[]{1, 4, 5});
        ListNode l2 = Utils.createLinkList(new int[]{1, 3, 4});
        ListNode l3 = Utils.createLinkList(new int[]{2, 6});
        ListNode merged = Utils.createLinkList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(merged, Topic023.mergeKLists(new ListNode[]{l1, l2, l3}));
    }

    @Test
    void mergeKLists2() {
        ListNode l1 = Utils.createLinkList(new int[]{1, 4, 5});
        ListNode l2 = Utils.createLinkList(new int[]{1, 3, 4});
        ListNode l3 = Utils.createLinkList(new int[]{2, 6});
        ListNode merged = Utils.createLinkList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(merged, Topic023.mergeKLists2(new ListNode[]{l1, l2, l3}));
    }

    @Test
    void mergeKLists3() {
        ListNode l1 = Utils.createLinkList(new int[]{1, 4, 5});
        ListNode l2 = Utils.createLinkList(new int[]{1, 3, 4});
        ListNode l3 = Utils.createLinkList(new int[]{2, 6});
        ListNode merged = Utils.createLinkList(new int[]{1, 1, 2, 3, 4, 4, 5, 6});
        assertEquals(merged, Topic023.mergeKLists3(new ListNode[]{l1, l2, l3}));
    }
}
