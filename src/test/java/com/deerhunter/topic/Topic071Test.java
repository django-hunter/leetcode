package com.deerhunter.topic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @date 2020-03-25
 */
class Topic071Test {
    @Test
    void solution() {
//        输入："/home/"
//        输出："/home"
//        解释：注意，最后一个目录名后面没有斜杠。
//        示例 2：
//
//        输入："/../"
//        输出："/"
//        解释：从根目录向上一级是不可行的，因为根是你可以到达的最高级。
//        示例 3：
//
//        输入："/home//foo/"
//        输出："/home/foo"
//        解释：在规范路径中，多个连续斜杠需要用一个斜杠替换。
//        示例 4：
//
//        输入："/a/./b/../../c/"
//        输出："/c"
//        示例 5：
//
//        输入："/a/../../b/../c//.//"
//        输出："/c"
//        示例 6：
//
//        输入："/a//b////c/d//././/.."
//        输出："/a/b/c"

        Topic071.Solution1 instance = new Topic071.Solution1();
//        assertEquals("/home",instance.simplifyPath("/home/"));
//        assertEquals("/",instance.simplifyPath("/../"));
//        assertEquals("/home/foo",instance.simplifyPath("/home//foo/"));
//        assertEquals("/c",instance.simplifyPath("/a/./b/../../c/"));
//        assertEquals("/c", instance.simplifyPath("/a/../../b/../c//.//"));
        assertEquals("/a/b/c",instance.simplifyPath("/a//b////c/d//././/.."));

    }
}
