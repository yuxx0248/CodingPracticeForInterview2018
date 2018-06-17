package com.example.codingPractice;

public class StringSQL {
    private static String CALL_PREFIX = "CALL CopyCronEntry( 0, \'";
    private static String TARGET_PREFIX = "\', \'abebookseu\', 2980, now(), \'";
    private static String END = " 60 mins EDX ProtectedHits Publisher\' )";

    public static void main( String[] args ) {
        String[] arr = { "acde", "aces", "acfr", "acin", "acit", "acuk", "aiweu", "av-row-eu", "av-row-fe", "blogseu", "cba-de", "cba-in", "cba-uk", "cseu", "mcomeu", "sceu", "transin", "vceu", "vcin", "webstore2eu" };
        buildString( arr );
    }

    public static void buildString( String[] strings ) {
        String[] res = new String[ strings.length ];
        int i = 0;
        for ( String str : strings ) {
            StringBuilder sb = new StringBuilder();
            sb.append( CALL_PREFIX );
            sb.append( str );
            sb.append( TARGET_PREFIX );
            sb.append( str );
            sb.append( END );
            sb.append( ";" );
            System.out.println( sb.toString() );
            res[ i++ ] = sb.toString();
        }

    }


}
