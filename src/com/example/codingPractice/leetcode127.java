package com.example.codingPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode127 {

    public static int ladderLength( String beginWord, String endWord, List<String> wordList ) {
        if(!wordList.contains(endWord)) {
            return 0;
        }        Queue<String> q = new LinkedList<>();
        q.add( beginWord );
        int count = 0;

        while ( !q.isEmpty() ) {
            int size = q.size();
            for ( int i = 0; i < size; i++ ) {
                String str = q.poll();
                if ( str.equals( endWord ) ) return count + 1;

                for ( int j = 0; j < str.length(); j++ ) {
                    char[] curr = str.toCharArray();
                    for ( char c = 'a'; c <= 'z'; c++ ) {
                        curr[ j ] = c;
                        String check = new String( curr );
                        if ( wordList.contains( check ) ) {
                            q.add( check );
                            wordList.remove( check );
                        }
                    }
                }
            }
            count++;
        }
        return 0;
    }

    public static void main( String[] args ) {
        String b = "hit";
        String e = "cog";
        List<String> words = new ArrayList<>();
        words.add( "hot" );
        words.add( "dot" );
        words.add( "dog" );
        words.add( "lot" );
        words.add( "log" );
        words.add( "cog" );

        System.out.println( ladderLength( b, e, words ) );

    }



}
