package com.miaolegemitong.leetcode.p501;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mitong
 * @date 2019-07-03
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    TreeNode prev;

    int count = 1;

    int maxCount;

    public int[] findMode(TreeNode root) {
        List<Integer> ret = new ArrayList<>();
        inorder(root, ret);
        int[] result = new int[ret.size()];
        for (int i = 0; i < ret.size(); i++) {
            result[i] = ret.get(i);
        }
        return result;
    }

    private void inorder(TreeNode root, List<Integer> ret) {
        if (root == null) {
            return;
        }
        inorder(root.left, ret);
        if (prev != null && prev.val == root.val) {
            count++;
        } else {
            count = 1;
        }
        if (count > maxCount) {
            maxCount = count;
            ret.clear();
            ret.add(root.val);
        } else if (count == maxCount) {
            ret.add(root.val);
        }
        prev = root;
        inorder(root.right, ret);
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode a = new TreeNode(8);
        TreeNode b = new TreeNode(10);
        TreeNode c = new TreeNode(8);
        TreeNode d = new TreeNode(8);
        TreeNode e = new TreeNode(10);
        TreeNode f = new TreeNode(11);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
        Solution solution = new Solution();
        int[] result = solution.findMode(root);
        System.out.println();
    }
}
