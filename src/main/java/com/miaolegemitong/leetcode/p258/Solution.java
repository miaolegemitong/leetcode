package com.miaolegemitong.leetcode.p258;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
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