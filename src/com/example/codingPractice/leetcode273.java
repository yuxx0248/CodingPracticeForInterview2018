package com.example.codingPractice;

public class leetcode273 {
    public static final String[] thousand = new String[]{ "", "Thousand", "Million", "Billion" };
    public static final String[] underTwenty = new String[]{ "", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen" };
    public static final String[] tens = new String[]{ "", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety" };


    public String numberToWords( int num ) {
        if ( num == 0 ) return "Zero";

        String word = "";
        int i = 0;
        while ( num > 0 ) {
            if ( num % 1000 != 0 )
                word += helper( num % 1000 ) + thousand[ i++ ] + " " + word;
            num /= 1000;
        }

        return word.trim();
    }

    public String helper( int num ) {
        if ( num == 0 ) return "";
        else if ( num < 20 ) {
            return underTwenty[ num ] + " ";
        } else if ( num < 100 ) {
            return tens[ num / 10 ] + " " + helper( num % 10 );
        } else
            return underTwenty[ num / 100 ] + " Hundred " + helper( num % 100 );
    }

}
