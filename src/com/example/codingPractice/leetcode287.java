package com.example.codingPractice;

public class leetcode287 {

    public int findDuplicateTwoPointer(int[] nums) {

        int slow = nums[0];
        int fast = nums[nums[0]];

        while ( slow != fast){
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        fast = 0;
        while (slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return fast;
    }

    public int findDuplicate( int[] nums ) {
        for ( int i = 0; i < nums.length; i++ ) {
            int val = Math.abs( nums[ i ] );
            if ( nums[ val ] < 0 ) return Math.abs( nums[ i ] );
            nums[ val ] = -nums[ val ];
        }
        return -1;
    }

}
