package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2019-08-31
 */
class Topic020Test {
    @Test
    void isValid() {
        assertTrue(Topic020.isValid( "()"));
        assertTrue(Topic020.isValid(  "()[]{}"));
        assertTrue(Topic020.isValid( "{[]}"));
        assertFalse(Topic020.isValid( "(]"));
        assertFalse(Topic020.isValid( "([)]"));
    }
}
