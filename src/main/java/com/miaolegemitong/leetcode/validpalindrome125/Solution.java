package com.miaolegemitong.leetcode.validpalindrome125;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public boolean isPalindrome(String s) {
        if (s == null || s.length() < 2) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i <= j) {
            char ci = s.charAt(i);
            char cj = s.charAt(j);
            if (!(isAlpha(ci) || isNumeric(ci))) {
                i++;
                continue;
            }
            if (!(isAlpha(cj) || isNumeric(cj))) {
                j--;
                continue;
            }
            if (ci == cj || (isAlpha(ci) && isAlpha(cj) && Math.abs(ci - cj) == 32)) {
                i++;
                j--;
            } else {
                return false;
            }
        }
        return true;
    }

    private boolean isNumeric(char c) {
        return c >= '0' && c <= '9';
    }

    private boolean isAlpha(char c) {
        return (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z');
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
