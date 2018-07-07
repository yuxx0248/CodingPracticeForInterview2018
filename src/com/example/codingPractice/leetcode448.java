package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode448 {

    public List<Integer> findDisappearedNumbers( int[] nums ) {
        List<Integer> res = new ArrayList<>();
        if ( nums.length < 1 ) return res;

        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[ Math.abs( nums[ i ] ) - 1 ] > 0 ) {
                nums[ Math.abs( nums[ i ] ) - 1 ] = -nums[ Math.abs( nums[ i ] ) - 1 ];
            }
        }

        for ( int i = 0; i < nums.length; i++ ) {
            if ( nums[ i ] > 0 ) res.add( i + 1 );
        }

        return res;
    }

}
