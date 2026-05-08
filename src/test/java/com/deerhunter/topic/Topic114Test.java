package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/14 15:42
 */
class Topic114Test {

    void test(Consumer<TreeNode> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{1, 2, 5, 3, 4, null, 6});
        function.accept(tree);
        System.out.println();
        tree = TreeNode.createTree(new Integer[]{1, 2, null, 3});
        function.accept(tree);
        System.out.println();
    }

    @Test
    void solution3() {
        test(Topic114.Solution3::flatten);
    }
}
