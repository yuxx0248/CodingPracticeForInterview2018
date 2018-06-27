package com.example.codingPractice;

public class leetcode329 {

    public static int longestIncreasingPath( int[][] matrix ) {
        if ( matrix.length < 1 ) return 0;
        int[][] memory = new int[ matrix.length ][ matrix[ 0 ].length ];
        int res = 0;
        for ( int i = 0; i < matrix.length; i++ ) {
            for ( int j = 0; j < matrix[ 0 ].length; j++ ) {
                res = Math.max( res, dfs( matrix, i, j, Integer.MIN_VALUE, memory ) );
            }
        }
        return res;
    }

    public static int dfs( int[][] matrix, int i, int j, int prev, int[][] memory ) {
        if ( i < 0 || j < 0 || i >= matrix.length || j >= matrix[ 0 ].length || matrix[ i ][ j ] <= prev ) return 0;
        if ( memory[ i ][ j ] != 0 ) return memory[ i ][ j ];
        memory[ i ][ j ] = Math.max( memory[ i ][ j ], dfs( matrix, i - 1, j, matrix[ i ][ j ], memory ) );
        memory[ i ][ j ] = Math.max( memory[ i ][ j ], dfs( matrix, i, j - 1, matrix[ i ][ j ], memory ) );
        memory[ i ][ j ] = Math.max( memory[ i ][ j ], dfs( matrix, i + 1, j, matrix[ i ][ j ], memory ) );
        memory[ i ][ j ] = Math.max( memory[ i ][ j ], dfs( matrix, i, j + 1, matrix[ i ][ j ], memory ) );

        return ++memory[ i ][ j ];
    }

    public static void main( String[] args ) {
        int[][] matrix = { { 9, 9, 4 }, { 6, 6, 8 }, { 2, 1, 1 } };
        longestIncreasingPath( matrix );
    }

}
