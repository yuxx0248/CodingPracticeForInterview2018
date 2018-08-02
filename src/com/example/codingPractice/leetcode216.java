package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode216 {

    public List<List<Integer>> combinationSum3( int k, int n ) {
        List<List<Integer>> res = new ArrayList<>();
        backTrack( res, new ArrayList<>(), k, n, 1 );
        return res;
    }

    public void backTrack( List<List<Integer>> res, List<Integer> list, int k, int n, int start ) {
        if ( list.size() == k && n == 0 ) {
            res.add( new ArrayList<>( list ) );
            return;
        } else {
            for ( int i = start; i < 10; i++ ) {
                list.add( i );
                backTrack( res, list, k, n - i, i + 1 );
                list.remove( list.size() - 1 );
            }
        }
    }

}
