package com.example.codingPractice;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class hackerrank_simulate {

    private static final Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
/*
        int l = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");

        int r = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])*");*/

        int[] res = oddNumbers( 2, 5 );

/*        for (int resItr = 0; resItr < res.length; resItr++) {
            bufferedWriter.write(String.valueOf(res[resItr]));

            if (resItr != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }*/

        //       bufferedWriter.newLine();

        //       bufferedWriter.close();

        //       scanner.close();
        for ( int i : res ) {
            System.out.println( i );
        }
    }

    static int[] oddNumbers( int l, int r ) {
        List list = new LinkedList<Integer>();
        while ( l <= r ) {

            if ( l % 2 != 0 ) {
                list.add( l );
            }

            l++;
        }

        int[] res = new int[ list.size() ];

        for ( int i = 0; i < list.size(); i++ ) {
            res[ i ] = (int) list.get( i );
        }

        return res;
    }


}
