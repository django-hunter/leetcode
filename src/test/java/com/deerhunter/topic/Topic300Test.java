package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/4/20 下午8:30
 */
class Topic300Test {
    private Topic300 instance=new Topic300();

    void test(Function<int[], Integer> function) {
        int []nums={1,3,6,7,9,4,10,5,6};
        assertEquals(6,function.apply(nums));
    }

    @Test
    void test1() {
        test(instance::lengthOfLIS);
    }

    @Test
    void test2() {
        test(instance::lengthOfLIS2);
    }
}
