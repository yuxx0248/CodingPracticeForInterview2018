package com.example.codingPractice;

import java.util.Stack;

public class leetcode273 {
    public static void main(String[] args){
        int num = 10;
        Stack s1 = toWords(num);
        int counter = s1.size()-1;

        String res = new String();

        while(!s1.empty()){
                res += translate(Integer.parseInt(s1.pop().toString()));
                res += unit[counter--] + " ";
        }

        System.out.println(res);
    }

    public static Stack toWords(int num){
        Stack stack = new Stack();
        while(num>0){
            stack.push(num%1000);
            num /= 1000;
        }

        return stack;
    }

    public static String translate(int num){
        if (num<10){
            return nums[num%10] + " ";
        }else if(num == 10){
            return dec[1] + " ";
        }else if(num<20){
            return tens[num%10] + " ";
        }else if (num<100){
            return dec[num/10] + " " + translate(num%10);
        }else{
            return nums[num/100] + " Hundred " + translate(num%100);
        }
    }

    public static final String[] unit = new String[]{"","Thousand","Million","Billion"};
    public static final String[] nums = new String[]{"","One","Two","Three","Four","Five","Six","Seven","Eight","Nine"};
    public static final String[] tens = new String[]{"","Eleven","Twelve","Thirteen", "Fourteen","Fifteen","Sixteen","Seventeen","Eighteen","Nineteen"};
    public static final String[] dec = new String[]{"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};

}
