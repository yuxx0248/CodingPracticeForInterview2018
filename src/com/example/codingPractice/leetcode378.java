package com.example.codingPractice;

import java.util.PriorityQueue;

public class leetcode378 {

    public static int kthSmallest( int[][] matrix, int k ) {
        PriorityQueue<point> pq = new PriorityQueue<>();

        for ( int j = 0; j < matrix[0].length; j++ ) {
            pq.add( new point( 0, j, matrix[0][j] ) );
        }

        for ( int i = 0; i < k - 1; i++ ) {
            point tmp = pq.poll();
            if ( tmp.x >= matrix.length - 1 ) continue;
            pq.add( new point( tmp.x + 1, tmp.y, matrix[tmp.x + 1][tmp.y] ) );

        }

        return pq.poll().val;
    }

    static class point implements Comparable<point> {
        int x;
        int y;
        int val;

        public point( int x, int y, int val ) {
            this.x = x;
            this.y = y;
            this.val = val;
        }


        @Override
        public int compareTo( point o ) {
            return this.val - o.val;
        }
    }

    public static void main( String[] args ) {
        int[][] matrix = { { 1, 3, 5 }, { 9,11,13 }, { 10,12,15 } };
        int[][] matrix2 = { { 1, 3, 5 }, { 6,11,13}, { 18,20,22 } };

        System.out.println( kthSmallest( matrix, 8 ) );
    }

}
