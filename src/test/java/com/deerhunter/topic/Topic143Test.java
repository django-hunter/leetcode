package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import com.deerhunter.common.Utils;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/10/30 14:31
 */
class Topic143Test {
    void test(Consumer<ListNode> consumer) {
        ListNode list = Utils.createLinkList(1, 2, 3, 4);
        consumer.accept(list);
        ListNode expect = Utils.createLinkList(1, 4, 2, 3);
        assertEquals(expect, list);

        list = Utils.createLinkList(1, 2, 3, 4, 5);
        consumer.accept(list);
        expect = Utils.createLinkList(1, 5, 2, 4, 3);
        assertEquals(expect, list);
    }

    @Test
    void solution1() {
        test(new Topic143.Solution1()::reorderList);
    }

    @Test
    void solution2() {
        test(new Topic143.Solution2()::reorderList);
    }

    @Test
    void solution3() {
        test(new Topic143.Solution3()::reorderList);
    }
}
