package com.miaolegemitong.leetcode.array.p121;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int ret = Integer.MIN_VALUE;
        for (; j < prices.length; j++) {
            int profit = prices[j] - prices[i];
            if (profit >= 0) {
                ret = ret < profit ? profit : ret;
            } else {
                i = j;
            }
        }
        return ret == Integer.MIN_VALUE ? 0 : ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }
}
