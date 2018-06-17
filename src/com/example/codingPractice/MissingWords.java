package com.example.codingPractice;

public class MissingWords {
    public static void main( String[] args ) {


    }

    public static String[] missingwords( String t, String s ) {

        String[] a = t.split( " " );
        String[] b = s.split( " " );

        String[] missing = new String[ a.length - b.length ];
        int res = 0;

        for ( int i = 0; i < a.length; i++ ) {
            boolean f = false;
            for ( int j = 0; j < b.length; j++ ) {
                if ( a[ i ].equals( b[ j ] ) )
                    f = true;
            }
            if ( f ) {
                missing[ res++ ] = a[ i ];

            }
        }
        return missing;

    }
}
