package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-12
 */
class Topic058Test {
    @Test
    void solution1() {
        Topic058.Solution1 instance = new Topic058.Solution1();
        assertEquals(0, instance.lengthOfLastWord(""));
        assertEquals(1, instance.lengthOfLastWord("a"));
        assertEquals(1, instance.lengthOfLastWord("a "));
        assertEquals(1, instance.lengthOfLastWord("aa b"));
        assertEquals(3, instance.lengthOfLastWord("aa bv arc"));
    }
}
