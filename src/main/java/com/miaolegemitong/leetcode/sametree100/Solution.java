package com.miaolegemitong.leetcode.sametree100;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.Stack;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if ((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        Stack<TreeNode> s1 = new Stack<TreeNode>();
        Stack<TreeNode> s2 = new Stack<TreeNode>();
        s1.push(p);
        s2.push(q);
        while (true) {
            if (!((s1.isEmpty() && s2.isEmpty()) || !(s1.isEmpty() || s2.isEmpty()))) {
                return false;
            }
            if (s1.isEmpty() && s2.isEmpty()) {
                break;
            }
            TreeNode h1 = s1.pop();
            TreeNode h2 = s2.pop();
            if (h1.val != h2.val) {
                return false;
            } else {
                if (h1.right != null && h2.right != null) {
                    s1.push(h1.right);
                    s2.push(h2.right);
                } else if (h1.right == null && h2.right == null){
                } else {
                    return false;
                }
                if (h1.left != null && h2.left != null) {
                    s1.push(h1.left);
                    s2.push(h2.left);
                } else if (h1.left == null && h2.left == null) {
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
