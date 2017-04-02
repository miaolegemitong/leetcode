package com.miaolegemitong.leetcode.implementstrstr28;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int strStr(String haystack, String needle) {
        if (haystack == null || needle == null || haystack.length() < needle.length()) {
            return -1;
        }
        int m = 0;
        int n = 0;
        while (true) {
            if (n == needle.length()) {
                return m - needle.length();
            } else if (m >= haystack.length()) {
                return -1;
            } else if (haystack.charAt(m) == needle.charAt(n)) {
                m++;
                n++;
            } else {
                m = m - n + 1;
                n = 0;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.strStr("mississippi", "issip"));
    }
}
