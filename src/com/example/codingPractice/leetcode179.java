package com.example.codingPractice;

import java.util.Arrays;
import java.util.Comparator;

public class leetcode179 {

    public String largestNumber( int[] nums ) {
        String[] arr = new String[nums.length];
        for ( int i = 0; i < nums.length; i++ ) {
            arr[i] = String.valueOf( nums[i] );
        }

        Arrays.sort( arr, new largeCompare() );

        if ( arr[0].equals( "0" ) ) return "0";

        StringBuilder sb = new StringBuilder();
        for ( String s : arr ) {
            sb.append( s );
        }

        return sb.toString();
    }

    public class largeCompare implements Comparator<String> {

        @Override
        public int compare( String o1, String o2 ) {
            String s1 = o1 + o2;
            String s2 = o2 + o1;
            return s2.compareTo( s1 );
        }
    }
}
