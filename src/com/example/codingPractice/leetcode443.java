package com.example.codingPractice;

public class leetcode443 {
    public static void main(String[] args) {
        char[] test = {'a','a','b','b','c','c','c'};
        int i = compress(test);

    }




    public static int compress(char[] chars) {
        int res = 0;
        int index = 0;
        while (index < chars.length){
            char curr = chars[index];
            int counter = 0;

            while (index<chars.length && chars[index] == curr){
                counter ++;
                index ++;
            }

            chars[res++] = curr;

            if (counter >1){
                for (char c : Integer.toString(counter).toCharArray()){
                    chars[res++] = c;
                }
            }

        }

        return res;
    }
}
