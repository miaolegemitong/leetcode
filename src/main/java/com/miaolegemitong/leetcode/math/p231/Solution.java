package com.miaolegemitong.leetcode.math.p231;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/24
 * @description
 */
public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        int ret = 0;
        while (n > 0) {
            ret += n & 1;
            n = n >> 1;
        }
        return ret == 1;
    }

    public boolean isPowerOfTwo1(int n) {
        return n > 0 && (n & (n - 1)) == 0;
    }
}
