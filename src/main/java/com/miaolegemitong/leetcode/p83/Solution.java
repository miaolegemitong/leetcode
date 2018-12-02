package com.miaolegemitong.leetcode.p83;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/2/25
 * @description
 */
public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode i = head;
        ListNode j = head.next;
        boolean isDuplicate = false;
        while (j != null) {
            if (i.val == j.val) {
                isDuplicate = true;
            } else {
                i.next = j;
                i = j;
            }
            j = j.next;
        }
        if (isDuplicate) {
            i.next = null;
        }
        return head;
    }
}
