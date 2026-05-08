package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-09-04
 */
class Topic029Test {

    @Test
    void divide() {
        assertEquals(3, Topic029.divide(10, 3));
        assertEquals(-3, Topic029.divide(10, -3));
        assertEquals(-1, Topic029.divide(1, -1));
        assertEquals(-2147483648, Topic029.divide(-2147483648 ,1));
    }

    @Test
    void divide2() {
        assertEquals(3, Topic029.divide2(10, 3));
        assertEquals(-3, Topic029.divide2(10, -3));
        assertEquals(-1, Topic029.divide2(1, -1));
        assertEquals(-2147483648, Topic029.divide2(-2147483648 ,1));
        assertEquals(2147483647, Topic029.divide2(-2147483648 ,-1));
        assertEquals(0, Topic029.divide2(-1010369383 ,-2147483648));


    }
}
