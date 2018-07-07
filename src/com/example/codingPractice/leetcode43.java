package com.example.codingPractice;

public class leetcode43 {

    public static String multiply( String num1, String num2 ) {
        int[] res = new int[num1.length() + num2.length()];
        for ( int i = num1.length() - 1; i >= 0; i-- ) {
            for ( int j = num2.length() - 1; j >= 0; j-- ) {
                int prod = ( num1.charAt( i ) - '0' ) * ( num2.charAt( j ) - '0' ) + res[i + j + 1];
                res[i + j + 1] = prod % 10;
                res[i + j] += prod / 10;
            }
        }
        int i = 0;
        while ( i < res.length && res[i] == 0 ) i++;
        if ( i == res.length ) return "0";
        StringBuilder sb = new StringBuilder();
        while ( i < res.length ) sb.append( res[i++] );
        return sb.toString();
    }


    public static void main( String[] args ) {
        System.out.println( multiply( "123", "456" ) );
    }

}
