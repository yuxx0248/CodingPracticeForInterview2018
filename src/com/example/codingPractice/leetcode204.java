package com.example.codingPractice;

/**
 * Count the number of prime numbers less than a non-negative number, n.
 * <p>
 * Input: 10
 * Output: 4
 * Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
 */

public class leetcode204 {

    public int countPrimes( int n ) {
        int count = 0;
        boolean[] prime = new boolean[ n ];

        for ( int i = 2; i < n; i++ ) {
            if ( !prime[ i ] ) count++;

            for ( int j = 2; i * j < n; j++ ) {
                prime[ i * j ] = true;
            }
        }
        return count;
    }

}
