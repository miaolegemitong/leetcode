package com.miaolegemitong.leetcode.array.p4;

/**
 * @author miaolegemitong
 * @email mitong@miaolegemitong.com
 * @date 2019-05-26
 * @description
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int middleIndex = size / 2 + 1;
        int[] nums3 = new int[middleIndex];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < nums1.length && j < nums2.length && k < middleIndex) {
            if (nums1[i] < nums2[j]) {
                nums3[k++] = nums1[i++];
            } else {
                nums3[k++] = nums2[j++];
            }
        }
        while (i < nums1.length && k < middleIndex) {
            nums3[k++] = nums1[i++];
        }
        while (j < nums2.length && k < middleIndex) {
            nums3[k++] = nums2[j++];
        }
        return size % 2 == 0 ? (nums3[middleIndex - 1] + nums3[middleIndex - 2]) / 2.0 : Double.valueOf(nums3[middleIndex - 1]);
    }
}
