package com.example.codingPractice;

public class leetcode340 {

    public int lengthOfLongestSubstringKDistinct( String s, int k ) {
        int res = Integer.MIN_VALUE;
        int count = 0;
        int[] arr = new int[ 255 ];
        int slow = 0;

        for ( int i = 0; i < s.length(); i++ ) {
            if ( arr[ s.charAt( i ) ]++ == 0 ) count++;
            if ( count > k ) {
                while ( --arr[ s.charAt(slow++) ] > 0 ) ;
                count--;
            }
            res = Math.max( res, i - slow + 1 );
        }
        return res == Integer.MIN_VALUE ? 0 : res;

    }


}
