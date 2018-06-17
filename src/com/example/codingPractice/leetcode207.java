package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode207 {

    public boolean canFinishBFS( int numCourses, int[][] prerequisites ) {
        int[] dependency = new int[ numCourses ];
        for ( int[] edge : prerequisites ) {
            dependency[ edge[ 0 ] ]++;
        }

        Queue<Integer> readyQueue = new LinkedList<>();
        for ( int i = 0; i < dependency.length; i++ ) {
            if ( dependency[ i ] == 0 ) readyQueue.add( i );
        }

        int canFinish = 0;
        while ( !readyQueue.isEmpty() ) {
            int curr = readyQueue.poll();
            canFinish++;

            for ( int[] edge : prerequisites ) {
                if ( edge[ 1 ] == curr ) {
                    dependency[ edge[ 0 ] ]--;
                    if ( dependency[ edge[ 0 ] ] == 0 ) readyQueue.add( edge[ 0 ] );
                }
            }
        }

        return canFinish == numCourses;
    }

}
