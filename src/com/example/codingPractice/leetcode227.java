package com.example.codingPractice;

import java.util.Stack;

public class leetcode227 {

    public int calculate(String s) {
        Stack<Character> stack = new Stack<>();

        for ( int i = 0;i<s.length();i++){
            if ( !stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/')){
            }else{
                stack.push( s.charAt( i ) );
            }
        }
            return 1;
    }

    }
