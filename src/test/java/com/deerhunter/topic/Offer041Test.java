package com.deerhunter.topic;

import com.deerhunter.offer.Offer041;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/5/2 下午1:06
 */
class Offer041Test {

    @Test
    void testMinHeap() {
        Offer041.Heap minHeap = new Offer041.Heap(true);
        minHeap.push(5);
        minHeap.push(3);
        minHeap.push(4);
        minHeap.push(6);
        minHeap.push(1);
        minHeap.push(8);
        minHeap.push(2);
        minHeap.push(9);
        minHeap.push(7);
        for (int i = 1; i <= 9; i++) {
            assertEquals(i, minHeap.pop());
        }
    }

    @Test
    void testMedianFinder2() {
        Offer041.MedianFinder2 medianFinder = new Offer041.MedianFinder2();
        medianFinder.addNum(1);
        assertEquals(1, medianFinder.findMedian());
        medianFinder.addNum(2);
        assertEquals(1.5, medianFinder.findMedian());
        medianFinder.addNum(3);
        assertEquals(2, medianFinder.findMedian());

    }
}
