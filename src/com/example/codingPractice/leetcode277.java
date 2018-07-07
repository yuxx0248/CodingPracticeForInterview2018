package com.example.codingPractice;

public class leetcode277 {

    public int findCelebrity( int n ) {
        int target = 0;

        for ( int i = 1; i < n; i++ ) {
            if ( !knows( i, target ) ) target = i;
        }

        for ( int i = 0; i < n; i++ ) {
            if ( i == target) continue;
            if ( knows( target, i ) || !knows( i, target ) ) return -1;
        }

        return target;
    }

    boolean knows( int a, int b ) {
        return true;
    }

}
