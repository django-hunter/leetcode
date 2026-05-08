package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;

/**
 * 给定一个非空二叉树，返回其最大路径和。
 * <p>
 * 本题中，路径被定义为一条从树中任意节点出发，沿父节点-子节点连接，达到任意节点的序列。该路径至少包含一个节点，且不一定经过根节点。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[1,2,3]
 * <p>
 * 1
 * / \
 * 2   3
 * <p>
 * 输出：6
 * 示例 2：
 * <p>
 * 输入：[-10,9,20,null,null,15,7]
 * <p>
 *    -10
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * <p>
 * 输出：42
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/binary-tree-maximum-path-sum
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2020/9/16 15:57
 */
public class Topic124 {
    public static class Solution {
        private static int maxSum;

        public static int maxPathSum(TreeNode root) {
            maxSum = Integer.MIN_VALUE;
            singlePathMaxSum(root);
            return maxSum;
        }

        /**
         * 计算从指定节点往下的单条路径的最大和
         *
         * @param root
         * @return
         */
        private static int singlePathMaxSum(TreeNode root) {
            if (root == null) {
                return 0;
            }
            int singleMax = root.val;
            int leftSingle = singlePathMaxSum(root.left);
            int rightSingle = singlePathMaxSum(root.right);
            singleMax += Math.max(leftSingle, rightSingle);
            int pathMax = root.val + leftSingle + rightSingle;
            maxSum = Math.max(maxSum, pathMax);
            return Math.max(singleMax, 0);
        }
    }

}
