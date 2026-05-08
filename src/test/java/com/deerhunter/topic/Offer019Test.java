package com.deerhunter.topic;

import com.deerhunter.offer.Offer019;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/5/17 上午12:20
 */
class Offer019Test {
    private Offer019 instance=new Offer019();
    @Test
    void test() {
//        assertTrue(instance.isMatch("aa","a*"));
        assertTrue(instance.isMatch2("aa","a*"));
    }
}
