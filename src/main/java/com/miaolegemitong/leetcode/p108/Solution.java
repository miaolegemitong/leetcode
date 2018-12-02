package com.miaolegemitong.leetcode.p108;

import com.miaolegemitong.leetcode.common.TreeNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/26
 * @description
 */
public class Solution {
    public TreeNode sortedArrayToBST(final int[] nums) {
        if (nums.length == 0) {
            return null;
        }
        int mid = (nums.length - 1) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, 0, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, nums.length - 1);
        return root;
    }

    private TreeNode sortedArrayToBST(final int[] nums, int start, int end) {
        if (start == end) {
            return new TreeNode(nums[start]);
        }
        if (start > end) {
            return null;
        }
        int mid = start + (end - start) / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums, start, mid - 1);
        root.right = sortedArrayToBST(nums, mid + 1, end);
        return root;
    }
}
