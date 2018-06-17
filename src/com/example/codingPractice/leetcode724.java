package com.example.codingPractice;

public class leetcode724 {

    public int pivotIndex( int[] nums ) {
        if ( nums.length < 1 ) return -1;
        int totalSum = 0;
        for ( int i : nums ) {
            totalSum += i;
        }

        int sum = 0;
        for ( int i = 0; i < nums.length; i++ ) {
            if ( sum == totalSum - sum - nums[ i ] ) {
                return i;
            }
            sum += nums[ i ];
        }

        return -1;
    }

}
