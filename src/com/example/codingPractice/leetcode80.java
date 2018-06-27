package com.example.codingPractice;

public class leetcode80 {

    public int removeDuplicates( int[] nums ) {
        int slow = 1;
        int count = 1;

        for ( int fast = 1; fast < nums.length; fast++ ) {
            if ( nums[ fast ] != nums[ fast - 1 ] ) {
                count = 1;
                nums[ slow++ ] = nums[ fast ];
            } else if ( count <= 2 ) {
                nums[ slow++ ] = nums[ fast ];
                count++;
            }
        }
        return slow;
    }

}
