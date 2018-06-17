package com.example.codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode78 {

    public static void main( String[] args ) {
        int[] nums = { 1, 2, 3 };
        List<List<Integer>> res = subsets( nums );

        for ( List<Integer> list : res ) {
            for ( int i : list ) {
                System.out.println( i );
            }
        }
    }

    public static List<List<Integer>> subsets( int[] nums ) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort( nums );
        helper( res, nums, new ArrayList<>(), 0 );
        return res;
    }

    public static void helper( List<List<Integer>> res, int[] nums, List<Integer> list, int start ) {
        res.add( new ArrayList<>( list ) );

        for ( int i = start; i < nums.length; i++ ) {
            list.add( nums[ i ] );
            helper( res, nums, list, start + 1 );
            list.remove( list.size() - 1 );
        }

    }

}
