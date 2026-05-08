package com.deerhunter.topic;

import com.deerhunter.offer.Offer058A;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/4/24 下午8:03
 */
class Offer058ATest {
    private final Offer058A instance=new Offer058A();
    void test(Function<String,String> function){
//        assertEquals("blue is sky the",function.apply("the sky is blue"));
        assertEquals("world! hello",function.apply("  hello world!  "));
//        assertEquals("example good a",function.apply("a good   example"));
    }

    @Test
    void test1() {
        test(instance::reverseWords);
    }
}
