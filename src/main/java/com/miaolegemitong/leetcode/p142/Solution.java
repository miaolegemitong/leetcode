package com.miaolegemitong.leetcode.p142;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/28
 * @description
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = head;
        boolean cycle = false;
        while (q != null && q.next != null) {
            p = p.next;
            q = q.next.next;
            if (p == q) {
                cycle = true;
                break;
            }
        }
        if (!cycle) {
            return null;
        }
        p = head;
        while (p != q) {
            p = p.next;
            q = q.next;
        }
        return p;
    }
}
