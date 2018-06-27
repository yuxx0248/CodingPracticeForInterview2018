package com.example.codingPractice;

import java.util.Random;

public class leetcode384 {

    int[] org;
    int[] arry;
    Random random = new Random();

    public leetcode384( int[] nums ) {
        org = nums.clone();
        arry = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {
        arry = org.clone();
        return org;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {
        for ( int i = 0; i < org.length; i++ ) {
            swap( i, random.nextInt( org.length ), arry );
        }
        return arry;
    }

    public void swap (int i, int j, int[] arry){
        int tmp = arry[i];
        arry[i] = arry[j];
        arry[j] = tmp;
    }

}
