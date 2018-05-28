package com.example.codingPractice;

import java.util.Scanner;

public class maxProduct {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        long[] nums = new long[a];
        for (int i = 0; i < a; i++) {
            nums[i] = s.nextInt();
        }

        System.out.println(maxPairProduct(nums));

    }

    public static long maxPairProduct(long[] nums){
        long max = Integer.MIN_VALUE;
        for(int i=0;i< nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                long x = nums[i];
                max=Math.max(max,nums[i]*nums[j]);

            }
        }
        return max;
    }

}
