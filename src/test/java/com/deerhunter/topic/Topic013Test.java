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
class Topic013Test {
    Topic013 solution = new Topic013();

    @Test
    void romanToInt() {
        assertEquals(3,solution.romanToInt("III"));
        assertEquals(4,solution.romanToInt("IV"));
        assertEquals(9,solution.romanToInt("IX"));
        assertEquals(58,solution.romanToInt("LVIII"));
        assertEquals(1994,solution.romanToInt("MCMXCIV"));
    }
}
