package com.example.codingPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class hackerrank_icecream {

    private static final Scanner scanner = new Scanner( System.in );

    // Complete the twoSum function below.
    static void twoSum( int[] arr, int money ) {
        Map<Integer, Integer> map = new HashMap<>();

        for ( int i = 0; i < arr.length; i++ ) {
            if ( map.containsKey( money - arr[ i ] ) ) {
                System.out.print( map.get( money - arr[ i ] ) + 1 + " " + ( i + 1 ) );
            }

            map.put( arr[ i ], i );
        }

    }

    public static void main( String[] args ) {
        int t = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for ( int tItr = 0; tItr < t; tItr++ ) {
            int money = scanner.nextInt();
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            int n = scanner.nextInt();
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            int[] arr = new int[ n ];

            String[] arrItems = scanner.nextLine().split( " " );
            scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

            for ( int i = 0; i < n; i++ ) {
                int arrItem = Integer.parseInt( arrItems[ i ] );
                arr[ i ] = arrItem;
            }

            twoSum( arr, money );
        }

        scanner.close();
    }
}

