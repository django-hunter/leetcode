package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import org.junit.jupiter.api.Test;

import static com.deerhunter.common.Utils.createLinkList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-03
 */
class Topic025Test {

    @Test
    void reverseKGroup() {
        ListNode list = createLinkList(1, 2, 3, 4, 5);
        ListNode actual1 = Topic025.reverseKGroup(list, 2);
        assertEquals(createLinkList(2, 1, 4, 3, 5), actual1);

        list = createLinkList(1, 2, 3, 4, 5);
        ListNode actual = Topic025.reverseKGroup(list, 3);
        assertEquals(createLinkList(3, 2, 1, 4, 5), actual);
    }

    @Test
    void reverseKGroup2() {
        ListNode list = createLinkList(1, 2, 3, 4, 5);
        ListNode actual1 = Topic025.reverseKGroup2(list, 2);
        assertEquals(createLinkList(2, 1, 4, 3, 5), actual1);

        list = createLinkList(1, 2, 3, 4, 5);
        ListNode actual = Topic025.reverseKGroup2(list, 3);
        assertEquals(createLinkList(3, 2, 1, 4, 5), actual);
    }
}
