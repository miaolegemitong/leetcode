package com.miaolegemitong.leetcode.firstbadversion278;

/**
 * Created by mitong on 2017/5/27.
 */
public class Solution {
    public int firstBadVersion(int n) {
        int start = 1, end = n;
        while (start < end) {
            int mid = start + (end-start) / 2;
            if (!isBadVersion(mid)) start = mid + 1;
            else end = mid;
        }
        return start;
    }

    private boolean isBadVersion(int version) {
        return false;
    }
}
