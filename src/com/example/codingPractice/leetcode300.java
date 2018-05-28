package com.example.codingPractice;

public class leetcode300 {
    public static void main (String[] args){
        int[] arr = {10,9,2,5,3,7,101,18};
        int res = lengthOfLIS(arr);

        System.out.println(res);
    }

    public static int lengthOfLIS(int[] nums) {
        if (nums.length < 1) return 0;
        int res = 0;

        for (int i=0;i<nums.length;i++){
            int[] tmp = new int[nums.length-i];
            tmp[0] = nums[i];
            int count = 0;
            for (int j = i;j<nums.length;j++){
                if (nums[j]>tmp[count]) tmp[++count] = nums[j];
                if (j == nums.length-1) res = Math.max(res, count);
            }
        }

        return res+1;
    }
}
