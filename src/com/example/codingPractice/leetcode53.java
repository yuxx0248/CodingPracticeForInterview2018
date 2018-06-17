package com.example.codingPractice;

/**
 * Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
 * <p>
 * Input: [-2,1,-3,4,-1,2,1,-5,4],
 * Output: 6
 * Explanation: [4,-1,2,1] has the largest sum = 6.
 */
public class leetcode53 {

    public static void main( String[] args ) {
        int[] arr = { -2, -1, -3, -4, -1, -2, -1, -5, -4 };
        System.out.println( maxSubArray( arr ) );
    }

    public static int maxSubArray( int[] nums ) {
        int res = Integer.MIN_VALUE;
        int sum = 0;
        for ( int i : nums ) {
            sum = Math.max( i, sum + i );
            res = Math.max( sum, res );
        }
        return res;
    }

}
