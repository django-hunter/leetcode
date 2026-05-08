package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/10/30 17:14
 */
class Topic144Test {

    void test(Function<TreeNode, List<Integer>> function) {
        TreeNode tree = TreeNode.createCompleteTree(new int[]{1, 2, 3, 4, 5, 6, 7});
        List<Integer> result = function.apply(tree);
        List<Integer> expect = Arrays.asList(1, 2, 4, 5, 3, 6, 7);
        TestUtils.assertListEquals(expect, result);
    }

    @Test
    void solution1() {
        test(new Topic144.Solution1()::preorderTraversal);
    }
    @Test
    void solution2() {
        test(new Topic144.Solution2()::preorderTraversal);
    }

    @Test
    void solution3() {
        test(new Topic144.Solution3()::preorderTraversal);
    }
}
