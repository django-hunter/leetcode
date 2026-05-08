package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/12/21 10:07
 */
class Topic164Test {
    void test(Function<int[], Integer> function) {
        int[] nums = {3, 6, 9, 1};
        assertEquals(3, function.apply(nums));

        int[] nums2 = {10};
        assertEquals(0, function.apply(nums2));

        int[] nums3 = {1, 1, 1, 1};
        assertEquals(0, function.apply(nums3));
    }

    @Test
    void solution1() {
        test(new Topic164.Solution1()::maximumGap);
    }

    @Test
    void solution2() {
        test(new Topic164.Solution2()::maximumGap);
    }

    @Test
    void solution3() {
        test(new Topic164.Solution3()::maximumGap);
    }
}
