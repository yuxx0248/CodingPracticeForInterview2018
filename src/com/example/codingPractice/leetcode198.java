package com.example.codingPractice;

public class leetcode198 {

    public int rob( int[] nums ) {
        int curr = 0;
        int prev = 0;
        for ( int i : nums ) {
            int temp = curr;
            curr = Math.max( prev + i, curr );
            prev = temp;
        }
        return curr;
    }


}
