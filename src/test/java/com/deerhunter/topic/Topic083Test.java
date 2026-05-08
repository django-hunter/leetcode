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
 * @date 2020-04-01
 */
class Topic083Test {
    @Test
    void solution1() {
        Topic083.Solution1 instance = new Topic083.Solution1();
        ListNode list = createLinkList(1, 2, 2, 4, 4, 5);
        list = instance.deleteDuplicates(list);
        ListNode expected = createLinkList(1, 2, 4, 5);
        assertEquals(list, expected);

        list = createLinkList(1, 1,1,1,1);
        list = instance.deleteDuplicates(list);
         expected = createLinkList(1);
        assertEquals(list, expected);
    }

    @Test
    void solution2() {
        Topic083.Solution2 instance = new Topic083.Solution2();
        ListNode list = createLinkList(1, 2, 2, 4, 4, 5);
        list = instance.deleteDuplicates(list);
        ListNode expected = createLinkList(1, 2, 4, 5);
        assertEquals(list, expected);

        list = createLinkList(1, 1,1,1,1);
        list = instance.deleteDuplicates(list);
        expected = createLinkList(1);
        assertEquals(list, expected);
    }
}
