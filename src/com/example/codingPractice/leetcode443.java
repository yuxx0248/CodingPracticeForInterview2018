package com.example.codingPractice;

public class leetcode443 {
    public static void main(String[] args) {
        char[] test = {'a','a','b','b','c','c','c'};
        char[] arr = compress(test);
        System.out.print(arr);

    }




    public static char[] compress(char[] chars) {
        int counter = 1;
        int slow = 1;
        char[] tmpArr = new char[chars.length];
        tmpArr[0] = chars[0];
        int pnt = 0;
        for (int i=1;i<chars.length;i++){
            if (chars[i] == chars[i-1]){
                counter++;
            }else{
                char temp = (char) counter;
                temp += '0';
                if (counter > 1) {
                    tmpArr[pnt++] = temp;
                    counter = 1;
                }
                tmpArr[pnt++] = chars[i];
            }
        }
        if (counter > 1) {
            char temp = (char) counter;
            temp += '0';
            tmpArr[pnt++] = temp;
        }
            return tmpArr;
    }
}
