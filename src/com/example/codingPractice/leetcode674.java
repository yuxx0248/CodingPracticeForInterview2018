package com.example.codingPractice;

/**
 * Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).
 *
 * Input: [1,3,5,4,7]
 * Output: 3
 * Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3.
 * Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4.
 */

public class leetcode674 {
    public int findLengthOfLCIS(int[] nums) {
        int res = 0;
        int curr = 1;

        for (int i=0;i<nums.length;i++){
            if (i>0 && nums[i-1] < nums[i]) curr++;
            else curr = 1;

            res = Math.max(res, curr);
        }
        return res;
    }

}
