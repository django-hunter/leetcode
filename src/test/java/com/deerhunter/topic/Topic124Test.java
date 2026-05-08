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
 * @createTime 2020/9/16 16:06
 */
class Topic124Test {
    void test(Function<TreeNode, Integer> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{1, 2, 3});
        Integer sum = function.apply(tree);
        assertEquals(6, sum);

        tree = TreeNode.createTree(new Integer[]{-10, 9, 20, null, null, 15, 7});
        sum = function.apply(tree);
        assertEquals(42, sum);

        tree = TreeNode.createTree(new Integer[]{-10});
        sum = function.apply(tree);
        assertEquals(-10, sum);
    }

    @Test
    void solution1() {
        test(Topic124.Solution::maxPathSum);
    }
}
