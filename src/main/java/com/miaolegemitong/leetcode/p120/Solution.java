package com.miaolegemitong.leetcode.p120;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mitong
 * @date 2019-06-17
 * @email mitong@meituan.com
 * @desc
 */
public class Solution {
    public int minimumTotal1(List<List<Integer>> triangle) {
        int[] memory = new int[triangle.size()];
        for (int i = triangle.size() - 1; i >= 0; i--) {
            for (int j = 0; j < i + 1; j++) {
                memory[j] = triangle.get(i).get(j) + (j == triangle.size() - 1 ? memory[j] : Math.min(memory[j], memory[j + 1]));
            }
        }
        return memory[0];
    }

    public int minimumTotal(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        int[][] memory = new int[triangle.size()][triangle.size()];
        for (int i = 0; i < triangle.size(); i++) {
            int total = total(triangle, triangle.size(), i, memory);
            if (total < min) {
                min = total;
            }
        }
        return min;
    }

    public int total(List<List<Integer>> triangle, int level, int index, int[][] memory) {
        int value = triangle.get(level - 1).get(index);
        if (level == 1) {
            return value;
        }
        if (memory[level - 1][index] != 0) {
            return memory[level - 1][index];
        }
        if (index == 0) {
            value += total(triangle, level - 1, index, memory);
        } else if (index == level - 1) {
            value += total(triangle, level - 1, index - 1, memory);
        } else {
            value += Math.min(total(triangle, level - 1, index - 1, memory), total(triangle, level - 1, index, memory));
        }
        memory[level - 1][index] = value;
        return value;
    }

    public static void main(String[] args) {
        List<List<Integer>> triangle = new ArrayList<>();
        List<Integer> one = new ArrayList<>();
        one.add(2);
        triangle.add(one);
        List<Integer> two = new ArrayList<>();
        two.add(3);
        two.add(4);
        triangle.add(two);
        List<Integer> three = new ArrayList<>();
        three.add(6);
        three.add(5);
        three.add(7);
        triangle.add(three);
        List<Integer> four = new ArrayList<>();
        four.add(4);
        four.add(1);
        four.add(8);
        four.add(3);
        triangle.add(four);
        Solution solution = new Solution();
        System.out.println(solution.minimumTotal1(triangle));
    }
}
