package com.deerhunter.topic;

import com.deerhunter.offer.Offer061;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/4/21 下午2:53
 */
class Offer061Test {
    private Offer061 instance=new Offer061();
    void test(Function<int[],Boolean> function){
        assertEquals(true,function.apply(new int[]{0,0,1,2,5}));
    }

    @Test
    void isStraight() {
        test(instance::isStraight);
    }

    @Test
    void isStraight2() {
        test(instance::isStraight2);
    }
}
