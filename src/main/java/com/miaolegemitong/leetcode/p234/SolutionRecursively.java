package com.miaolegemitong.leetcode.p234;

import com.miaolegemitong.leetcode.common.ListNode;

/**
 * @author mitong
 * @email mitong@miaolegemitong.com
 * @date 2017/4/30
 * @description O(n) time and O(n) space
 */
public class SolutionRecursively {
    public ListNode root;

    public boolean isPalindrome(ListNode head) {
        root = head;
        return (head == null) || _isPalindrome(head);
    }

    public boolean _isPalindrome(ListNode head) {
        boolean flag = true;
        if (head.next != null) {
            flag = _isPalindrome(head.next);
        }
        if (flag && root.val == head.val) {
            root = root.next;
            return true;
        }
        return false;
    }
}
