package com.example.codingPractice;

public class leetcode238 {
    public static void main( String[] args ) {
        int[] arr = { 1, 2, 3, 4, 5 };

        int[] res = productExceptSelf( arr );
        for ( int i : res ) {
            System.out.println( i );
        }
    }

    public static int[] productExceptSelf( int[] nums ) {
        int[] result = new int[ nums.length ];
        for ( int i = 0, tmp = 1; i < nums.length; i++ ) {
            result[ i ] = tmp;
            tmp *= nums[ i ];
        }
        for ( int i : result ) {
            //System.out.println(i);
        }
        for ( int i = nums.length - 1, tmp = 1; i >= 0; i-- ) {
            result[ i ] *= tmp;
            tmp *= nums[ i ];
        }
        return result;
    }
}
