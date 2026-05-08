package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.function.BiFunction;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/12 13:56
 */
class Topic105Test {


    void test(BiFunction<int[], int[], TreeNode> function) {
        int[] preorder = new int[]{3, 9, 20, 15, 7};
        int[] inorder = new int[]{9, 3, 15, 20, 7};
        Integer[] tree = new Integer[]{3, 9, 20, null, null, 15, 7};
        TreeNode actualTree = function.apply(preorder, inorder);
        assertArrayEquals(tree, actualTree.toIntegers());
    }

    @Test
    void solution1() {
        test(Topic105.Solution1::buildTree);
    }

    @Test
    void solution2() {
        test(Topic105.Solution2::buildTree);
    }
    @Test
    void solution3() {
        test(Topic105.Solution3::buildTree);
    }

}
