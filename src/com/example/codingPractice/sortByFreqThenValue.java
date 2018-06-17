package com.example.codingPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class sortByFreqThenValue {
    public static void main( String[] args ) {

        int[] arr = { 9, 8, 7, 6, 5, 4, 3, 2, 1 };
        //sortByFreq(arr);
        String tst = "eeeee";
        String res = sortByFreqString( tst );
        for ( char i : res.toCharArray() ) {
            System.out.println( i );
        }
    }

    public static void sortByFreq( int[] arr ) {

        Map<Integer, Integer> map = new HashMap<>();
        for ( int i : arr ) {
            if ( !map.containsKey( i ) ) map.put( i, 1 );
            else map.put( i, map.get( i ) + 1 );
        }

        List[] bucket = new List[ arr.length + 1 ];
        for ( int key : map.keySet() ) {
            int freq = map.get( key );
            if ( bucket[ freq ] == null ) bucket[ freq ] = new ArrayList();
            bucket[ freq ].add( key );
        }

        int res = 0;

        for ( int i = 0; i < bucket.length; i++ ) {
            if ( bucket[ i ] != null ) {
                for ( Object k : bucket[ i ] ) {
                    for ( int m = 0; m < map.get( k ); m++ ) {
                        arr[ res++ ] = Integer.parseInt( k.toString() );
                    }
                }
            }
        }
    }

    public static String sortByFreqString( String str ) {
        Map<Character, Integer> map = new HashMap<>();

        for ( char c : str.toCharArray() ) {
            if ( !map.containsKey( c ) ) map.put( c, 1 );
            else map.put( c, map.get( c ) + 1 );
        }

        List[] bucket = new List[ str.length() + 1 ];
        for ( char c : map.keySet() ) {
            int freq = map.get( c );
            if ( bucket[ freq ] == null ) bucket[ freq ] = new ArrayList<>();
            bucket[ freq ].add( c );
        }

        StringBuilder sb = new StringBuilder();
        for ( int i = bucket.length - 1; i >= 0; i-- ) {
            if ( bucket[ i ] != null ) {
                for ( Object c : bucket[ i ] ) {
                    for ( int m = 0; m < map.get( c ); m++ ) {
                        sb.append( c );
                    }
                }

            }
        }

        return sb.toString();
    }

}
