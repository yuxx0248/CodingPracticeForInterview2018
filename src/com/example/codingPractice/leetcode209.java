package com.example.codingPractice;

public class leetcode209 {

    public int minSubArrayLen( int s, int[] nums ) {
        if ( nums.length < 1 ) return 0;
        int slow = 0;
        int fast = 0;
        int sum = 0;
        int min = Integer.MAX_VALUE;

        while ( fast < nums.length ) {
            sum += nums[ fast++ ];
            while ( sum >= s ) {
                min = Math.min( min, fast - slow );
                sum -= nums[ slow++ ];
            }

        }

        return min == Integer.MAX_VALUE ? 0 : min;
    }


}
