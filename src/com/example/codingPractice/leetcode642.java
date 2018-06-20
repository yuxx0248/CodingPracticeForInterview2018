package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode642 {

    class AutocompleteSystem {

        basicTrie root;
        String curr;

        public AutocompleteSystem( String[] sentences, int[] times ) {
            root = new basicTrie();
            curr = new String();

            for ( int i = 0; i < sentences.length; i++ ) {
                root.insertWithTime( sentences[ i ], times[ i ] );
            }
        }

        public List<String> input( char c ) {
            List<String> res = new ArrayList<>();

            if ( c == '#' ) {
                if ( root.search( curr ) ) root.updateTime( curr );
                else root.insertWithTime( curr, 1 );
                curr = new String();
                return new ArrayList<>();
            } else if ( c == ' ' ) {
                //if (curr.charAt( curr.length()-1 ) == ' ')
            }

            return res;
        }
    }


}
