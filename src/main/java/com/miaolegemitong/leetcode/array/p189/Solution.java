package com.miaolegemitong.leetcode.array.p189;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/3/1
 * @description
 */
public class Solution {
    // Time Limit Exceeded
    public void rotate(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0 || k == nums.length) {
            return;
        }
        int temp;
        for (int i = 0; i < k; i++) {
            temp = nums[nums.length - 1];
            for (int j = nums.length - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = temp;
        }
    }

    public void rotate1(int[] nums, int k) {
        if (nums == null || nums.length < 2 || k == 0 || k == nums.length) {
            return;
        }
        k = k > nums.length ? k % nums.length : k;
        int middle = nums.length - k;
        int temp;
        for (int i = 0; i < middle / 2; i++) {
            temp = nums[i];
            nums[i] = nums[middle - 1 - i];
            nums[middle - 1 - i] = temp;
        }
        for (int i = middle; i < middle + (nums.length - middle) / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length + middle - 1 - i];
            nums[nums.length + middle - 1 - i] = temp;
        }
        for (int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - 1 - i];
            nums[nums.length - 1 - i] = temp;
        }
    }

    private void reverse(int[] nums, int begin, int end) {
        int i = begin;
        int j = end;
        int temp = 0;
        while (i < j) {
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        solution.rotate1(nums, 3);
        for (int n : nums) {
            System.out.println(n);
        }
    }
}
