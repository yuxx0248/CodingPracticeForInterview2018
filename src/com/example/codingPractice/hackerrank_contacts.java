package com.example.codingPractice;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class hackerrank_contacts {
    private static final Scanner scanner = new Scanner( System.in );

    public static void main( String[] args ) {
        List<String> ops = new LinkedList<>();

        int n = scanner.nextInt();
        scanner.skip( "(\r\n|[\n\r\u2028\u2029\u0085])?" );

        for ( int nItr = 0; nItr < n; nItr++ ) {
            String[] opContact = scanner.nextLine().split( " " );

            String op = opContact[ 0 ];

            String contact = opContact[ 1 ];

            helper( op, contact, ops );
        }
        scanner.close();

    }

    public static void helper( String op, String contact, List<String> ops ) {

        if ( op.equals( "add" ) ) {
            ops.add( contact );
        } else {
            System.out.println( getCount( ops, contact ) );
        }

    }

    public static int getCount( List<String> ops, String target ) {
        int rtn = 0;
        for ( int i = 0; i < ops.size(); i++ ) {
            if ( ops.get( i ).contains( target ) ) rtn++;
        }
        return rtn;
    }

}