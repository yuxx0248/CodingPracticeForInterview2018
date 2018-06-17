package com.example.codingPractice;

import java.util.Stack;

public class leetcode32 {

    public int longestValidParentheses( String s ) {
        Stack<Integer> stack = new Stack<>();
        int len = 0;
        stack.push( -1 );
        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt( i ) == '(' ) stack.push( i );
            else {
                stack.pop();
                if ( stack.isEmpty() ) stack.push( i );
                else {
                    len = Math.max( len, i - stack.peek() );
                }
            }
        }

        return len;
    }

    public int longestValidParenthesesDP( String s ) {
        int len = 0;
        boolean[] dp = new boolean[ s.length() ];
        for ( int i = 0; i < s.length(); i++ ) {
            if ( s.charAt( i ) == '(' ) dp[ i ] = true;
            else {
                for ( int j = i - 1; j >= 0; j-- ) {
                    if ( dp[ j ] ) len = Math.max( len, i - j + 1 );
                    dp[ j ] = false;
                    break;
                }
            }
        }
        return len;
    }


}
