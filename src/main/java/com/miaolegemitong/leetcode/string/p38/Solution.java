package com.miaolegemitong.leetcode.string.p38;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        String last = countAndSay(n - 1);
        int i = 0;
        int j = 1;
        StringBuilder result = new StringBuilder();
        while (i < j && j <= last.length()) {
            if (j == last.length()) {
                result.append(j - i);
                result.append(last.charAt(i));
                j++;
            } else if (last.charAt(i) == last.charAt(j)) {
                j++;
            } else {
                result.append(j - i);
                result.append(last.charAt(i));
                i = j;
                j++;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.countAndSay(6));
    }
}
