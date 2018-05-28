package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode47 {

    public static void main (String[] args){
        int[] nums = {1,1,2};
        List<List<Integer>> res = permuteUnique(nums);
    }

    public static List<List<Integer>> permuteUnique(int[] nums) {
        boolean[] used = new boolean[nums.length];
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, res, new ArrayList<>(), used);

        return res;
    }

    public static void helper(int[] nums, List<List<Integer>> res, List<Integer> list, boolean[] used){
        if (list.size() == nums.length && !res.contains(list)) {
            res.add(new ArrayList<>(list));
            return;
        }else{
            for (int i = 0;i<nums.length;i++){
                if (used[i]) continue;
                else {
                    list.add(nums[i]);
                    used[i] = true;
                    helper(nums, res, list, used);
                    list.remove(list.size()-1);
                    used[i] = false;
                }
            }
        }
    }
}
