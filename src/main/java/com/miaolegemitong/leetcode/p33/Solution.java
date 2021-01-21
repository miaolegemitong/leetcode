package com.miaolegemitong.leetcode.p33;

/**
 * @author mitong
 * @date 2019-07-08
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    public int search(int[] nums, int target) {
        int begin = 0;
        int end = nums.length - 1;
        while (true) {
            if (begin > end) {
                return -1;
            }
            int mid = begin + (end - begin) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (nums[begin] <= nums[mid]) {
                if (target >= nums[begin] && target < nums[mid]) {
                    end = mid - 1;
                } else {
                    begin = mid + 1;
                }
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    begin = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.search(new int[]{3, 1}, 1));
    }
}
