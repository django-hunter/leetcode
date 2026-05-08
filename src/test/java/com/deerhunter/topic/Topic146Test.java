package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/11/5 14:08
 */
class Topic146Test {
    void test(Topic146.ILRUCache lruCache) {
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        assertEquals(1, lruCache.get(1));
        lruCache.put(3, 3);
        assertEquals(-1, lruCache.get(2));
        lruCache.put(4, 4);
        assertEquals(-1, lruCache.get(1));
        assertEquals(3, lruCache.get(3));
        assertEquals(4, lruCache.get(4));
    }

    @Test
    void test1() {
        test(new Topic146.LRUCache(2));
    }

    @Test
    void test2() {
        test(new Topic146.LRUCache2(2));
    }
}
