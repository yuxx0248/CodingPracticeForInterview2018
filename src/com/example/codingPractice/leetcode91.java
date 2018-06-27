package com.example.codingPractice;

public class leetcode91 {

    public static int numDecodings( String s ) {
        if ( s.length() == 0 )
            return 0;
        char[] chs = s.toCharArray();
        int[] dp = new int[ chs.length ];
        dp[ 0 ] = chs[ 0 ] > '0' ? 1 : 0;
        for ( int i = 1; i < dp.length; i++ ) {
            if ( chs[ i ] > '0' )
                dp[ i ] += dp[ i - 1 ];
            if ( chs[ i - 1 ] > '0' && ( ( chs[ i - 1 ] - '0' ) * 10 + chs[ i ] - '0' <= 26 ) )
                // if i-1..i are the first two digits, then this is actually the new base case: assign 1 rather than 0
                dp[ i ] += i - 2 >= 0 ? dp[ i - 2 ] : 1;
        }
        return dp[ chs.length - 1 ];
    }


    public static void main(String[] args){
        System.out.println( numDecodings( "101" ) );
    }
}
