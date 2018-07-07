package com.example.codingPractice;

public class leetcode198 {

    public int rob( int[] nums ) {
        int prev = 0;
        int curr = 0;

        for ( int i : nums ) {
            int temp = curr;
            curr = Math.max( curr, prev + i );
            prev = temp;
        }

        return curr;
    }

}
