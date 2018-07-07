package com.example.codingPractice;

import java.util.*;

public class leetcode269 {

    public static String alienOrder( String[] words ) {
        int[] dependency = new int[26];
        List<Set<Integer>> setList = new ArrayList<>();

        Arrays.fill( dependency, -1 );

        for ( int i = 0; i < 26; i++ ) {
            setList.add( new HashSet<Integer>() );
        }

        for ( int i = 0; i < words.length; i++ ) {

            for ( char c : words[i].toCharArray() ) {
                if ( dependency[c - 'a'] < 0 ) dependency[c - 'a'] = 0;
            }

            if ( i > 0 ) {
                String w1 = words[i - 1];
                String w2 = words[i];

                int len = Math.min( w1.length(), w2.length() );

                for ( int j = 0; j < len; j++ ) {
                    char c1 = w1.charAt( j );
                    char c2 = w2.charAt( j );
                    if ( c1 != c2 ) {
                        if ( !setList.get( c1 - 'a' ).contains( c2 - 'a' ) ) {
                            setList.get( c1 - 'a' ).add( c2 - 'a' );
                            dependency[c2 - 'a']++;
                        }
                        break;
                    }
                }
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for ( int i = 0; i < dependency.length; i++ ) {
            if ( dependency[i] == 0 ) q.add( i );
        }

        StringBuilder sb = new StringBuilder();
        while ( !q.isEmpty() ) {
            int curr = q.poll();
            sb.append( (char) (curr + 'a') );

            for ( int i : setList.get( curr ) ) {
                dependency[i]--;
                if ( dependency[i] == 0 ) q.add( i );
            }

        }

        for ( int i : dependency ) {
            if ( i > 0 ) return "";
        }

        return sb.toString();
    }

    public static void main (String[] args){
        String[] test = {"wrt","wrf","er","ett","rftt","te"};
        System.out.println( alienOrder( test ) );
    }

}
