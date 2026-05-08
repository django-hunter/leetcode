package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-14
 */
class Topic008Test {
    private Topic008 solution = new Topic008();

    @Test
    void myAtoi() {
        assertEquals(123, solution.myAtoi("123"));
        assertEquals(123, solution.myAtoi("+123"));
        assertEquals(123, solution.myAtoi("  +123   "));
        assertEquals(123, solution.myAtoi("  +123  asdfsd "));
        assertEquals(-123, solution.myAtoi("  -123  asdfsd "));
        assertEquals(-123, solution.myAtoi("  -123  a12345sdfsd "));
        assertEquals(0, solution.myAtoi("q  -123  a12345sdfsd "));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi("  2147483648"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi("  -2147483649  -123  a12345sdfsd "));
    }
    @Test
    void myAtoi2() {
        assertEquals(123, solution.myAtoi2("123"));
        assertEquals(123, solution.myAtoi2("+123"));
        assertEquals(123, solution.myAtoi2("  +123   "));
        assertEquals(123, solution.myAtoi2("  +123  asdfsd "));
        assertEquals(-123, solution.myAtoi2("  -123  asdfsd "));
        assertEquals(-123, solution.myAtoi2("  -123  a12345sdfsd "));
        assertEquals(0, solution.myAtoi2("q  -123  a12345sdfsd "));
        assertEquals(Integer.MAX_VALUE, solution.myAtoi2("  2147483648"));
        assertEquals(Integer.MIN_VALUE, solution.myAtoi2("  -2147483649  -123  a12345sdfsd "));
    }
}
