package com.miaolegemitong.leetcode.countprimes204;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/3
 * @description
 */
public class Solution {
    public int countPrimes(int n) {
        boolean[] notPrime = new boolean[n];
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (!notPrime[i]) {
                count++;
                for (int j = 2; i*j < n; j++) {
                    notPrime[i*j] = true;
                }
            }
        }
        return count;
    }
}
