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
class Topic021Test {

    @Test
    void mergeTwoLists() {
        int[] nums1 = new int[]{1, 2, 4};
        int[] nums2 = new int[]{1, 3, 4};
        int[] nums3 = new int[]{1, 1, 2, 3, 4, 4};
        ListNode head1 = new ListNode(0);
        ListNode l1 = head1;
        ListNode head2 = new ListNode(0);
        ListNode l2 = head2;

        for (int value : nums1) {
            l1.next = new ListNode(value);
            l1 = l1.next;
        }
        head1 = head1.next;

        for (int value : nums2) {
            l2.next = new ListNode(value);
            l2 = l2.next;
        }
        head2 = head2.next;

        ListNode l3 = Topic021.mergeTwoLists(head1, head2);
        for (int i = 0; i < nums3.length; i++) {
            assertEquals(nums3[i], l3.val);
            l3 = l3.next;
        }

    }
}
