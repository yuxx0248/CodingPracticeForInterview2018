package com.example.codingPractice;

import java.util.List;

public class leetcode647 {

    public int countSubstrings(String s) {
        for ( int i =0; i< s.length();i++){

        }
        return 1;
    }

    public List<StringBuilder> helper ( List<StringBuilder> res, String s, int index ){
        res.add( new StringBuilder( s.charAt( index ) ) );
        if ( s.charAt( index ) == s.charAt( index+1 )) res.add( new StringBuilder( s.substring( index, index+1 ) ) );
        return res;
    }

    }
