package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/2/21 12:05 PM
 */
class Topic239Test {

    @Test
    void upperBound() {
        assertEquals(2, Topic239.Solution1.upperBound(Arrays.asList(1, 2, 3), 2));
        assertEquals(3, Topic239.Solution1.upperBound(Arrays.asList(1, 2, 2, 3), 2));
        assertEquals(4, Topic239.Solution1.upperBound(Arrays.asList(1, 2, 2, 3), 3));
    }
}
