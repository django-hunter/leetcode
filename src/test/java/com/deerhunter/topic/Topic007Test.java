package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-13
 */
class Topic007Test {
    private Topic007 solution = new Topic007();
    @Test
    void reverse() {
        assertEquals(123,solution.reverse(321));
        assertEquals(-123,solution.reverse(-321));
        assertEquals(0,solution.reverse(Integer.MAX_VALUE));
    }
}
