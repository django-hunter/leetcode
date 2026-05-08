package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/11 18:48
 */
class Topic102Test {

    void test(Function<TreeNode, List<List<Integer>>> function) {
        TreeNode tree = TreeNode.createTree(new Integer[]{3, 9, 20, null, null, 15, 7});
        List<List<Integer>> treeByLayers = new ArrayList<>();
        treeByLayers.add(Collections.singletonList(3));
        treeByLayers.add(Arrays.asList(9, 20));
        treeByLayers.add(Arrays.asList(15, 7));
        List<List<Integer>> result = function.apply(tree);
        for (int i = 0; i < treeByLayers.size(); i++) {
            List<Integer> layer = treeByLayers.get(i);
            for (int j = 0; j < layer.size(); j++) {
                assertEquals(layer.get(j), result.get(i).get(j));
            }
        }
    }

    @Test
    void solution1() {
        test(Topic102.Solution1::levelOrder);
    }
    @Test
    void solution2() {
        test(Topic102.Solution2::levelOrder);
    }

}
