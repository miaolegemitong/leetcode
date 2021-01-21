package com.miaolegemitong.leetcode.p34;

/**
 * @author mitong
 * @date 2019-07-08
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    public int[] searchRange(int[] nums, int target) {
        if (nums == null || nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1) {
            int index = nums[0] == target ? 0 : -1;
            return new int[] {index, index};
        }
        int begin = 0;
        int end = nums.length - 1;
        int mid;
        while (true) {
            if (begin > end) {
                return new int[]{-1, -1};
            }
            mid = begin + (end - begin) / 2;
            if (target == nums[mid]) {
                break;
            }
            if (target > nums[mid]) {
                begin = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        int left = mid - 1;
        int right = mid + 1;
        while (left >= 0) {
            if (nums[left] == target) {
                left--;
            } else {
                break;
            }
        }
        while (right < nums.length) {
            if (nums[right] == target) {
                right++;
            } else {
                break;
            }
        }
        return new int[]{left + 1, right - 1};
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.searchRange(new int[]{5, 7, 7, 8, 8, 8}, 8);
    }
}
