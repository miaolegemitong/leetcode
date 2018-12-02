package com.miaolegemitong.leetcode.p122;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public int maxProfit(int[] prices) {
        if (prices == null && prices.length < 2) {
            return 0;
        }
        int i = 0;
        int j = 1;
        int ret = 0;
        for (; j < prices.length; j++) {
            int profit = prices[j] - prices[j - 1];
            if (profit < 0) {
                ret += prices[j - 1] - prices[i];
                i = j;
            } else if (j == prices.length - 1) {
                ret += prices[j] - prices[i];
            }
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{1,2,3,2,3,6,9,4,100}));
    }
}
