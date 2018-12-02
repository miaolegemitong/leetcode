package com.miaolegemitong.leetcode.math.p263;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/5/2
 * @description
 */
public class Solution {
    public boolean isUgly(int num) {
        for (int i=2; i<6 && num>0; i++) {
            while (num % i == 0) {
                num /= i;
            }
        }
        return num == 1;
    }
}
