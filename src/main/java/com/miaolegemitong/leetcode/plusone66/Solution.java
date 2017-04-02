package com.miaolegemitong.leetcode.plusone66;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int[] plusOne(int[] digits) {
        boolean isNine = false;
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    isNine = true;
                }
            } else {
                digits[i]++;
                break;
            }
        }
        int[] ret = digits;
        if (isNine) {
            ret = new int[digits.length + 1];
            ret[0] = 1;
            for (int i = 1; i < ret.length; i++) {
                ret[i] = digits[i - 1];
            }
        }
        return ret;
    }
}
