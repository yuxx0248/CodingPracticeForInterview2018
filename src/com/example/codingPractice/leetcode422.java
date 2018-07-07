package com.example.codingPractice;

import java.util.List;

public class leetcode422 {

    public boolean validWordSquare( List<String> words ) {
        for ( int i = 0; i < words.size(); i++ ) {
            if ( words.get( i ).length() > words.size() ) return false;
            String word = words.get( i );
            for ( int j = 0; j < word.length(); j++ ) {
                if ( words.get( j ).length() <= i || word.charAt( j ) != words.get( j ).charAt( i ) )
                    return false;
            }
        }

        return true;
    }


}
