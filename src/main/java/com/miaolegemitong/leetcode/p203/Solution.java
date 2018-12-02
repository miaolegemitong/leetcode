package com.miaolegemitong.leetcode.p203;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/3/2
 * @description
 */
public class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        ListNode p = new ListNode(-1);
        p.next = head;
        ListNode q = head;
        ListNode newHead = p;
        while (q != null) {
            if (q.val == val) {
                p.next = q.next;
            } else {
                p = q;
            }
            q = q.next;
        }
        return newHead.next;
    }
}
