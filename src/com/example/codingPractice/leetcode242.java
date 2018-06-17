package com.example.codingPractice;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/valid-anagram/description/
 */
public class leetcode242 {
    public static void main( String[] args ) {
        String str = "natural";
        char[] arr = str.toCharArray();
        Arrays.sort( arr );
        for ( char i : arr ) {
            System.out.print( i );
        }
    }
}