package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) @2022 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2022/4/20 下午5:25
 */
class XingyeExamTest {

    @Test
    void longestWord() {
        String []words={"apple","iOS","dog","nana","man","good","goodman"};
        XingyeExam instance=new XingyeExam();
        assertEquals("goodman",instance.longestWord(words));
    }
}
