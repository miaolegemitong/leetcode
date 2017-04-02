package com.miaolegemitong.leetcode.containsduplicate217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/3
 * @description
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            if (!set.add(n)) {
                return true;
            }
        }
        return false;
    }
}
