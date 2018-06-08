package com.example.codingPractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class leetcode491 {

    public static void main( String[] args ) {
        int[] arr = { 4, 6, 7, 7 };
        findSubsequences( arr );
    }

    public static List<List<Integer>> findSubsequences( int[] nums ) {
        HashSet<List<Integer>> res = new HashSet<>();
        helper( res, nums, new ArrayList<>(), 0 );
        return new ArrayList<>( res );
    }

    public static void helper( HashSet<List<Integer>> res, int[] nums, List<Integer> list, int level ) {
        if ( !res.contains( list ) && list.size() > 1 ) res.add( new ArrayList<>( list ) );

        for ( int i = level; i < nums.length; i++ ) {
            if ( list.size() == 0 || list.get( list.size() - 1 ) <= nums[ i ] ) {
                list.add( nums[ i ] );
                helper( res, nums, list, i + 1 );
                list.remove( list.size() - 1 );
            }
        }
    }

}
