package com.miaolegemitong.leetcode.tree.p110;

import com.miaolegemitong.leetcode.common.TreeNode;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/26
 * @description
 */
public class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int l = cntHeight(root.left);
        int r = cntHeight(root.right);
        return !(l < 0 || r < 0 || Math.abs(l - r) > 1);
    }

    private int cntHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int l = cntHeight(root.left);
        int r = cntHeight(root.right);
        if (l < 0 || r < 0 || Math.abs(l - r) > 1) {
            return -1; //自定义 return -1，表示不平衡的情况
        } else {
            return Math.max(l, r) + 1;
        }
    }
}
