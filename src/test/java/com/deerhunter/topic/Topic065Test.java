package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-18
 */
class Topic065Test {
    @Test
    void solution1() {
        Topic065.Solution1 instance = new Topic065.Solution1();
        assertTrue(instance.isNumber(" 1 "));
        assertTrue(instance.isNumber(" .1 "));
        assertTrue(instance.isNumber("3."));
        assertTrue(instance.isNumber(" +1 "));
        assertTrue(instance.isNumber("-1"));
        assertTrue(instance.isNumber("1.2e2"));
        assertTrue(instance.isNumber("1.32"));
        assertTrue(instance.isNumber("1e10"));
        assertTrue(instance.isNumber("-1e-32"));
        assertTrue(instance.isNumber("-1.2e-32"));
        assertTrue(instance.isNumber("-1.2"));
        assertTrue(instance.isNumber(".3e1"));
        assertFalse(instance.isNumber("1a"));
        assertFalse(instance.isNumber("1-1"));
        assertFalse(instance.isNumber("1-1.e"));
        assertFalse(instance.isNumber("e12"));
        assertFalse(instance.isNumber("1e12.2"));
        assertFalse(instance.isNumber("1.2e1a"));
        assertFalse(instance.isNumber("1.2 e2"));
        assertFalse(instance.isNumber("."));
    }

    @Test
    void solution2() {
        Topic065.Solution2 instance = new Topic065.Solution2();
        assertTrue(instance.isNumber(" 1 "));
        assertTrue(instance.isNumber(" .1 "));
        assertTrue(instance.isNumber("3."));
        assertTrue(instance.isNumber(" +1 "));
        assertTrue(instance.isNumber("-1"));
        assertTrue(instance.isNumber("1.2e2"));
        assertTrue(instance.isNumber("1.32"));
        assertTrue(instance.isNumber("1e10"));
        assertTrue(instance.isNumber("-1e-32"));
        assertTrue(instance.isNumber("-1.2e-32"));
        assertTrue(instance.isNumber("-1.2"));
        assertTrue(instance.isNumber(".3e1"));
        assertFalse(instance.isNumber("1a"));
        assertFalse(instance.isNumber("1-1"));
        assertFalse(instance.isNumber("1-1.e"));
        assertFalse(instance.isNumber("e12"));
        assertFalse(instance.isNumber("1e12.2"));
        assertFalse(instance.isNumber("1.2e1a"));
        assertFalse(instance.isNumber("1.2 e2"));
        assertFalse(instance.isNumber("."));
    }


    @Test
    void solution3() {
        Topic065.Solution3 instance = new Topic065.Solution3();
        assertTrue(instance.isNumber(" 1 "));
        assertTrue(instance.isNumber(" .1 "));
        assertTrue(instance.isNumber("3."));
        assertTrue(instance.isNumber(" +1 "));
        assertTrue(instance.isNumber("-1"));
        assertTrue(instance.isNumber("1.2e2"));
        assertTrue(instance.isNumber("1.32"));
        assertTrue(instance.isNumber("1e10"));
        assertTrue(instance.isNumber("-1e-32"));
        assertTrue(instance.isNumber("-1.2e-32"));
        assertTrue(instance.isNumber("-1.2"));
        assertTrue(instance.isNumber(".3e1"));
        assertFalse(instance.isNumber("1a"));
        assertFalse(instance.isNumber("1-1"));
        assertFalse(instance.isNumber("1-1.e"));
        assertFalse(instance.isNumber("e12"));
        assertFalse(instance.isNumber("1e12.2"));
        assertFalse(instance.isNumber("1.2e1a"));
        assertFalse(instance.isNumber("1.2 e2"));
        assertFalse(instance.isNumber("."));
    }
}
