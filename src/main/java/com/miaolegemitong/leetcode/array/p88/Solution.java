package com.miaolegemitong.leetcode.array.p88;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (true) {
            if (i >= 0 && j >= 0) {
                if (nums2[j] >= nums1[i]) {
                    nums1[index--] = nums2[j--];
                } else {
                    nums1[index--] = nums1[i--];
                }
            } else if (j >= 0) {
                nums1[index--] = nums2[j--];
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[0];
        solution.merge(nums1, 1, nums2, 0);
    }
}
