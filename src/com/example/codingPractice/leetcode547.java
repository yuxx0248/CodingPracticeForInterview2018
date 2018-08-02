package com.example.codingPractice;

import java.util.Arrays;

public class leetcode547 {

    public static int findCircleNumUnion( int[][] M ) {
        int[] root = new int[M.length];
        Arrays.fill( root, -1 );

        for ( int i = 0; i < M.length; i++ ) {
            for ( int j = 0; j < M.length; j++ ) {
                if ( i != j && M[i][j] == 1 ) {
                    union( root, i, j );
                }
            }
        }

        int count = 0;
        for ( int i : root ) {
            if ( i == -1 ) count++;
        }

        return count;
    }

    public static int find( int[] root, int k ) {
        while ( root[k] != -1 ) k = root[k];
        return k;
    }

    public static void union( int[] root, int i, int j ) {
        int A = find( root, i );
        int B = find( root, j );
        if ( A != B )
            root[A] = B;
    }

    public static int findCircleNumDFS( int[][] M ) {
        boolean[] visited = new boolean[M.length];
        int count = 0;
        for ( int i = 0; i < M.length; i++ ) {
            if ( !visited[i] ) {
                visited[i] = true;
                DFS( M, visited, i );
                count++;
            }
        }
        return count;
    }

    public static void DFS( int[][] M, boolean[] visited, int i ) {
        for ( int j = 0; j < M.length; j++ ) {
            if ( M[i][j] == 1 && !visited[j] ) {
                visited[j] = true;
                DFS( M, visited, j );
            }
        }
    }

    public static void main( String[] args ) {
        int[][] matrix = { { 1, 1, 0 }, { 1, 1, 0 }, { 0, 0, 1 } };
        System.out.println( findCircleNumDFS( matrix ) );
    }
}
