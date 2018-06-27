package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode118 {

    public List<List<Integer>> generate( int numRows ) {
        List<List<Integer>> res = new ArrayList<>();

        res.add( new ArrayList<>() );
        res.get( 0 ).add( 1 );

        for ( int i = 1; i < numRows; i++ ) {
            List<Integer> list = new ArrayList<>();
            List<Integer> prev = res.get( i - 1 );

            list.add( 1 );
            for ( int j = 1; j < i; j++ ) {
                list.add( j, prev.get( j - 1 ) + prev.get( j ) );
            }
            list.add( 1 );
            res.add( new ArrayList<>( list ) );
        }
        return res;
    }

}
