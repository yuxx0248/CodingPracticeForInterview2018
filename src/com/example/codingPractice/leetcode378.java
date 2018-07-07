package com.example.codingPractice;

import java.util.PriorityQueue;

public class leetcode378 {

    public int kthSmallest( int[][] matrix, int k ) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[0].length; j++ ) {
                pq.add( matrix[i][j] );
            }
        }

        while ( k > 0 ) pq.poll();
        return pq.poll();
    }

}
