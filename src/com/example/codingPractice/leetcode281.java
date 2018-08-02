package com.example.codingPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode281 {
    Queue<Integer> q;

    public leetcode281( List<Integer> v1, List<Integer> v2 ) {
        q = new LinkedList<>();

        for ( int i = 0; i < Math.max( v1.size(), v2.size() ); i++ ) {
            if ( i < v1.size() ) q.add( v1.get( i ) );
            if ( i < v2.size() ) q.add( v2.get( i ) );
        }
    }

    public int next() {
        return q.poll();
    }

    public boolean hasNext() {
        return !q.isEmpty();
    }

}
