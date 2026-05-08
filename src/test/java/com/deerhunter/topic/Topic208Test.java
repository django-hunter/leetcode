package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-28
 */
class Topic208Test {
    private Topic208.Trie2 trie2 = new Topic208.Trie2();
    private Topic208.Trie trie = new Topic208.Trie();

    @Test
    void testTrie2() {

        trie2.insert("apple");
        assertTrue(trie2.search("apple"));   // 返回 true
        assertFalse(trie2.search("app"));     // 返回 false
        assertTrue(trie2.startsWith("app")); // 返回 true
        trie2.insert("app");
        assertTrue(trie2.search("app"));     // 返回 true
    }

    @Test
    void testTrie() {

        trie.insert("apple");
        assertTrue(trie.search("apple"));   // 返回 true
        assertFalse(trie.search("app"));     // 返回 false
        assertTrue(trie.startsWith("app")); // 返回 true
        trie.insert("app");
        assertTrue(trie.search("app"));     // 返回 true
    }
}
