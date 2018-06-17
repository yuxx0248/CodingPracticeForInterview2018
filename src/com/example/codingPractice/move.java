package com.example.codingPractice;

public class move {

    public static void main( String[] args ) {
        int x = hammingWeight( 412 );
    }

    public static int hammingWeight( int n ) {
        int bits = 0;
        int mask = 1;
        for ( int i = 0; i < 32; i++ ) {
            int x = ( n & mask );
            if ( ( n & mask ) != 0 ) {
                bits++;
            }
            mask <<= 1;
        }
        return bits;
    }

}
