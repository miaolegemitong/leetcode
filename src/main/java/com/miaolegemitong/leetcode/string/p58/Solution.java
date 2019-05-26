package com.miaolegemitong.leetcode.string.p58;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int ret = 0;
        for (; j < s.length();) {
            if (s.charAt(j) != ' ') {
                ret = j - i + 1;
                j++;
            } else {
                j++;
                i = j;
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.lengthOfLastWord("b  a   "));
    }
}
