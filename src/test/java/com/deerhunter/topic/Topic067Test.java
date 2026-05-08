package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-21
 */
class Topic067Test {
    @Test
    void solution1() {
        Topic067.Solution1 instance = new Topic067.Solution1();
        assertEquals("111", instance.addBinary("100", "11"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("1001", instance.addBinary("110", "11"));
        assertEquals("10101", instance.addBinary("1010", "1011"));
    }

    @Test
    void solution2() {
        Topic067.Solution2 instance = new Topic067.Solution2();
        assertEquals("111", instance.addBinary("100", "11"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("1001", instance.addBinary("110", "11"));
        assertEquals("10101", instance.addBinary("1010", "1011"));
    }

    @Test
    void parseBinary() {
        Topic067.Solution3 instance = new Topic067.Solution3();
        assertEquals(1, instance.parseBinary("1"));
        assertEquals(3, instance.parseBinary("11"));
        assertEquals(5, instance.parseBinary("101"));
        assertEquals(10, instance.parseBinary("1010"));
    }

    @Test
    void toBinary() {
        Topic067.Solution3 instance = new Topic067.Solution3();
        assertEquals("1", instance.toBinary(1));
        assertEquals("11", instance.toBinary(3));
        assertEquals("101", instance.toBinary(5));
        assertEquals("1010", instance.toBinary(10));
        assertEquals("0", instance.toBinary(0));

    }

    @Test
    void solution3() {
        Topic067.Solution3 instance = new Topic067.Solution3();
        assertEquals("111", instance.addBinary("100", "11"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("1001", instance.addBinary("110", "11"));
        assertEquals("10101", instance.addBinary("1010", "1011"));
    }

    @Test
    void solution4() {
        Topic067.Solution4 instance = new Topic067.Solution4();
        assertEquals("111", instance.addBinary("100", "11"));
        assertEquals("10", instance.addBinary("1", "1"));
        assertEquals("1001", instance.addBinary("110", "11"));
        assertEquals("10101", instance.addBinary("1010", "1011"));
    }
}
