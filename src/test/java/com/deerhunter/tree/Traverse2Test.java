package com.deerhunter.tree;

import com.deerhunter.topic.TestUtils;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/11/3 14:56
 */
class Traverse2Test {
    private static final TreeNode tree1 = TreeNode.createTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});
    private static final TreeNode tree2 = TreeNode.createTree(new Integer[]{1, 2, 3, 4, null, 5, null, 6, 7, null, null, 8});

    public static class TreeNodeCollector implements Consumer<TreeNode> {
        private List<Integer> values = new ArrayList<>();

        @Override
        public void accept(TreeNode node) {
            values.add(node.val);
        }

        public List<Integer> getValues() {
            return values;
        }

        public void clear() {
            values.clear();
        }
    }

    void testInorderTraverse(BiConsumer<TreeNode, Consumer<TreeNode>> function) {
        List<Integer> expect1 = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        List<Integer> expect2 = Arrays.asList(6, 4, 7, 2, 1, 8, 5, 3);
        TreeNodeCollector collector = new TreeNodeCollector();
        function.accept(tree1, collector);
        List<Integer> result1 = collector.getValues();
        TestUtils.assertListEquals(expect1, result1);

        collector.clear();
        function.accept(tree2, collector);
        List<Integer> result2 = collector.getValues();
        TestUtils.assertListEquals(expect2, result2);

    }

    void testpreorderTraverse(BiConsumer<TreeNode, Consumer<TreeNode>> function) {
        List<Integer> expect1 = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        List<Integer> expect2 = Arrays.asList(1, 2, 4, 6, 7, 3, 5, 8);
        TreeNodeCollector collector = new TreeNodeCollector();
        function.accept(tree1, collector);
        List<Integer> result1 = collector.getValues();
        TestUtils.assertListEquals(expect1, result1);

        collector.clear();
        function.accept(tree2, collector);
        List<Integer> result2 = collector.getValues();
        TestUtils.assertListEquals(expect2, result2);

    }

    void testpostorderTraverse(BiConsumer<TreeNode, Consumer<TreeNode>> function) {
        List<Integer> expect1 = Arrays.asList(4, 5, 2, 6, 7, 3, 1);
        List<Integer> expect2 = Arrays.asList(6, 7, 4, 2, 8, 5, 3, 1);
        TreeNodeCollector collector = new TreeNodeCollector();
        function.accept(tree1, collector);
        List<Integer> result1 = collector.getValues();
        TestUtils.assertListEquals(expect1, result1);

        collector.clear();
        function.accept(tree2, collector);
        List<Integer> result2 = collector.getValues();
        TestUtils.assertListEquals(expect2, result2);

    }

    @Test
    void preorder() {
        testpreorderTraverse(Traverse2::preorderByRecursion);
        testpreorderTraverse(Traverse2::preorderByLoop);
        testpreorderTraverse(Traverse2::preorderByMorris);
    }

    @Test
    void inorder() {
        testInorderTraverse(Traverse2::inorderByLoop);
        testInorderTraverse(Traverse2::inorderByRecursion);
        testInorderTraverse(Traverse2::inorderByMorris);
    }

    @Test
    void postorder() {
        testpostorderTraverse(Traverse2::postorderByRecursion);
        testpostorderTraverse(Traverse2::postorderByLoop);
        testpostorderTraverse(Traverse2::postorderByMorris);
    }
}
