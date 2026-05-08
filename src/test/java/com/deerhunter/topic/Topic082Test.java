package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import org.junit.jupiter.api.Test;

import static com.deerhunter.common.Utils.createLinkList;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-04-01
 */
class Topic082Test {

    @Test
    void solution1() {
        Topic082.Solution1 instance = new Topic082.Solution1();
        ListNode list = createLinkList(1, 2, 3, 3, 4, 4, 5);
        ListNode expected = createLinkList(1, 2, 5);
        list = instance.deleteDuplicates(list);
        assertEquals(list, expected);

        list = createLinkList(1, 1, 1, 2, 3);
        expected = createLinkList(2, 3);
        list = instance.deleteDuplicates(list);
        assertEquals(list, expected);
    }

    @Test
    void solution2() {
        Topic082.Solution2 instance = new Topic082.Solution2();
        ListNode list = createLinkList(1, 2, 3, 3, 4, 4, 5);
        ListNode expected = createLinkList(1, 2, 5);
        list = instance.deleteDuplicates(list);
        assertEquals(list, expected);

        list = createLinkList(1, 1, 1, 2, 3);
        expected = createLinkList(2, 3);
        list = instance.deleteDuplicates(list);
        assertEquals(list, expected);
    }
}
