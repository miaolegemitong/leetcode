package com.miaolegemitong.leetcode.math.p258;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/5/2
 * @description
 */
public class Solution {
    public int addDigitsIteratively(int num) {
        while (num >= 10) {
            int temp = 0;
            while (num >= 10) {
                temp += num % 10;
                num /= 10;
            }
            num = temp;
        }
        return num;
    }

    public int addDigits(int num) {
        return (num - 1) % 9 + 1;
    }
}
