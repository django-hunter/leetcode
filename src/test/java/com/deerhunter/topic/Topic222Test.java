package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/4/14 15:31
 */
class Topic222Test {
    void test(Function<TreeNode, Integer> function) {
        assertEquals(7, function.apply(TreeNode.createCompleteTree(new int[]{1, 2, 3, 4, 5, 6,7})));
        assertEquals(6, function.apply(TreeNode.createCompleteTree(new int[]{1, 2, 3, 4, 5, 6})));
        assertEquals(5, function.apply(TreeNode.createCompleteTree(new int[]{1, 2, 3, 4, 5})));
        assertEquals(500, function.apply(TreeNode.createCompleteTree(500)));
        assertEquals(0, function.apply(TreeNode.createCompleteTree(0)));
    }

    @Test
    void solution1() {
        test(new Topic222.Solution1()::countNodes);
    }

    @Test
    void solution2() {
        test(new Topic222.Solution2()::countNodes);
    }

    @Test
    void solution3() {
        test(new Topic222.Solution3()::countNodes);
    }
}
