package com.miaolegemitong.leetcode.array.p217;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
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
