package com.deerhunter.topic;

import com.deerhunter.common.Utils;
import org.junit.jupiter.api.Test;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-12
 */
class Topic059Test {
    @Test
    void solution1() {
        Topic059.Solution1 instance = new Topic059.Solution1();
        int[][] actual = instance.generateMatrix(3);
        int[][] expected={
                {1,2,3},
                {8,9,4},
                {7,6,5}
        };
        Utils.checkArrayEqual(expected,actual);
    }
}
