package com.example.codingPractice;

public class leetcode695 {

    public static int maxAreaOfIsland( int[][] grid ) {
        int area = 0;
        for ( int i = 0; i < grid.length; i++ ) {
            for ( int j = 0; j < grid[ 0 ].length; j++ ) {
                if ( grid[ i ][ j ] == 1 )
                    area = Math.max( area, helper( i, j, grid ) );
            }
        }
        return area;
    }

    public static int helper( int i, int j, int[][] grid ) {
        if ( i >= grid.length || i < 0 || j < 0 || j >= grid[ 0 ].length || grid[ i ][ j ] == 0 ) return 0;
        grid[ i ][ j ] = 0;
        return ( 1 + helper( i + 1, j, grid )
                + helper( i - 1, j, grid )
                + helper( i, j + 1, grid )
                + helper( i, j - 1, grid ) );

    }

    public static void main( String[] args ) {
        int[][] grid = {{1,1,0,0,0}, {1,1,0,0,0}, {0,0,0,1,1},{0,0,0,1,1}};
        System.out.print( maxAreaOfIsland( grid ) );
    }


}
