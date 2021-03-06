package com.miaolegemitong.leetcode.tree.p112;

import com.miaolegemitong.leetcode.common.TreeNode;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public boolean hasPathSum(TreeNode root, int sum) {
        return root != null && (root.left == null && root.right == null && sum - root.val == 0 || hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val));
    }
}
