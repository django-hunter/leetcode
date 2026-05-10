package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * Oops, forgot to write comments. Good luck, bro.
 *
 * @author Django
 * @since 2026/5/10 10:52
 * @see <a href="https://leetcode.cn/problems/lowest-common-ancestor-of-a-binary-tree/" />
 */
public class Topic236Repeat {
    class Solution {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            List<TreeNode> path1 = getPath(root, p);
            List<TreeNode> path2 = getPath(root, q);
            int minLen = Math.min(path1.size(), path2.size());
            TreeNode ans = root;
            for (int i = 0; i < minLen; i++) {
                if (path1.get(i) == path2.get(i)) {
                    ans = path1.get(i);
                } else {
                    break;
                }
            }
            return ans;
        }

        private List<TreeNode> getPath(TreeNode start, TreeNode end) {
            List<TreeNode> path = new ArrayList<>();
            dfs(start, end, path);
            return path;
        }

        private boolean dfs(TreeNode curr, TreeNode end, List<TreeNode> path) {
            if (curr == null) {
                return false;
            }

            path.add(curr);
            if (curr == end) {
                return true;
            }
            if (curr.left != null) {
                if (dfs(curr.left, end, path)) {
                    return true;
                }
            }
            if (curr.right != null) {
                if (dfs(curr.right, end, path)) {
                    return true;
                }
            }
            path.removeLast();
            return false;
        }
    }
}
