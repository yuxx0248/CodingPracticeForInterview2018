package com.example.codingPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leetcode347 {

    public static List<Integer> topKFrequent( int[] nums, int k ) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> res = new ArrayList<>();

        for ( int i : nums ) {
            map.put( i, map.getOrDefault( i, 0 ) + 1 );
        }

        List<Integer>[] bucket = new List[ nums.length + 1 ];
        for ( int key : map.keySet() ) {
            int freq = map.get( key );
            if ( bucket[ freq ] == null ) {
                bucket[ freq ] = new ArrayList<>();
            }
            bucket[ freq ].add( key );
        }

        for ( int i = bucket.length -1 ; i >= 0 && res.size()<k; i-- ) {
            if ( bucket[ i ] != null ) {
                res.addAll( bucket[ i ] );
            }
        }

        return res;
    }

    public static void main( String[] args ) {
        int[] num = { 1 };
        List<Integer> list = topKFrequent( num, 1 );
        for ( int i : list ) {
            System.out.println( i );
        }

    }

}
