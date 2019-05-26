package com.miaolegemitong.leetcode.array.p1;

import java.util.HashMap;
import java.util.Map;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/24
 * @description
 */
public class SolutionN {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2) {
            return null;
        }
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                int[] res = new int[2];
                res[0] = map.get(target - nums[i]);
                res[1] = i;
                return res;
            }
            map.put(nums[i], i);
        }
        return null;
    }
}
