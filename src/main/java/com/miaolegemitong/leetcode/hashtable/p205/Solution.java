package com.miaolegemitong.leetcode.hashtable.p205;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/3/3
 * @description
 */
public class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] m = new int[512];
        for (int i = 0; i < s.length(); i++) {
            if (m[s.charAt(i)] != m[t.charAt(i)+256]) {
                return false;
            }
            m[s.charAt(i)] = m[t.charAt(i)+256] = i+1;
        }
        return true;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        long start = System.currentTimeMillis();
        System.out.println(solution.isIsomorphic("ab", "ca"));
        System.out.println(System.currentTimeMillis() - start);
    }
}
