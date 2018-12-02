package com.miaolegemitong.leetcode.tree.p257;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/5/2
 * @description
 */
public class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> paths = new ArrayList<>();
        if(root == null) return paths;
        if(root.left == null && root.right == null){
            paths.add(root.val+"");
            return paths;
        }
        for (String path : binaryTreePaths(root.left)) {
            paths.add(root.val + "->" + path);
        }
        for (String path : binaryTreePaths(root.right)) {
            paths.add(root.val + "->" + path);
        }
        return paths;
    }
}
