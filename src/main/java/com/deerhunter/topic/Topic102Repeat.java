package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。 （即逐层地，从左到右访问所有节点）。
 *
 * <p>
 *
 * <p>示例： 二叉树：[3,9,20,null,null,15,7],
 *
 * <p>3 / \ 9 20 / \ 15 7 返回其层次遍历结果：
 *
 * <p>[ [3], [9,20], [15,7] ]
 *
 * <p>来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * <p>Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2026/05/10 10:30
 */
public class Topic102Repeat {
    // bfs
    public static class Solution1 {
        public static List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            if (root == null) {
                return ans;
            }

            Queue<TreeNode> queue = new ArrayDeque<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                int size = queue.size();
                List<Integer> list = new ArrayList<>(size);
                for (int i = 0; i < size; i++) {
                    TreeNode node = queue.remove();
                    list.add(node.val);
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                ans.add(list);
            }
            return ans;
        }
    }

    // 递归
    public static class Solution2 {
        public List<List<Integer>> levelOrder(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            dfs(root, 0, ans);
            return ans;
        }

        private void dfs(TreeNode node, int level, List<List<Integer>> ans) {
            if (node == null) {
                return;
            }
            if (ans.size() == level) {
                ans.add(new ArrayList<>());
            }
            ans.get(level).add(node.val);
            dfs(node.left, level + 1, ans);
            dfs(node.right, level + 1, ans);
        }
    }
}
