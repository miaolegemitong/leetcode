package com.miaolegemitong.leetcode.p1;


/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/24
 * @description 对已排序的数组可用这种方法
 */
public class SolutionNLogN {
    public static int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if (nums[l] + nums[r] == target) {
                int[] res = new int[2];
                res[0] = l;
                res[1] = r;
                return res;
            } else if (nums[l] + nums[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return null;
    }
}
