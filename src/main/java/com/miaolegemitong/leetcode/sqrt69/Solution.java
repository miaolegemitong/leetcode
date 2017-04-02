package com.miaolegemitong.leetcode.sqrt69;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int mySqrt(int x) {
        double begin = 0;
        double end = x;
        double result = 1;
        double mid = 1;
        while (Math.abs(result - x) > 0.000001) {
            mid = (begin + end) / 2;
            result = mid * mid;
            if (result > x) {
                end = mid;// 二分的范围
            } else {
                begin = mid;
            }
        }
        return (int) mid;
    }
}
