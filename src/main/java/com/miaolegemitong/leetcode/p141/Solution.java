package com.miaolegemitong.leetcode.p141;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return false;
        }
        ListNode p = head;
        ListNode q = head;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                return true;
            }
        }
        return false;
    }
}
