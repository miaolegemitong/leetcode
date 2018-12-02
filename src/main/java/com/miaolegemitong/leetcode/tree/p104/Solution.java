package com.miaolegemitong.leetcode.tree.p104;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/26
 * @description
 */
public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int depth = 1;
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> layer = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                layer.add(queue.poll());
            }
            boolean hasNextLayer = false;
            for (int i = 0; i < size; i++) {
                TreeNode node = layer.get(i);
                if (node.left != null || node.right != null) {
                    hasNextLayer = true;
                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            if (hasNextLayer) {
                depth++;
            }
        }
        return depth;
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
        right1.left = right2;
        System.out.println(solution.maxDepth(root));
    }
}
