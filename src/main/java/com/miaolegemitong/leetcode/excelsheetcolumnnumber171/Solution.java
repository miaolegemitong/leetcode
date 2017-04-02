package com.miaolegemitong.leetcode.excelsheetcolumnnumber171;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int ret = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int bit = s.length() - i - 1;
            ret += (c - 64) * Math.pow(26, bit);
        }
        return ret;
    }

    public static void main(String[] args) {
        com.miaolegemitong.leetcode.excelsheetcolumntitle168.Solution solution = new com.miaolegemitong.leetcode.excelsheetcolumntitle168.Solution();
        Solution solution1 = new Solution();
        System.out.println(solution1.titleToNumber(solution.convertToTitle(703)));
    }
}
