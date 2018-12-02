package com.miaolegemitong.leetcode.p107;

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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<List<Integer>> ret = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<TreeNode> level = new ArrayList<>();
            List<Integer> values = new ArrayList<>();
            while (!queue.isEmpty()) {
                TreeNode node = queue.poll();
                level.add(node);
                values.add(node.val);
            }
            ret.add(0, values);
            for (TreeNode node : level) {
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return ret;
    }
}
