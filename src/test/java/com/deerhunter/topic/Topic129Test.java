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
 * @createTime 2020/9/20 18:59
 */
class Topic129Test {
    void test(Function<TreeNode, Integer> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{1, 2, 3});
        Integer sum = function.apply(tree);
        assertEquals(25, sum);

        tree = TreeNode.createTree(new Integer[]{4, 9, 0, 5, 1});
         sum = function.apply(tree);
        assertEquals(1026, sum);
    }

    @Test
    void solution1() {
        test(new Topic129.Solution1()::sumNumbers);
    }
}
