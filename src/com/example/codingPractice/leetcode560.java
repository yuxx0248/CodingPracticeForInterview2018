package com.example.codingPractice;

import java.util.HashMap;

/**
 * Given an array of integers and an integer k, you need to find the total number of continuous subarrays whose sum equals to k.
 * <p>
 * Input:nums = [1,1,1], k = 2
 * Output: 2
 */


public class leetcode560 {

    public static void main( String[] args ) {
        int[] arr = { 1, -1, 1, -1 };
        System.out.println( subarraySum( arr, 0 ) );
    }


    public static int subarraySum( int[] nums, int k ) {
        int sum = 0;
        int count = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put( 0, 1 );

        for ( int i : nums ) {
            sum += i;
            if ( map.containsKey( sum - k ) ) count += map.get( sum - k );
            map.put( sum, map.getOrDefault( sum, 0 ) + 1 );

            System.out.println();
        }


        return count;
    }

}
