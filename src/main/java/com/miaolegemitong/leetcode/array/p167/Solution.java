package com.miaolegemitong.leetcode.array.p167;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2) {
            return null;
        }
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            if (numbers[l] + numbers[r] == target) {
                int[] res = new int[2];
                res[0] = l + 1;
                res[1] = r + 1;
                return res;
            } else if (numbers[l] + numbers[r] > target) {
                r--;
            } else {
                l++;
            }
        }
        return null;
    }
}
