package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-26
 */
class Topic072Test {

    @Test
    void solution1() {
        Topic072.Solution1 instance = new Topic072.Solution1();
        assertEquals(3,instance.minDistance("horse","ros"));
        assertEquals(5,instance.minDistance("intention","execution"));
        assertEquals(1,instance.minDistance("","a"));
        assertEquals(1,instance.minDistance("b",""));
        assertEquals(6,instance.minDistance("industry","interest"));
    }

    @Test
    void solution2() {
        Topic072.Solution2 instance = new Topic072.Solution2();
        assertEquals(3,instance.minDistance("horse","ros"));
        assertEquals(5,instance.minDistance("intention","execution"));
        assertEquals(1,instance.minDistance("","a"));
        assertEquals(1,instance.minDistance("b",""));
        assertEquals(6,instance.minDistance("industry","interest"));
        assertEquals(27,instance.minDistance("pneumonoultramicroscopicsilicovolcanoconiosis","ultramicroscopically"));
    }

}
