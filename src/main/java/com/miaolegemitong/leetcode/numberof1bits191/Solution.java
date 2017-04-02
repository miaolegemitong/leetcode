package com.miaolegemitong.leetcode.numberof1bits191;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/2
 * @description
 */
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) != 0) {
                result++;
            }
            n >>>= 1;   // CATCH: must do unsigned shift
        }
        return result;
    }
}
