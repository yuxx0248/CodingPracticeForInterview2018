package com.example.codingPractice;

/**
 * Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
 *
 * If the last word does not exist, return 0.
 *
 * Input: "Hello World"
 * Output: 5
 */

public class leetcode58 {

    public static void main(String[] args){
        String test = "";

        System.out.println(firstWordOfLast(test));

    }

    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.length()-1 - s.lastIndexOf(" ");
    }

    /**
     * Follow up:
     * Find the first word of the last sentence
     */
    public static String firstWordOfLast(String s) {
        s = s.trim();
        String[] arr = s.split(String.valueOf("\\."));
        if (arr.length < 1) return "none";

        s = arr[arr.length - 1].trim();
        arr = s.split(" ");
        if (arr.length < 1) return "error";
        return arr[0].trim();
    }

}
