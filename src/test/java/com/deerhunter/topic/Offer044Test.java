package com.deerhunter.topic;

import com.deerhunter.offer.Offer044;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/5/1 下午12:15
 */
class Offer044Test {
    private Offer044 instance=new Offer044();
    void test(Function<Integer, Integer> function) {
        assertEquals(5,function.apply(5));
        assertEquals(9,function.apply(9));
        assertEquals(1,function.apply(1000000000));
        assertEquals(2,function.apply(2147483647));
    }

    @Test
    void findNthDigit() {
        test(instance::findNthDigit);
    }
    @Test
    void findNthDigit2() {
        test(instance::findNthDigit2);
    }
}
