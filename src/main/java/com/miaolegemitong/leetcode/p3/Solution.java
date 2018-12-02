package com.miaolegemitong.leetcode.p3;

import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        char[] cs = s.toCharArray();
        int res = 0;
        Map<Character, Integer> map = new HashMap<>();
        int lastIndex = 0;
        for (int i = 0; i < cs.length; i++) {
            if (!map.containsKey(cs[i])) {
                map.put(cs[i], i);
            } else {
                res = Math.max(res, map.size());
                int pos = map.get(cs[i]);
                for (int j = lastIndex; j <= pos; j++) {
                    map.remove(cs[j]);
                }
                lastIndex = pos + 1;
                map.put(cs[i], i);
            }
        }
        return Math.max(res, map.size());
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("bpfbhmipx"));
    }
}