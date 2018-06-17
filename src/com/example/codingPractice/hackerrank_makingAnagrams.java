package com.example.codingPractice;

import java.util.Arrays;

public class hackerrank_makingAnagrams {


    public static void main( String[] args ) {
        String a = "abcabceee";

        String b = "zzzzzzzzz";

        int res = toBeDeleted( a, b );
        System.out.println( res );
    }

    public static int toBeDeleted( String a, String b ) {
        int[] arr = new int[ 26 ];
        Arrays.fill( arr, 0 );
        for ( char c : a.toCharArray() ) {
            arr[ c - 'a' ] += 1;
        }

        for ( char c : b.toCharArray() ) {
            arr[ c - 'a' ] -= 1;
        }

        int res = 0;
        for ( int i : arr ) {
            res += Math.abs( i );
        }

        return res;
    }
}
