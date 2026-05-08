package com.deerhunter.topic;

import com.deerhunter.offer.Offer016;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/5/17 下午2:04
 */
class Offer016Test {
    private Offer016 instance=new Offer016();

    @Test
    void myPow() {
        assertEquals(0.01,instance.myPow(0.1,2));
    }
}
