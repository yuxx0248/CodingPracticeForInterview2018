package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Stack;

public class leetcode155 {

    class MinStack {
        Stack<Integer> stack;
        LinkedList<Integer> list;
        /** initialize your data structure here. */
        public MinStack() {
            stack = new Stack<>();
            list = new LinkedList();

        }

        public void push(int x) {
            stack.push(x);
        }

        public void pop() {
            stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return 1;
        }
    }

}
