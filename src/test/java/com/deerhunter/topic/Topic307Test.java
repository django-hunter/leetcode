package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/5/3 下午1:56
 */
class Topic307Test {
    @Test
    void test() {
        Topic307.NumArray numArray = new Topic307.NumArray(new int[]{1, 3, 5});
        assertEquals(9,numArray.sumRange(0,2));
        numArray.update(1,2);
        assertEquals(8,numArray.sumRange(0,2));

        numArray = new Topic307.NumArray(new int[]{9, -8});
        numArray.update(0,3);
        assertEquals(-8,numArray.sumRange(1,1));
        assertEquals(-5,numArray.sumRange(0,1));
        numArray.update(1,-3);
        assertEquals(0,numArray.sumRange(0,1));
    }

    @Test
    void test2() {
        Topic307.NumArray2 numArray = new Topic307.NumArray2(new int[]{1, 3, 5});
//        assertEquals(9,numArray.sumRange(0,2));
//        numArray.update(1,2);
//        assertEquals(8,numArray.sumRange(0,2));
//
//        numArray = new Topic307.NumArray2(new int[]{9, -8});
//        numArray.update(0,3);
//        assertEquals(-8,numArray.sumRange(1,1));
//        assertEquals(-5,numArray.sumRange(0,1));
//        numArray.update(1,-3);
//        assertEquals(0,numArray.sumRange(0,1));

        numArray = new Topic307.NumArray2(new int[]{1,2,3,4,5});
//        numArray.update(0,3);
//        assertEquals(2,numArray.sumRange(1,1));
//        assertEquals(17,numArray.sumRange(0,4));
        assertEquals(12,numArray.sumRange(2,4));
    }
}
