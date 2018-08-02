package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode315 {
    int[] res;

    public List<Integer> countSmaller( int[] nums) {
        res = new int[nums.length];
        for ( int i =0; i<nums.length;i++){
        }

        helper (nums, 0, nums.length-1);
        return new ArrayList<>(  );
    }

    public void helper (int[] nums, int start, int end){
        if ( start >= end) return;
        int mid = start + (end-start)/2;
        helper( nums, start, mid-1 );
        helper( nums, mid, end );

        merge( nums, start, mid-1, mid, end );

    }

    public void merge (int[] nums, int l1, int r1, int l2, int r2){

    }

    public void swap (int[] nums, int a, int b){
        int temp = nums[b];
        nums[b] = nums[a];
        nums[a] = temp;
    }

    }
