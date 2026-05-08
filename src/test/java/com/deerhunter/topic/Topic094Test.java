package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comment. Good luck, bro.
 * <p>
 * Copyright (c) 2019, deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/4/25 14:36
 */
class Topic094Test {
    @Test
    void solution1() {
        Topic094.Solution1 instance = new Topic094.Solution1();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }


    @Test
    void solution2() {
        Topic094.Solution2 instance = new Topic094.Solution2();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }

    @Test
    void solution3() {
        Topic094.Solution3 instance = new Topic094.Solution3();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }

    @Test
    void solution4() {
        Topic094.Solution4 instance = new Topic094.Solution4();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }

    @Test
    void solution5() {
        Topic094.Solution5 instance = new Topic094.Solution5();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }

    @Test
    void solution6() {
        Topic094.Solution6 instance = new Topic094.Solution6();

        Integer[] nums = new Integer[]{1, null, 2, null, null, 3};
        TreeNode tree = TreeNode.createTree(nums);
        List<Integer> actual = instance.inorderTraversal(tree);
        List<Integer> expected = Arrays.asList(1, 3, 2);
        assertIterableEquals(expected, actual);

        nums = new Integer[]{1, 2, 3, 4, 5, 6, 7};
        tree = TreeNode.createTree(nums);
        actual = instance.inorderTraversal(tree);
        expected = Arrays.asList(4, 2, 5, 1, 6, 3, 7);
        assertIterableEquals(expected, actual);
    }
}
