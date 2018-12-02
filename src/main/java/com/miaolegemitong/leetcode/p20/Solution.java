package com.miaolegemitong.leetcode.p20;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/24
 * @description
 */
public class Solution {
    public boolean isValid(String s) {
        if (s == null || s.length() < 2) {
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put(')', '(');
        map.put(']', '[');
        map.put('}', '{');
        for (int i = 0; i < s.length(); i++) {
            char item = s.charAt(i);
            if (map.values().contains(item)) {
                stack.push(item);
            } else {
                if (stack.isEmpty() || stack.pop() != map.get(item)) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public boolean isValid1(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
    }
}
