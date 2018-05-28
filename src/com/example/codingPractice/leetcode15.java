package com.example.codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode15 {
    public static void main(String[] args){
        int[] arr = {-2,0,0,2,2};
        List<List<Integer>> res = threeSum(arr);

        for (List<Integer> l : res){
            for (int i : l){
                System.out.println(i);
            }
        }

    }

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums.length<3) return new ArrayList<>();

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        for (int i=0;i<nums.length-2;i++){
            for (int j = i+1;j<nums.length-1;j++){
                int k = j+1;
                int tst = nums[i] + nums[j] + nums[k];
                while (k< nums.length && tst <= 0){
                    List<Integer> list = new ArrayList<>();
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        list.addAll(Arrays.asList(nums[i], nums[j], nums[k]));
                        if(!res.contains(list)) {
                            res.add(list);
                        }
                    }
                    k++;
                }

            }
        }
        return res;
    }
}
