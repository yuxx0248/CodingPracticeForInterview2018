package com.example.codingPractice;

public class leetcode680 {

    public boolean validPalindrome( String s ) {
        for ( int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j-- ) {
            if ( s.charAt( i ) != s.charAt( j ) ) {
                return isValud( s, i + 1, j ) || isValud( s, i, j - 1 );
            }
        }

        return true;
    }

    public boolean isValud( String s, int i, int j ) {
        while ( i < j ) {
            if ( s.charAt( i++ ) != s.charAt( j-- ) ) return false;
        }
        return true;
    }

}
