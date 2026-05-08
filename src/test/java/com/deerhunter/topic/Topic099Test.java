package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/9 19:06
 */
class Topic099Test {

    void test(Function<TreeNode, TreeNode> function) {
        Integer[] wrongTreeNums = new Integer[]{1, 3, null, null, 2};
        Integer[] rightTreeNums = new Integer[]{3, 1, null, null, 2};
        TreeNode tree = TreeNode.createTree(wrongTreeNums);
        TreeNode head = function.apply(tree);
        assertArrayEquals(rightTreeNums, head.toIntegers());
    }

    void test2(Consumer<TreeNode> function) {
        Integer[] wrongTreeNums = new Integer[]{1, 3, null, null, 2};
        Integer[] rightTreeNums = new Integer[]{3, 1, null, null, 2};
        TreeNode tree = TreeNode.createTree(wrongTreeNums);
        function.accept(tree);
        assertArrayEquals(rightTreeNums, tree.toIntegers());
    }

    @Test
    void solution1() {
        test(Topic099.Solution1::recoverTree);
    }

    @Test
    void solution2() {
        test2(Topic099.Solution2::recoverTree);
    }
}
