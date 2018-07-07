package com.example.codingPractice;

public class leetcode289 {

    public void gameOfLife( int[][] board ) {
        if ( board.length < 1 ) return;
        int[][] dir = { { 1, -1 }, { 1, 0 }, { 1, 1 }, { 0, -1 }, { 0, 1 }, { -1, -1 }, { -1, 0 }, { -1, 1 } };

        for ( int i = 0; i < board.length; i++ ) {
            for ( int j = 0; j < board[ 0 ].length; j++ ) {
                int sum = 0;
                for ( int[] d : dir ) {
                    if ( i + d[ 0 ] < board.length && i + d[ 0 ] >= 0 && j + d[ 1 ] < board[ 0 ].length && j + d[ 1 ] >= 0 ) {
                        if ( board[ i + d[ 0 ] ][ j + d[ 1 ] ] == 1 || board[ i + d[ 0 ] ][ j + d[ 1 ] ] == 2 ) sum++;
                    }
                }
                if ( board[ i ][ j ] == 1 && ( sum < 2 || sum > 3 ) )
                    board[ i ][ j ] = 2;
                if ( board[ i ][ j ] == 0 && sum == 3 )
                    board[ i ][ j ] = 3;
            }
        }

        for ( int i = 0; i < board.length; i++ ) {
            for ( int j = 0; j < board[ 0 ].length; j++ ) {
                board[ i ][ j ] %= 2;
            }
        }
    }

}
