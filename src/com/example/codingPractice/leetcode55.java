package com.example.codingPractice;

public class leetcode55 {

    public static boolean canJump( int[] nums ) {

        boolean[] dp = new boolean[ nums.length ];
        dp[ 0 ] = true;

        for ( int i = 0; i < nums.length-1; i++ ) {
            if ( dp[ i ] ) {
                for ( int j = 0; j <= nums[ i ]; j++ ) {
                    dp[ i+j ] = true;
                }
            }
        }

        return dp[ dp.length - 1 ];

    }

    public static boolean canJump2(int[] nums){
        int reachable = 0;
        for (int i=0;i<nums.length-1;i++){
            if (i>reachable) return false;
            reachable = Math.max(reachable, i + nums[i]);
        }

        return reachable>=nums.length-1;
    }

    public static void main(String[] args){
        int[] arr = {2,3,1,1,4};
        System.out.println( canJump2( arr ) );
    }

}
