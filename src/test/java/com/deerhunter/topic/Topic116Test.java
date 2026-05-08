package com.deerhunter.topic;

import com.deerhunter.common.Node;
import com.deerhunter.tree.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.function.Consumer;

/**
 * Oops, forgot to write comments. Good luck, bro.
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/15 11:44
 */
class Topic116Test {
    void test(Consumer<Node> consumer) {
        TreeNode tree = TreeNode.createTree(new Integer[]{1, 2, 3, 4, 5, 6, 7});
        Node node = Node.fromTreeNode(tree);
        consumer.accept(node);
        System.out.println();
    }

    @Test
    void solution2() {
        test(Topic116.Solution2::connect);

    }
}
