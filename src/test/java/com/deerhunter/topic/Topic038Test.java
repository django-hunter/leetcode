package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-11-18
 */
class Topic038Test {

    @Test
    void countAndSay() {
        assertEquals("1", Topic038.countAndSay(1));
        assertEquals("11", Topic038.countAndSay(2));
        assertEquals("21", Topic038.countAndSay(3));
        assertEquals("1211", Topic038.countAndSay(4));
        assertEquals("111221", Topic038.countAndSay(5));
    }
}
