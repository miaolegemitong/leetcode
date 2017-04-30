package com.miaolegemitong.leetcode.implementstackusingqueues225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/29
 * @description
 */
public class MyStack {
    //one Queue solution
    private Queue<Integer> q = new LinkedList<Integer>();

    // Push element x onto stack.
    public void push(int x) {
        q.add(x);
        for(int i = 1; i < q.size(); i ++) { //rotate the queue to make the tail be the head
            q.add(q.poll());
        }
    }

    // Removes the element on top of the stack.
    public int pop() {
        return q.poll();
    }

    // Get the top element.
    public int top() {
        return q.peek();
    }

    // Return whether the stack is empty.
    public boolean empty() {
        return q.isEmpty();
    }

    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.push(10);
        int param_2 = obj.pop();
        int param_3 = obj.top();
        boolean param_4 = obj.empty();
    }
}
