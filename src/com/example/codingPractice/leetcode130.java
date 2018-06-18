package com.example.codingPractice;

import java.awt.*;
import java.util.LinkedList;
import java.util.Queue;

public class leetcode130 {

    public void solveBFS( char[][] board ) {
        if ( board.length < 1 ) return;
        Queue<Point> q = new LinkedList<>();
        int m = board.length;
        int n = board[ 0 ].length;

        for ( int i = 0; i < m; i++ ) {
            if ( board[ i ][ 0 ] == 'O' ) {
                board[ i ][ 0 ] = '+';
                q.add( new Point( i, 0 ) );
            }
            if ( board[ i ][ n - 1 ] == 'O' ) {
                board[ i ][ n - 1 ] = '+';
                q.add( new Point( i, n - 1 ) );
            }
        }

        for ( int j = 0; j < n; j++ ) {
            if ( board[ 0 ][ j ] == 'O' ) {
                board[ 0 ][ j ] = '+';
                q.add( new Point( 0, j ) );
            }
            if ( board[ m - 1 ][ j ] == 'O' ) {
                board[ m - 1 ][ j ] = '+';
                q.add( new Point( m - 1, j ) );
            }
        }

        while ( !q.isEmpty() ) {
            Point curr = q.poll();
            int i = curr.x;
            int j = curr.y;

            if ( i + 1 < m && board[ i + 1 ][ j ] == 'O' ) {
                q.add( new Point( i + 1, j ) );
                board[ i + 1 ][ j ] = '+';
            }
            if ( i - 1 >= 0 && board[ i - 1 ][ j ] == 'O' ) {
                q.add( new Point( i - 1, j ) );
                board[ i - 1 ][ j ] = '+';
            }
            if ( j + 1 < n && board[ i ][ j + 1 ] == 'O' ) {
                q.add( new Point( i, j + 1 ) );
                board[ i ][ j + 1 ] = '+';
            }
            if ( j - 1 >= 0 && board[ i ][ j - 1 ] == 'O' ) {
                q.add( new Point( i, j - 1 ) );
                board[ i ][ j - 1 ] = '+';
            }

        }

        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( board[ i ][ j ] == '+' ) board[ i ][ j ] = 'O';
                else board[ i ][ j ] = 'X';
            }
        }

    }

}
