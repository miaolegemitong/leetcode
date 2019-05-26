package com.miaolegemitong.leetcode.array.p119;

import java.util.ArrayList;
import java.util.List;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/2/27
 * @description
 */
public class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> allRows = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i < rowIndex + 1; i++) {
            row.add(0, 1);
            for (int j = 1; j < row.size() - 1; j++) {
                row.set(j, row.get(j) + row.get(j + 1));
            }
            allRows.add(new ArrayList<>(row));
        }
        return allRows.get(allRows.size() - 1);
    }
}
