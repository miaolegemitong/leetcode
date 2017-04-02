package com.miaolegemitong.leetcode.pathsum113;

import com.miaolegemitong.leetcode.common.TreeNode;

import java.util.LinkedList;
import java.util.List;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int sum){
        List<List<Integer>> result  = new LinkedList<>();
        List<Integer> currentResult  = new LinkedList<>();
        pathSum(root,sum,currentResult,result);
        return result;
    }

    private void pathSum(TreeNode root, int sum, List<Integer> currentResult,
                        List<List<Integer>> result) {
        if (root == null) {
            return;
        }
        currentResult.add(root.val);
        if (root.left == null && root.right == null && sum == root.val) {
            result.add(new LinkedList<>(currentResult));
            currentResult.remove(currentResult.size() - 1);//don't forget to remove the last integer
            return;
        } else {
            pathSum(root.left, sum - root.val, currentResult, result);
            pathSum(root.right, sum - root.val, currentResult, result);
        }
        currentResult.remove(currentResult.size() - 1);
    }
}
