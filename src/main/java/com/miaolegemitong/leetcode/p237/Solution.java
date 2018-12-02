package com.miaolegemitong.leetcode.p237;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/30
 * @description
 */
public class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
