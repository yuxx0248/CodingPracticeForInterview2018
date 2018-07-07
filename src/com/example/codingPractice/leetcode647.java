package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode647 {

    public int countSubstrings( String s ) {
        int res = 0;
        for ( int center = 0; center < s.length() * 2; center++ ) {
            int left = center / 2;
            int right = left + center % 2;

            while ( left >= 0 && right < s.length() && s.charAt( left ) == s.charAt( right ) ) {
                right++;
                left--;
                res++;
            }
        }
        return res;
    }

    public static List<String> getSubstrings( String s ) {
        List<String> res = new ArrayList<>();
        for ( int center = 0; center < s.length() * 2; center++ ) {
            int left = center / 2;
            int right = left + center % 2;

            while ( left >= 0 && right < s.length() && s.charAt( left ) == s.charAt( right ) ) {
                res.add( s.substring( left, right+1 ) );
                right++;
                left--;
            }
        }
        return res;
    }

    public static void main( String[] args ) {
        List<String> list = getSubstrings( "aaabccb" );
        for ( String s : list ) {
            System.out.println( s );
        }
    }


}
