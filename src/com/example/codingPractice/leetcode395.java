package com.example.codingPractice;

public class leetcode395 {

    public static int longestSubstring( String s, int k ) {
        return helper( s.toCharArray(), 0, s.length(), k );
    }

    public static int helper( char[] str, int start, int end, int k ) {
        if ( end - start < k ) return 0;
        int[] freq = new int[26];

        for ( int i = start; i < end; i++ ) {
            freq[str[i] - 'a']++;
        }

        for ( int i = 0; i < 26; i++ ) {
            if ( freq[i] > 0 && freq[i] < k ) {
                for ( int j = start; j < end; j++ ) {
                    if ( str[j] == i + 'a' ) {
                        int left = helper( str, start, j, k );
                        int right = helper( str, j + 1, end, k );
                        return Math.max( left, right );
                    }
                }
            }
        }

        return end - start;
    }

    public static void main( String[] args ) {
        System.out.println( longestSubstring( "aaabbb", 2 ) );
    }
}
