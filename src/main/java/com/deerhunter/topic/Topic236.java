package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 * 236. 二叉树的最近公共祖先 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
 *
 * <p>百度百科中最近公共祖先的定义为：“对于有根树 T 的两个节点 p、q，最近公共祖先表示为一个节点 x，满足 x 是 p、q 的祖先且 x 的深度尽可能大（一个节点也可以是它自己的祖先）。”
 *
 * <p>
 *
 * <p>
 *
 * <p>示例 1：
 *
 * <p>
 *
 * <p>输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1 输出：3 解释：节点 5 和节点 1 的最近公共祖先是节点 3 。 示例 2：
 *
 * <p>
 *
 * <p>输入：root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 4 输出：5 解释：节点 5 和节点 4 的最近公共祖先是节点 5
 * 。因为根据定义最近公共祖先节点可以为节点本身。 示例 3：
 *
 * <p>输入：root = [1,2], p = 1, q = 2 输出：1
 *
 * <p>
 *
 * <p>提示：
 *
 * <p>树中节点数目在范围 [2, 105] 内。 -109 <= Node.val <= 109 所有 Node.val 互不相同 。 p != q p 和 q 均存在于给定的二叉树中。
 * 通过次数214,120提交次数317,470
 *
 * <p>Copyright (c) @2021 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 7/1/21 11:42 AM
 */
public class Topic236 {
    public static class Solution1 {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            List<TreeNode> path1 = getPath(root, p);
            List<TreeNode> path2 = getPath(root, q);
            TreeNode node = null;
            for (int i = 0; i < Math.min(path1.size(), path2.size()); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
                node = path1.get(i);
            }
            return node;
        }

        private List<TreeNode> getPath(TreeNode root, TreeNode p) {
            List<TreeNode> path = new LinkedList<>();
            TreeNode lastVisit = null;
            while (root != p && (!path.isEmpty() || root != null)) {
                if (root != null) {
                    path.add(root);
                    root = root.left;
                } else {
                    TreeNode node = path.get(path.size() - 1);
                    if (node.right == null || node.right == lastVisit) {
                        path.remove(path.size() - 1);
                        lastVisit = node;
                    } else {
                        root = node.right;
                    }
                }
            }
            path.add(p);
            return path;
        }
    }

    /** 递归 */
    public static class Solution2 {
        private Map<TreeNode, Boolean> map;

        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            map = new HashMap<>();
            map.put(null, false);
            containsNode(root, p, q);
            Deque<TreeNode> stack = new ArrayDeque<>();
            while (!stack.isEmpty() || root != null) {
                if (root != null) {
                    if ((root == p || root == q) && (map.get(root.left) || map.get(root.right))
                            || (map.get(root.left) && map.get(root.right))) {
                        break;
                    }
                    stack.push(root);
                    root = root.left;
                } else {
                    root = stack.pop().right;
                }
            }
            return root;
        }

        private boolean containsNode(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null) {
                return false;
            }
            boolean b =
                    (root == p || root == q)
                            | containsNode(root.left, p, q)
                            | containsNode(root.right, p, q);
            map.put(root, b);
            return b;
        }
    }

    /** 递归 */
    public static class Solution3 {
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if (root == null || root == p || root == q) {
                return root;
            }
            TreeNode l = lowestCommonAncestor(root.left, p, q);
            TreeNode r = lowestCommonAncestor(root.right, p, q);
            if (l != null && r != null) {
                return root;
            }
            return l == null ? r : l;
        }
    }
}
