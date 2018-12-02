package com.miaolegemitong.leetcode.array.p219;

import java.util.HashSet;
import java.util.Set;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/6
 * @description
 */
public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!hs.add(nums[i])) {
                return true;
            }
            if (hs.size() == k + 1) {
                hs.remove(nums[i - k]);
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.containsNearbyDuplicate(new int[]{1, 2, 3, 1, 4}, 2));
    }
}
