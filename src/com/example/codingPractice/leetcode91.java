package com.example.codingPractice;

public class leetcode91 {

    public int numDecodings( String s ) {
        if ( s.length() < 1 ) return 0;

        int[] dp = new int[ s.length() ];
        dp[ 0 ] = s.charAt( 0 ) == '0' ? 0 : 1;

        for ( int i = 1; i < s.length(); i++ ) {
            if (  s.charAt( i ) > '0' )
                dp[ i ] = dp[ i - 1 ];
            if (  ( s.charAt( i - 1 ) > 0 && s.charAt( i - 1 ) < 3 ) &&
                    ( s.charAt( i ) > 0 && s.charAt( i ) < 7 ) ) {
                dp[i] += i - 2 >= 0 ? dp[i - 2] : 1;
            }
        }
        return dp[ s.length() - 1 ];
    }

}
