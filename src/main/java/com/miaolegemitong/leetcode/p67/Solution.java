package com.miaolegemitong.leetcode.p67;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public String addBinary(String a, String b) {
        StringBuilder builder = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        boolean carry = false;
        while (true) {
            if (i < 0 && j < 0) {
                break;
            }
            if (i >= 0 && j >= 0) {
                char ac = a.charAt(i--);
                char bc = b.charAt(j--);
                if (ac == '1' && bc == '1') {
                    if (carry) {
                        builder.append("1");
                    } else {
                        builder.append("0");
                        carry = true;
                    }
                } else if ((ac == '1' && bc == '0') || (ac == '0' && bc == '1')) {
                    builder.append(carry ? "0" : "1");
                } else {
                    if (carry) {
                        builder.append("1");
                        carry = false;
                    } else {
                        builder.append("0");
                    }
                }
            } else if (i >= 0) {
                char ac = a.charAt(i--);
                if (ac == '1') {
                    builder.append(carry ? "0" : "1");
                } else {
                    if (carry) {
                        builder.append("1");
                        carry = false;
                    } else {
                        builder.append("0");
                    }
                }
            } else if (j >= 0) {
                char bc = b.charAt(j--);
                if (bc == '1') {
                    builder.append(carry ? "0" : "1");
                } else {
                    if (carry) {
                        builder.append("1");
                        carry = false;
                    } else {
                        builder.append("0");
                    }
                }
            }
        }
        if (carry) {
            builder.append("1");
        }
        return builder.reverse().toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.addBinary("11", "1001"));
    }
}
