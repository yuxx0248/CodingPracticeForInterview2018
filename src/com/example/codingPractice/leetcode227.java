package com.example.codingPractice;

import java.util.Stack;

public class leetcode227 {

    public static int calculate( String s ) {
        Stack<Integer> stack = new Stack<>();

        s = s.replaceAll( " ", "" );
        int val = 0;
        char sign = '+';
        for ( int i = 0; i < s.length(); i++ ) {
            if ( Character.isDigit( s.charAt( i ) ) ) {
                val = val * 10 + ( s.charAt( i ) - '0' );
            }
            if ( !Character.isDigit( s.charAt( i ) ) || i == s.length() - 1 ) {
                switch ( sign ) {
                    case '+':
                        stack.push( val );
                        break;
                    case '-':
                        stack.push( -val );
                        break;
                    case '*':
                        stack.push( stack.pop() * val );
                        break;
                    case '/':
                        stack.push( stack.pop() / val );
                        break;
                }
                val = 0;
                sign = s.charAt( i );
            }
        }

        int res = 0;
        while ( !stack.isEmpty() ) {
            res += stack.pop();
        }

        return res;
    }

    public static void main( String[] args ) {
        String s = "3+2*2";
        System.out.println( calculate( s ) );
    }

}
