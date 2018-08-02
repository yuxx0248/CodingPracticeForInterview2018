package com.example.codingPractice;

public class leetcode415 {

    public static String addStrings( String num1, String num2 ) {
        StringBuilder sb = new StringBuilder();
        int l1 = num1.length();
        int l2 = num2.length();
        int carry = 0;
        int n1, n2, sum;

        while ( l1 > 0 && l2 > 0 ) {
            n1 = l1 == 0 ? 0 : num1.charAt( l1-1 )-'0';
            l1--;
            n2 = l2 == 0 ? 0 : num2.charAt( l2-1 )-'0';
            l2--;

            sum = n1 + n2 + carry;
            sb.append( sum % 10 );
            carry = sum / 10;
        }
        if ( carry != 0)
            sb.append( carry );

        return sb.reverse().toString();
    }

    public static void main( String[] args ) {
        System.out.println( addStrings( "10", "2" ) );
    }

}
