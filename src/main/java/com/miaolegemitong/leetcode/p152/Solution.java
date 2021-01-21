package com.miaolegemitong.leetcode.p152;

/**
 * @author mitong
 * @date 2019-06-17
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    public int maxProduct(int[] nums) {
        int[][] mem = new int[nums.length][2];
        mem[0][0] = nums[0]; //max
        mem[0][1] = nums[0]; //min
        for (int i = 1; i < nums.length; i++) {
            mem[i][0] = nums[i] > 0 ? mem[i - 1][0] * nums[i] : mem[i - 1][1] * nums[i];
            mem[i][1] = nums[i] > 0 ? mem[i - 1][1] * nums[i] : mem[i - 1][0] * nums[i];
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (mem[i][0] > max) {
                max = mem[i][0];
            }
            if (mem[i][1] > max) {
                max = mem[i][1];
            }
        }
        return max;
    }

    private int max = Integer.MIN_VALUE;

    public int maxProduct1(int[] nums) {
        max(nums, 0, 0);
        return this.max;
    }

    public void max(int[] nums, int begin, int end) {
        if (begin > end || begin >= nums.length || end >= nums.length) {
            return;
        }
        if (begin == end) {
            if (nums[begin] > this.max) {
                this.max = nums[begin];
            }
        } else {
            int product = 1;
            for (int i = begin; i <= end; i++) {
                product *= nums[i];
            }
            if (product >= this.max) {
                this.max = product;
            }
        }
        max(nums, begin, end + 1);
        max(nums, begin + 1, end);
    }

    public static void main(String[] args) {
        int[] nums = new int[]{-2, 3, -4};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(nums));
    }
}
