package com.miaolegemitong.leetcode.p172;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public int trailingZeroes(int n) {
        int m = n / 5;
        if (m < 5) {
            return m;
        } else {
            return m + trailingZeroes(m);
        }
    }
}
