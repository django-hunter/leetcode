package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static com.deerhunter.topic.TestUtils.checkTwoDimensionalListEqual;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/11 18:48
 */
class Topic103Test {

    void test(Function<TreeNode, List<List<Integer>>> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> treeByLayers = new ArrayList<>();
        treeByLayers.add(Collections.singletonList(3));
        treeByLayers.add(Arrays.asList(20, 9));
        treeByLayers.add(Arrays.asList(15, 7));
        List<List<Integer>> result = function.apply(tree);
        checkTwoDimensionalListEqual(treeByLayers, result);
    }





    @Test
    void solution1() {
        test(Topic103.Solution1::levelOrder);
    }

    @Test
    void solution2() {
        test(Topic103.Solution2::levelOrder);
    }

    @Test
    void solution3() {
        test(Topic103.Solution3::levelOrder);
    }

}
