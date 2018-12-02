package com.miaolegemitong.leetcode.p35;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.searchInsert(new int[]{11, 12, 15}, 10));
    }
}
