package com.example.codingPractice;

import java.util.concurrent.TimeUnit;

public class mergeTwoSortedArray {
    public static void main( String[] args ) throws InterruptedException {
        int[] A = { 1, 2, 3, 4, 0, 0, 0, 0 };
        int[] B = { 5, 6, 7, 9 };
        merge( A, 4, B, 4 );
    }

    public static void merge( int A[], int m, int B[], int n ) throws InterruptedException {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while ( i >= 0 && j >= 0 ) {
            System.out.println( A[ i ] > B[ j ] ? A[ i ] : B[ j ] );
            TimeUnit.SECONDS.sleep( 1 );
            A[ k-- ] = A[ i ] > B[ j ] ? A[ i-- ] : B[ j-- ];
        }

        while ( j >= 0 )
            A[ k-- ] = B[ j-- ];
    }
}
