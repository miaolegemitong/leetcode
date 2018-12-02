package com.miaolegemitong.leetcode.dynamicprogramming.p70;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int climbStairs(int n) {
        int a = 1, b = 1;
        while (n-- > 0) {
            a = (b += a) - a;
        }
        return a;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.climbStairs(4));
    }
}
