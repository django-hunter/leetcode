package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/6/21 3:58 PM
 */
class Topic258Test {
    @Test
    void solution1() {
        for (int i = 0; i < 1000; i++) {
            System.out.printf("%d: %d\n", i, new Topic258.Solution1().addDigits(i));
        }
    }
}
