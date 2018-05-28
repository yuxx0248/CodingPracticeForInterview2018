package com.example.codingPractice;

import java.util.Stack;

public class leetcode20 {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()){
            if (!stack.isEmpty() && stack.peek()==c){
                stack.pop();
            }else{
                if (c=='{') stack.add('}');
                else if (c=='[') stack.add(']');
                else if (c=='(') stack.add(')');
            }
        }

        return (stack.isEmpty());

    }


}
