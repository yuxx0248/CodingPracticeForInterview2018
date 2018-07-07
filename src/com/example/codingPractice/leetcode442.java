package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode442 {

    public List<Integer> findDuplicates( int[] nums ) {
        List<Integer> res = new ArrayList<>();

        for ( int i = 0; i < nums.length; i++ ) {
            int val = Math.abs( nums[ i ] ) - 1;
            if ( nums[ val ] < 0 ) res.add( Math.abs(nums[i]) );
            else {
                nums[ val ] = -nums[ val ];
            }
        }
        return res;
    }

    }
