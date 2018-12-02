package com.miaolegemitong.leetcode.p225;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author mitong
 * @email mitong@staff.sina.com.cn
 * @date 2017/4/29
 * @description
 */
public class MyStackUsingTwoQueues {
    private Queue<Integer> queue1;

    private Queue<Integer> queue2;

    /** Initialize your data structure here. */
    public MyStackUsingTwoQueues() {
        queue1 = new LinkedList<>();
        queue2 = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if (queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(x);
        } else if (!queue1.isEmpty() && queue2.isEmpty()) {
            queue1.add(x);
        } else if (queue1.isEmpty() && !queue2.isEmpty()) {
            queue2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            return queue1.poll();
        } else if (!queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            return queue2.poll();
        }
        return Integer.MIN_VALUE;
    }

    /** Get the top element. */
    public int top() {
        if (!queue1.isEmpty()) {
            while (queue1.size() > 1) {
                queue2.add(queue1.poll());
            }
            int result = queue1.poll();
            queue2.add(result);
            return result;
        } else if (!queue2.isEmpty()) {
            while (queue2.size() > 1) {
                queue1.add(queue2.poll());
            }
            int result = queue2.poll();
            queue1.add(result);
            return result;
        }
        return Integer.MIN_VALUE;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue1.isEmpty() && queue2.isEmpty();
    }
}
