package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/8 18:23
 */
class Topic098Test {
    TreeNode tree1 = TreeNode.createTree(new Integer[]{5, 1, 4, null, null, 3, 6});
    TreeNode tree2 = TreeNode.createTree(new Integer[]{2, 1, 3});

    @Test
    void solution1() {
        assertFalse(Topic098.Solution1.isValidBST(tree1));
        assertTrue(Topic098.Solution1.isValidBST(tree2));
    }

    @Test
    void solution2() {
        assertFalse(Topic098.Solution2.isValidBST(tree1));
        assertTrue(Topic098.Solution2.isValidBST(tree2));
    }

    @Test
    void solution3() {
        assertFalse(Topic098.Solution3.isValidBST(tree1));
        assertTrue(Topic098.Solution3.isValidBST(tree2));
    }

}
