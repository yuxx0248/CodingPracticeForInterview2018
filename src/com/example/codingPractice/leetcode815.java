package com.example.codingPractice;

import java.util.*;

public class leetcode815 {

    public static int numBusesToDestination( int[][] routes, int S, int T ) {
        if ( S == T ) return 0;

        Map<Integer, List<Integer>> map = new HashMap();
        for ( int i = 0; i < routes.length; i++ ) {
            for ( int r : routes[i] ) {
                if ( map.get( r ) == null ) map.put( r, new ArrayList<>() );
                map.get( r ).add( i );
            }
        }

        Queue<Integer> q = new LinkedList<>();
        Set<Integer> visited = new HashSet<>();
        q.add( S );
        int count = 0;

        while ( !q.isEmpty() ) {
            int size = q.size();
            count++;
            for ( int i = 0; i < size; i++ ) {
                int curr = q.poll();
                for ( int in : map.get( curr ) ) {
                    if ( visited.contains( in )) continue;
                    visited.add( in );
                    for ( int b : routes[in] ) {
                        if ( b == T ) return count;
                        q.add( b );
                    }
                }
            }
        }

        return -1;
    }

    public static void main( String[] args ) {
        int[][] routes = { { 1, 2, 7 }, { 3, 6, 7 } };
        System.out.println( numBusesToDestination( routes, 1, 6 ) );
    }

}
