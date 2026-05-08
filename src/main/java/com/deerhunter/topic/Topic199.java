package com.deerhunter.topic;

import com.deerhunter.tree.TreeNode;
import org.apache.commons.lang3.tuple.Pair;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * 199. Binary Tree Right Side View
 * Medium
 * <p>
 * 3210
 * <p>
 * 172
 * <p>
 * Add to List
 * <p>
 * Share
 * Given a binary tree, imagine yourself standing on the right side of it, return the values of the nodes you can see ordered from top to bottom.
 * <p>
 * Example:
 * <p>
 * Input: [1,2,3,null,5,null,4]
 * Output: [1, 3, 4]
 * Explanation:
 * <p>
 * 1            <---
 * /   \
 * 2     3         <---
 * \     \
 * 5     4       <---
 * <p>
 * Copyright (c) 20120 deerhunter0837@gmail.com All Rights Reserved.
 *
 * @author xuejunc
 * @createTime 2021/1/20 11:08
 */
public class Topic199 {
    public static class Solution {
        public List<Integer> rightSideView(TreeNode root) {
            List<Integer> res = new ArrayList<>();
            int maxDepth = 0;
            int curDepth = 0;
            ArrayDeque<Pair<TreeNode, Integer>> stack = new ArrayDeque<>();
            while (root != null || !stack.isEmpty()) {
                if (root == null) {
                    Pair<TreeNode, Integer> pair = stack.pop();
                    root = pair.getKey();
                    curDepth = pair.getValue();
                    continue;
                }

                curDepth++;

                if (curDepth > maxDepth) {
                    res.add(root.val);
                    maxDepth++;
                }
                if (root.right != null) {
                    if (root.left != null) {
                        stack.push(Pair.of(root.left, curDepth));
                    }
                    root = root.right;
                } else {
                    root = root.left;
                }
            }
            return res;
        }
    }
}
