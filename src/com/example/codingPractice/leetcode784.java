package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode784 {

    public static List<String> letterCasePermutation( String S ) {
        List<StringBuilder> res = new ArrayList<>();
        res.add( new StringBuilder() );

        for ( char c : S.toCharArray() ) {
            int size = res.size();
            if ( Character.isLetter( c ) ) {
                for ( int i = 0; i < size; i++ ) {
                    res.add( new StringBuilder( res.get( i ) ) );
                    res.get( i ).append( Character.toLowerCase( c ) );
                    res.get( size + i ).append( Character.toUpperCase( c ) );
                }
            } else {
                for ( int i = 0; i < size; i++ ) {
                    res.get( i ).append( c );
                }
            }
        }
        List<String> rtn = new ArrayList<>();
        for ( StringBuilder sb : res ) {
            rtn.add( sb.toString() );
        }
        return rtn;
    }

    public static void main( String[] args ) {
        String str = "b1j2s8";
        List<String> res = letterCasePermutation( str );
    }

}
