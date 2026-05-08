package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static com.deerhunter.common.Utils.createLinkList;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020/4/8
 */
class Topic086Test {
    @Test
    void solution1() {
        Topic086.Solution1 instance = new Topic086.Solution1();
        ListNode list = createLinkList(4, 3, 2, 5, 2);
        ListNode expected = createLinkList(2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 4, 3, 2, 5, 2);
        expected = createLinkList(1, 2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 1);
        expected = createLinkList(1, 1);
        assertEquals(expected, instance.partition(list, 2));

        list = createLinkList(2, 1);
        expected = createLinkList(1, 2);
        assertEquals(expected, instance.partition(list, 2));
    }

    @Test
    void solution2() {
        Topic086.Solution2 instance = new Topic086.Solution2();
        ListNode list = createLinkList(1, 4, 3, 2, 5, 2);
        ListNode expected = createLinkList(1, 2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 1);
        expected = createLinkList(1, 1);
        assertEquals(expected, instance.partition(list, 2));

        list = createLinkList(2, 1);
        expected = createLinkList(1, 2);
        assertEquals(expected, instance.partition(list, 2));
    }

    @Test
    void solution3() {
        Topic086.Solution3 instance = new Topic086.Solution3();

        ListNode list = createLinkList(4, 3, 2, 5, 2);
        ListNode expected = createLinkList(2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 4, 3, 2, 5, 2);
        expected = createLinkList(1, 2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 1);
        expected = createLinkList(1, 1);
        assertEquals(expected, instance.partition(list, 2));

        list = createLinkList(2, 1);
        expected = createLinkList(1, 2);
        assertEquals(expected, instance.partition(list, 2));
    }

    @Test
    void solution4() {
        Topic086.Solution4 instance = new Topic086.Solution4();

        ListNode list = createLinkList(4, 3, 2, 5, 2);
        ListNode expected = createLinkList(2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 4, 3, 2, 5, 2);
        expected = createLinkList(1, 2, 2, 4, 3, 5);
        assertEquals(expected, instance.partition(list, 3));

        list = createLinkList(1, 1);
        expected = createLinkList(1, 1);
        assertEquals(expected, instance.partition(list, 2));

        list = createLinkList(2, 1);
        expected = createLinkList(1, 2);
        assertEquals(expected, instance.partition(list, 2));
    }
}
