package com.example.codingPractice;

/**
 * Given an array of integers nums sorted in ascending order, find the starting and ending position of a given target value.
 * Your algorithm's runtime complexity must be in the order of O(log n).
 * If the target is not found in the array, return [-1, -1].
 * <p>
 * Input: nums = [5,7,7,8,8,10], target = 8
 * Output: [3,4]
 */
public class leetcode34 {

    public int[] searchRange( int[] nums, int target ) {
        int[] res = { -1, -1 };
        int left = helper( nums, target, true );
        if ( left > nums.length - 1 || nums[ left ] != target ) return res;
        res[ 0 ] = left;
        res[ 1 ] = helper( nums, target, false ) - 1;
        return res;
    }

    public int helper( int[] nums, int target, boolean left ) {
        int start = 0;
        int end = nums.length;

        while ( start < end ) {
            int mid = start + ( end - start ) / 2;
            if ( nums[ mid ] > target || ( left && nums[ mid ] == target ) ) end = mid;
            else start = mid + 1;
        }

        return start;
    }

}
