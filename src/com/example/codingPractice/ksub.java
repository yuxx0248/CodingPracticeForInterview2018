package com.example.codingPractice;

public class ksub {
    static long kSub(int k, int[] nums) {
        int[] sum = new int[nums.length];
        long count = 0;
        sum[0]=nums[0];

        for (int i=1; i<nums.length;i++){
            sum[i] = sum[i-1] + nums[i];

        }

        int[] res = new int[k];

        for (int i=0;i<sum.length;i++){
            int l = sum[i]%k;

            if (l == 0) count ++;
            count += res[l];
            res[l] ++;
        }

        return count;
    }

}
