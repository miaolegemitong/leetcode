package com.miaolegemitong.leetcode.p14;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/24
 * @description
 */
public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }
        String ret = "";
        int index = 0;
        int minLength = minLength(strs);
        while (index < minLength) {
            char temp = strs[0].charAt(index);
            int i = 1;
            for (; i < strs.length; i++) {
                if (strs[i].charAt(index) != temp) {
                    break;
                }
            }
            if (i != strs.length) {
                break;
            }
            ret += temp;
            index++;
        }
        return ret;
    }

    private int minLength(String[] strs) {
        int min = Integer.MAX_VALUE;
        for (String str : strs) {
            if (str.length() < min) {
                min = str.length();
            }
        }
        return min;
    }
}
