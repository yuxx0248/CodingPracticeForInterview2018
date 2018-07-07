package com.example.codingPractice;

import java.util.*;

public class leetcode49 {

    public List<List<String>> groupAnagrams( String[] strs ) {
        if ( strs.length < 1 ) return new ArrayList<>();
        Map<String, List<String>> map = new HashMap<>();
        for ( String s : strs ) {
            char[] temp = s.toCharArray();
            Arrays.sort( temp );
            String sorted = new String( temp );
            if ( !map.containsKey( sorted ) ) {
                map.put( sorted, new ArrayList<>() );
            }
            map.get( sorted ).add( s );
        }

        List<List<String>> res = new ArrayList<>();
        for ( List<String> sList : map.values() ) {
            res.add( sList );
        }

        return res;
    }

}
