package com.miaolegemitong.leetcode.missingnumber268;

/**
 * Created by mitong on 2017/5/19.
 */
public class Solution {
    public int missingNumber(int[] nums) {
        int xor = 0;
        int i = 0;
        for (; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
}
