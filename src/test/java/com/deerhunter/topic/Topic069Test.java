package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-24
 */
class Topic069Test {
    @Test
    void solution1() {
        Topic069.Solution1 instance = new Topic069.Solution1();
        assertEquals(3,instance.mySqrt(10));
        assertEquals(0,instance.mySqrt(0));
        assertEquals(3,instance.mySqrt(9));
        assertEquals(10,instance.mySqrt(101));
        assertEquals(1,instance.mySqrt(1));
        assertEquals(46339,instance.mySqrt(2147395599));
    }

    @Test
    void solution2() {
        Topic069.Solution2 instance = new Topic069.Solution2();
        assertEquals(3,instance.mySqrt(10));
        assertEquals(0,instance.mySqrt(0));
        assertEquals(3,instance.mySqrt(9));
        assertEquals(10,instance.mySqrt(101));
        assertEquals(1,instance.mySqrt(1));
        assertEquals(46339,instance.mySqrt(2147395599));
    }

    @Test
    void solution3() {
        Topic069.Solution3 instance = new Topic069.Solution3();
        assertEquals(3,instance.mySqrt(10));
        assertEquals(0,instance.mySqrt(0));
        assertEquals(3,instance.mySqrt(9));
        assertEquals(10,instance.mySqrt(101));
        assertEquals(1,instance.mySqrt(1));
        assertEquals(46339,instance.mySqrt(2147395599));
    }
}
