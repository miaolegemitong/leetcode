package com.miaolegemitong.leetcode.palindromelinkedlist234;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/30
 * @description It is a common misunderstanding that the space complexity
 * of a program is just how much the size of additional memory space being
 * used besides input. An important prerequisite is neglected the above definition:
 * the input has to be read-only. By definition, changing the input and change it back
 * is not allowed (or the input size should be counted when doing so).
 * Another way of determining the space complexity of a program is to simply look at
 * how much space it has written to. Reversing a singly linked list requires writing
 * to O(n) memory space, thus the space complexities for all "reverse-the-list"-based
 * approaches are O(n), not O(1).
 */
public class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode rNode = reverseNode(middle);
        while (rNode != null) {
            if (head.val != rNode.val) {
                return false;
            }
            head = head.next;
            rNode = rNode.next;
        }
        return true;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // 反转linked list
    private ListNode reverseNode(ListNode node) {
        if (node == null || node.next == null) {
            return node;
        }
        ListNode prev = null;
        ListNode cur = node;
        while (cur != null) {
            ListNode temp = cur;
            cur = cur.next;
            temp.next = prev;
            prev = temp;
        }
        return prev;
    }
}
