package com.miaolegemitong.leetcode.math.p7;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/24
 * @description
 */
public class Solution {
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int tail = x % 10;
            int newResult = result * 10 + tail;
            if ((newResult - tail) / 10 != result) {
                return 0;
            }
            result = newResult;
            x = x / 10;
        }
        return result;
    }
}
