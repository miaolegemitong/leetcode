package com.miaolegemitong.leetcode.tree.p111;

import com.miaolegemitong.leetcode.common.TreeNode;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        if (left == 0 && right == 0) return 1;
        if (left == 0) left = Integer.MAX_VALUE;
        if (right == 0) right = Integer.MAX_VALUE;
        return Math.min(left, right) + 1;
    }
}
