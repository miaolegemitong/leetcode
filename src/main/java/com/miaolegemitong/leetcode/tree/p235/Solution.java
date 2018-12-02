package com.miaolegemitong.leetcode.tree.p235;

import com.miaolegemitong.leetcode.common.TreeNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/30
 * @description
 */
public class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if ((root.val - p.val) * (root.val - q.val) <= 0) {
            return root;
        }
        if (root.val - p.val > 0 && root.val - q.val > 0) {
            return lowestCommonAncestor(root.left, p, q);
        }
        if (root.val - p.val < 0 && root.val - q.val < 0) {
            return lowestCommonAncestor(root.right, p, q);
        }
        return null;
    }
}
