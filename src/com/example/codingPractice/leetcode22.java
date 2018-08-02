package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode22 {

    public List<String> generateParenthesis( int n ) {
        List<String> res = new ArrayList<>();
        helper( res, new StringBuilder(), 0, 0, n );
        return res;
    }

    public void helper( List<String> res, StringBuilder sb, int numL, int numR, int n ) {
        if ( sb.length() == n * 2 ) {
            res.add( sb.toString() );
            return;
        }
        if ( numL < n ) {
            sb.append( "(" );
            helper( res, sb, numL + 1, numR, n );
            sb.deleteCharAt( sb.length() - 1 );
        }
        if ( numR < n && numR < numL ) {
            sb.append( ")" );
            helper( res, sb, numL, numR + 1, n );
            sb.deleteCharAt( sb.length() - 1 );
        }
    }


}
