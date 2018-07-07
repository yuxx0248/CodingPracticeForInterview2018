package com.example.codingPractice;

public class leetcode41 {

    public int firstMissingPositive( int[] nums ) {
        int i = 0;
        while ( i < nums.length ) {
            if ( nums[ i ] > nums.length - 1 || nums[ i ] < 0 || nums[ i ] - 1 == i ) i++;
            else {
                swap( nums, i, nums[ i ] - 1 );
            }
        }
        i = 0;
        while ( i<nums.length && i == nums[ i ] - 1 ) {
            i++;
        }
        return i + 1;
    }

    public void swap( int[] nums, int i, int j ) {
        int tmp = nums[ j ];
        nums[ j ] = nums[ i ];
        nums[ i ] = tmp;
    }
}
