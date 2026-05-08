package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/2/21 5:57 PM
 */
class Topic240Test {
    @Test
    void lowerBound() {
        assertEquals(1, Topic240.Solution1.lowerBound(new int[]{1, 3, 3, 4,5}, 5, 3));
    }
}
