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
 * @date 2020-03-15
 */
class Topic061Test {
    @Test
    void solution1() {
        Topic061.Solution1 instance = new Topic061.Solution1();
        ListNode list = Utils.createLinkList(1, 2, 3, 4, 5);
        ListNode newList = instance.rotateRight(list, 2);
        assertEquals(newList, Utils.createLinkList(4, 5, 1, 2, 3));

        list = Utils.createLinkList(0, 1, 2);
        newList = instance.rotateRight(list, 4);
        assertEquals(newList, Utils.createLinkList(2, 0, 1));

        list = Utils.createLinkList(0, 1, 2);
        newList = instance.rotateRight(list, 0);
        assertEquals(newList, list);

//        list = Utils.createLinkList(0, 1, 2);
//        newList = instance.rotateRight(list, 6);
//        assertEquals(newList, list);
    }
}
