package com.example.codingPractice;

import java.util.Stack;

public class leetcode439 {

    public String parseTernary( String expression ) {
        Stack<Character> stack = new Stack<>();

        for ( int i = expression.length() - 1; i >= 0; i-- ) {
            if ( !stack.isEmpty() && stack.peek() == '?' ) {
                stack.pop();
                char one = stack.pop();
                stack.pop();
                char two = stack.pop();

                if ( expression.charAt( i ) == 'T' ) stack.push( one );
                else stack.push( two );

            } else {
                stack.push( expression.charAt( i ) );
            }
        }
        return String.valueOf( stack.pop() );
    }
}
