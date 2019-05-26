package com.miaolegemitong.leetcode.tree.p101;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/26
 * @description
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new ArrayDeque<>();
        if (root.left != null && root.right != null && root.left.val == root.right.val) {
            queue.add(root.left);
            queue.add(root.right);
        } else return root.left == null && root.right == null;
        while (!queue.isEmpty()) {
            List<TreeNode> left = new ArrayList<>();
            List<TreeNode> right = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                if (i < size / 2) {
                    left.add(queue.poll());
                } else {
                    right.add(queue.poll());
                }
            }
            if (left.size() != right.size()) {
                return false;
            }
            for (int i = 0; i < left.size(); i++) {
                TreeNode leftNode = left.get(i);
                TreeNode rightNode = right.get(left.size() - i - 1);
                if ((leftNode.left == null && rightNode.right != null)
                        || (leftNode.left != null && rightNode.right == null)
                        || (leftNode.right == null && rightNode.left != null)
                        || (leftNode.right != null && rightNode.left == null)
                        || (leftNode.left != null && leftNode.left.val != rightNode.right.val)
                        || (leftNode.right != null && leftNode.right.val != rightNode.left.val)) {
                    return false;
                }
                if (leftNode.left != null) {
                    queue.add(leftNode.left);
                }
                if (leftNode.right != null) {
                    queue.add(leftNode.right);
                }
            }
            for (TreeNode node : right) {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        TreeNode left = new TreeNode(2);
        TreeNode right = new TreeNode(2);
//        TreeNode left1 = new TreeNode(3);
        TreeNode right1 = new TreeNode(3);
//        TreeNode left2 = new TreeNode(4);
        TreeNode right2 = new TreeNode(3);
        root.left = left;
        root.right = right;
//        left.left = left1;
        left.right = right1;
//        right.left = left2;
        right.right = right2;
        System.out.println(solution.isSymmetric(root));
    }
}
