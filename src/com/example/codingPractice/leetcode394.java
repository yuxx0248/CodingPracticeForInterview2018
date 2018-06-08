package com.example.codingPractice;

import java.util.Stack;

public class leetcode394 {

    public static void main (String[] args){
        String data = "100[leetcode]";
        System.out.println(decodeString(data));
    }

    public static String decodeString(String s) {
        int count = 0;
        Stack<Integer> countStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();
        StringBuilder currString = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        for (char c : s.toCharArray()){
            //number
            if (c>='0' && c<='9'){
               count *= 10;
               count += c-'0';
            }
            //[
            else if ( c == '['){
                countStack.push(count);
                count=0;
                stringStack.push(currString.toString());
                currString = new StringBuilder();
            }
            //]
            else if ( c == ']'){
                int time = countStack.pop();
                if (countStack.isEmpty()){
                    for (int i=0;i<time;i++){
                        sb.append(currString.toString());
                    }
                }else{
                    StringBuilder tmp = new StringBuilder();
                    for (int i=0;i<time;i++){
                        tmp.append(currString);
                    }
                    currString = new StringBuilder(stringStack.pop() + tmp.toString());
                }
            }
            //char
            else{
                if (countStack.isEmpty()){
                    sb.append(c);
                }else{
                    currString.append(c);
                }
            }
        }

        return sb.toString();
    }

}
