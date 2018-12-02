package com.miaolegemitong.leetcode.p168;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public String convertToTitle(int n) {
        StringBuilder builder = new StringBuilder();
        while (n > 0) {
            int remainder = n % 26;
            if (remainder == 0) {
                builder.append((char) (remainder + 90));
                n = n / 26 - 1;
            } else {
                builder.append((char) (remainder + 64));
                n = n / 26;
            }
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.convertToTitle(702));
    }
}
