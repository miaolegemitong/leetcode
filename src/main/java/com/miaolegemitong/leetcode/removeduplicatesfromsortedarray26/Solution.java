package com.miaolegemitong.leetcode.removeduplicatesfromsortedarray26;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/24
 * @description
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums == null) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        int m = 0;
        int n = 1;
        int ret = 0;
        int index = 0;
        while (m < n && n < nums.length) {
            if (nums[m] == nums[n]) {
                n++;
            } else {
                ret++;
                nums[index] = nums[m];
                index++;
                m = n;
                n++;
            }
            if (n == nums.length) {
                nums[index] = nums[m];
                ret++;
            }
        }
        return ret;
    }
}
