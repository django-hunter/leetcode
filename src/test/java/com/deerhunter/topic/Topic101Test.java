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
 * @createTime 2020/9/11 17:58
 */
class Topic101Test {
    void test(Function<TreeNode, Boolean> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{1, 2, 2, 3, 4, 4, 3});
        Boolean isSymmetric = function.apply(tree);
        assertTrue(isSymmetric);

        tree = TreeNode.createTree(new Integer[]{1, 2, 2, null, 3, null, 3});
        isSymmetric = function.apply(tree);
        assertFalse(isSymmetric);

    }

    @Test
    void solution1() {
        test(Topic101.Solution1::isSymmetric);
    }

    @Test
    void solution2() {
        test(Topic101.Solution2::isSymmetric);
    }
}
