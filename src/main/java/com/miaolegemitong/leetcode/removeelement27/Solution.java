package com.miaolegemitong.leetcode.removeelement27;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int ret = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[ret] = nums[i];
                ret++;
            }
        }
        return ret;
    }
}
