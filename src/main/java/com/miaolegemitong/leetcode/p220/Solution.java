package com.miaolegemitong.leetcode.p220;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/6
 * @description
 */
public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = nums[i] + k; j >= Math.abs(nums[i] - k); j--) {
                if (set.contains(j)) {
                    return true;
                }
            }
            set.add(nums[i]);
            if (set.size() == k + 1) {
                set.remove(nums[i - k]);
            }
        }
        return false;
    }
}
