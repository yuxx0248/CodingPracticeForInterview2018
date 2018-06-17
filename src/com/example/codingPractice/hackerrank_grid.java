package com.example.codingPractice;

import java.util.Scanner;

public class hackerrank_grid {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int m = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        int[][] grid = new int[ n ][ m ];

        for ( int i = 0; i < n; i++ ) {
            String[] gridRowItems = scanner.nextLine().split( " " );
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            for ( int j = 0; j < m; j++ ) {
                int gridItem = Integer.parseInt( gridRowItems[ j ] );
                grid[ i ][ j ] = gridItem;
            }
        }

        System.out.println( largestCell( grid, grid.length, grid[ 0 ].length ) );

        scanner.close();
    }

    public static int largestCell( int[][] grid, int m, int n ) {
        int large = 0;
        for ( int i = 0; i < m; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                if ( grid[ i ][ j ] == 1 ) {
                    int tmp = blow( grid, i, j );
                    large = Math.max( large, tmp );
                }
            }
        }

        return large;
    }

    public static int blow( int[][] grid, int i, int j ) {
        int count = 0;
        if ( i < 0 || j < 0 || i >= grid.length || j >= grid[ 0 ].length || grid[ i ][ j ] == 0 ) return count;
        grid[ i ][ j ] = 0;
        count++;

        count += blow( grid, i - 1, j );
        count += blow( grid, i, j - 1 );
        count += blow( grid, i + 1, j );
        count += blow( grid, i, j + 1 );

        return count;
    }

}
