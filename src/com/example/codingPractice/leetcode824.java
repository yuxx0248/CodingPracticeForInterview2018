package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode824 {
    List<Character> vowel;


    public String toGoatLatin( String S ) {
        if ( S.length() < 1 ) return S;
        String[] str = S.split( " " );
        StringBuilder res = new StringBuilder();
        vowel = new ArrayList<>();
        for ( char c : new char[]{ 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' } )
            vowel.add( c );
        int count = 0;
        for ( String s : str ) {
            count++;
            res.append( helper( new StringBuilder( s ), count ) ).append( " " );
        }
        return res.toString().trim();
    }

    public StringBuilder helper( StringBuilder sb, int count ) {
        if ( vowel.contains( sb.charAt( 0 ) ) ) {
            sb.append( "ma" );
        } else {
            sb.append( sb.charAt( 0 ) ).append( "ma" );
            sb.deleteCharAt( 0 );
        }
        for ( int i = 0; i < count; i++ )
            sb.append( "a" );

        return sb;
    }
}
