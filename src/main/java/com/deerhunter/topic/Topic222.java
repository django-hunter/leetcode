package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 222. Count Complete Tree Nodes
 * Medium
 * <p>
 * 2845
 * <p>
 * 255
 * <p>
 * Add to List
 * <p>
 * Share
 * Given the root of a complete binary tree, return the number of the nodes in the tree.
 * <p>
 * According to Wikipedia, every level, except possibly the last, is completely filled in a complete binary tree, and all nodes in the last level are as far left as possible. It can have between 1 and 2h nodes inclusive at the last level h.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * <p>
 * Input: root = [1,2,3,4,5,6]
 * Output: 6
 * Example 2:
 * <p>
 * Input: root = []
 * Output: 0
 * Example 3:
 * <p>
 * Input: root = [1]
 * Output: 1
 * <p>
 * <p>
 * Constraints:
 * <p>
 * The number of nodes in the tree is in the range [0, 5 * 104].
 * 0 <= Node.val <= 5 * 104
 * The tree is guaranteed to be complete.
 * <p>
 * <p>
 * Follow up: Traversing the tree to count the number of nodes in the tree is an easy solution but with O(n) complexity. Could you find a faster algorithm?
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/4/13 17:58
 */
public class Topic222 {

    /**
     * 从右往左扫描最底层节点，第一次发现高度不一致时即可确定最后一层的节点数量
     */
    public static class Solution1 {
        public int countNodes(TreeNode root) {
            int prevDepth = -1;
            int curDepth = 0;
            // 叶子节点数量
            int leaf = 0;
            Deque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
            TreeNode node = root;
            while (!stack.isEmpty() || node != null) {
                if (node != null) {
                    curDepth++;
                    if (node.right != null) {
                        stack.push(Pair.of(node.left, curDepth));
                        node = node.right;
                        // 找到一个叶子节点
                    } else if (node.left == null) {
                        if (prevDepth == -1) {
                            prevDepth = curDepth;
                        } else if (prevDepth != curDepth) {
                            return (1 << curDepth) - 2 * leaf - 1;
                        }
                        node = null;
                        leaf++;

                        //找到一个仅右孩子为空的节点，则其左孩子是最深一层最右侧的节点
                    } else {
                        return (1 << curDepth + 1) - 2 * leaf - 2;
                    }
                } else {
                    Pair<TreeNode, Integer> pair = stack.pop();
                    node = pair.getKey();
                    curDepth = pair.getValue();
                }
            }
            // 满二叉树会走到这里
            return (1 << curDepth) - 1;
        }
    }

    /**
     * 暴力算法
     */
    public static class Solution2 {
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            return countNodes(root.left) + countNodes(root.right) + 1;
        }
    }

    /**
     * 二分查找+位运算
     */
    public static class Solution3 {
        public int countNodes(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int height = 0;
            TreeNode node = root;
            while (node != null) {
                height++;
                node = node.left;
            }
            int low = 1 << height - 1, high = (1 << height) - 1;
            while (low < high) {
                int mid = (high - low + 1) / 2 + low;
                if (exist(root, height, mid)) {
                    low = mid;
                } else {
                    high = mid - 1;
                }
            }
            return low;
        }

        /**
         * 判断完全二叉树中编号为n的节点是否存在。编号从1开始，从上到下从左到右逐个+1
         *
         * @param root
         * @param h
         * @param n
         * @return
         */
        private boolean exist(TreeNode root, int h, int n) {
            while (root != null && h > 1) {
                h--;
                if ((n >> h - 1 & 1) == 1) {
                    root = root.right;
                } else {
                    root = root.left;
                }
            }
            return root != null;
        }
    }
}
