package com.deerhunter.topic;

import com.deerhunter.common.ListNode;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static com.deerhunter.common.Utils.createLinkList;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/12/22 11:43
 */
class Topic160Test {
    void batchTest(BiFunction<ListNode, ListNode, ListNode> function) {
        int[][][] testCases = {
                {
                        {4, 1}, {5, 0, 1}, {8, 4, 5}
                },
                {
                        {0, 9, 1}, {3}, {2, 4}
                },
                {
                        {2, 6, 4}, {1, 5}, {}
                }
        };
        for (int[][] testCase : testCases) {
            test(testCase[0], testCase[1], testCase[2], function);
        }
    }

    void test(int[] a, int[] b, int[] tail, BiFunction<ListNode, ListNode, ListNode> function) {
        ListNode tailHead = createLinkList(tail);
        ListNode lA = createLinkList(a).add(tailHead);
        ListNode lB = createLinkList(b).add(tailHead);
        assertEquals(tailHead, function.apply(lA, lB));
    }

    @Test
    void solution1() {
        batchTest(new Topic160.Solution1()::getIntersectionNode);
    }

    @Test
    void solution2() {
        batchTest(new Topic160.Solution2()::getIntersectionNode);
    }
}
