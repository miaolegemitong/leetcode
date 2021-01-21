package com.miaolegemitong.leetcode.p739;

import java.util.Stack;

/**
 * @author mitong
 * @date 2019-07-04
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    public int[] dailyTemperatures(int[] T) {
        int[] result = new int[T.length];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < T.length; i++) {
            if (stack.isEmpty() || T[i] < T[stack.peek()]) {
                stack.push(i);
            } else {
                while (!stack.isEmpty() && T[i] > T[stack.peek()]) {
                    int index = stack.pop();
                    result[index] = i - index;
                }
                stack.push(i);
            }
        }
        return result;
    }
}
