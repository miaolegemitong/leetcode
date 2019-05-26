package com.miaolegemitong.leetcode.p21;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/24
 * @description
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode ptr = head;
        while (l1 != null || l2 != null) {
            ListNode cur;
            if (l1 == null) {
                cur = l2;
                l2 = l2.next;
            } else if (l2 == null) {
                cur = l1;
                l1 = l1.next;
            } else {
                if (l1.val > l2.val) {
                    cur = l2;
                    l2 = l2.next;
                } else {
                    cur = l1;
                    l1 = l1.next;
                }
            }
            ptr.next = cur;
            ptr = ptr.next;
        }
        return head.next;
    }

    public ListNode copy(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode mergeHead;
        if (l1.val < l2.val) {
            mergeHead = l1;
            mergeHead.next = mergeTwoLists(l1.next, l2);
        } else {
            mergeHead = l2;
            mergeHead.next = mergeTwoLists(l1, l2.next);
        }
        return mergeHead;
    }
}
