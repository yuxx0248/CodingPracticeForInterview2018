package com.example.codingPractice;


import java.util.PriorityQueue;
import java.util.Scanner;

public class removeMe {

    public static void main( String[] args ) {


        char repeat = 'N';   // Holds a character to confirm whether to repeat
        do {
            Scanner keyboard = new Scanner( System.in );
            System.out.print( "\nWould you like to repeat (y/n)? " );
            repeat = keyboard.nextLine().toUpperCase().charAt( 0 );
        } while ( repeat == 'Y' );
    }

    public int kthSmallest( int[][] matrix, int k ) {
        PriorityQueue<point> pq = new PriorityQueue<>();

        for ( int i = 0; i < matrix[0].length; i++ ) {
            pq.add( new point( 0, i, matrix[0][i] ) );
        }

        int c = 0;
        while ( c < k ) {
            point curr = pq.poll();
            for ( int i = 0; i < matrix.length; i++ ) {
                pq.add( new point( i, curr.y, matrix[i][curr.y] ) );
            }
        }

        return pq.poll().val;
    }

    class point implements Comparable<point> {
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

}
