package com.example.codingPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode239 {

    public static int[] maxSlidingWindowPQ( int[] nums, int k ) {
        if ( nums.length<1) return new int[0];
        int[] res = new int[nums.length-k+1];
        PriorityQueue<Integer> pq = new PriorityQueue<>( Collections.reverseOrder() );

        int j = 0;
        for ( int i =0;i<nums.length;i++){
            pq.offer( nums[i] );
            if (i<k-1) continue;
            res[j++] = pq.peek();
            pq.remove( nums[i-k+1] );
        }

        return res;
    }

    public static int[] maxSlidingWindowLinear( int[] nums, int k ) {
        if ( nums.length<1) return new int[0];
        int[] maxLeft = new int[nums.length];
        int[] maxRight = new int[nums.length];
        int[] res = new int[nums.length - k + 1];

        maxLeft[0] = nums[0];
        maxRight[nums.length - 1] = nums[nums.length - 1];

        for ( int i = 1; i < nums.length; i++ ) {
            maxLeft[i] = ( i % k == 0 ) ? nums[i] : Math.max( maxLeft[i - 1], nums[i] );
            int j = nums.length - 1 - i;
            maxRight[j] = ( j % k == 0 ) ? nums[j] : Math.max( maxRight[j + 1], nums[j] );
        }

        int c = 0;
        for ( int i = 0; i + k <= nums.length; i++ ) {
            res[c++] = Math.max( maxLeft[i + k - 1], maxRight[i] );
        }
        return res;

    }

    public static void main( String[] args ) {
        int[] arr = { 9,10,9,-7,-4,-8,2,-6};
        for ( int i: maxSlidingWindowPQ( arr, 5 )){
            System.out.println( i );
        }
    }

}
