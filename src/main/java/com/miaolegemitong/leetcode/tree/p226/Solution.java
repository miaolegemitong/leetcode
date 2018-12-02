package com.miaolegemitong.leetcode.tree.p226;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/29
 * @description
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        if (root.left != null || root.right != null) {
            TreeNode temp = root.left;
            root.left = root.right;
            root.right = temp;
        }
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }

    public TreeNode inverTreeIteratively(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        TreeNode node = queue.poll();
        while (node != null) {
            if (node.left != null || node.right != null) {
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
            }
            if (node.left != null) {
                queue.add(node.left);
            }
            if (node.right != null) {
                queue.add(node.right);
            }
            node = queue.poll();
        }
        return root;
    }
}
