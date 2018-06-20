package com.example.codingPractice;

import java.util.Stack;

public class leetcode402 {

    public static String removeKdigits( String num, int k ) {
        Stack<Character> stack = new Stack<>();
        int i = 0;
        while ( i < num.length() ) {
            while ( k > 0 && !stack.isEmpty() && stack.peek() > num.charAt( i ) ) {
                stack.pop();
                k--;
            }
            stack.push( num.charAt( i++ ) );
        }

        while ( k-- > 0 && !stack.isEmpty() ) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        for ( Character c : stack ) {
            sb.append( c );
        }

        while ( sb.length() > 1 && sb.charAt( 0 ) == '0' ) sb.deleteCharAt( 0 );

        return sb.length() < 1 ? "0" : sb.toString();
    }

    public static void main (String[] args){
        System.out.println( removeKdigits( "112", 1 ) );
    }

}
