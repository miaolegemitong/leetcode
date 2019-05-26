package com.miaolegemitong.leetcode.p206;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/3/3
 * @description
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode p = head;
        ListNode q = head.next;
        while (q != null) {
            ListNode temp = q.next;
            q.next = p;
            p = q;
            q = temp;
        }
        head.next = null;
        return p;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode second = new ListNode(2);
        ListNode third = new ListNode(3);
        head.next = second;
        second.next = third;
        Solution solution = new Solution();
        ListNode result = solution.reverseList(head);
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }
}
