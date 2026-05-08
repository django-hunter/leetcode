package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/9/21 1:54 PM
 */
class Topic263Test {
    private Topic263.Solution solution = new Topic263.Solution();
    @Test
    void factorization() {
        System.out.println(solution.factorization(6));
        System.out.println(solution.factorization(10));
        System.out.println(solution.factorization(5));
        System.out.println(solution.factorization(6));
    }

    @Test
    void enumerate() {
        for (int i = 0; i < 1000; i++) {
            if (solution.isUgly(i + 1)) {
                System.out.println(solution.factorization(i + 1));
            }
        }
    }
}
