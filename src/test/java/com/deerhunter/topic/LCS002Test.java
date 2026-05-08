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
 * @createTime 2022/6/4 下午12:52
 */
class LCS002Test {
    private LCS002 instance=new LCS002();
    void test(Function<int[],Integer> function){
        assertEquals(2,function.apply(new int[]{3,13,7,11,1,5,5,3}));
    }

    @Test
    void test1() {
        test(instance::halfQuestions);
    }
}
