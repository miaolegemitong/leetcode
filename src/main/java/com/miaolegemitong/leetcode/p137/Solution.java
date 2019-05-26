package com.miaolegemitong.leetcode.p137;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public int singleNumber(int[] nums) {
        int ones = 0, twos = 0;
        for (int num : nums) {
            ones = (ones ^ num) & ~twos;
            twos = (twos ^ num) & ~ones;
        }
        return ones;
    }
}