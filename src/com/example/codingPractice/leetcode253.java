package com.example.codingPractice;


import java.util.Arrays;

public class leetcode253 {
    public int minMeetingRooms( Interval[] intervals ) {

        int[] start = new int[ intervals.length ];
        int[] end = new int[ intervals.length ];
        int count = 0;

        int index = 0;
        for ( Interval it : intervals ) {
            start[ index ] = it.start;
            end[ index++ ] = it.end;
        }

        Arrays.sort( start );
        Arrays.sort( end );

        index = 0;
        for ( int i : start ) {
            if ( i < end[ index ] ) count++;
            else index++;
        }

        return count;

    }


    public class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval( int s, int e ) {
            start = s;
            end = e;
        }
    }

}
