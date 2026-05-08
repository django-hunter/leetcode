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
 * @createTime 2020/9/20 17:35
 */
class Topic128Test {
    void test(Function<int[], Integer> function) {
        int[] nums = new int[]{100, 4, 200, 1, 3, 2};
        Integer longest = function.apply(nums);
        assertEquals(4, longest);

        nums = new int[]{0, -1};
        longest = function.apply(nums);
        assertEquals(2, longest);

        nums = new int[]{1, 0, -1};
        longest = function.apply(nums);
        assertEquals(3, longest);

        nums = new int[]{-1, 1, 0};
        longest = function.apply(nums);
        assertEquals(3, longest);
    }

    @Test
    void solution1() {
        test(new Topic128.Solution()::longestConsecutive);
    }
}
