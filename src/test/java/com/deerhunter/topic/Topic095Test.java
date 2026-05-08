package com.deerhunter.topic;

import com.deerhunter.tree.Traverse;
import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/4 17:38
 */
class Topic095Test {
    @Test
    void solution1() {
        List<TreeNode> trees = Topic095.Solution1.generateTrees(3);
        for (TreeNode tree : trees) {
            Traverse.traverseByLayer(tree);
            System.out.println("=============");
        }
    }
}
