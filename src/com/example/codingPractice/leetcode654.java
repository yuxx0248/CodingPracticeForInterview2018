package com.example.codingPractice;

public class leetcode654 {

    public static void main( String[] args ) {
        int[] arr = { 3, 2, 1, 6, 0, 5 };

        constructMaximumBinaryTree( arr );
    }

    public static TreeNode constructMaximumBinaryTree( int[] nums ) {
        if ( nums.length == 0 ) return null;
        TreeNode res = helper( nums, 0, nums.length );
        return res;
    }

    public static TreeNode helper( int[] nums, int start, int end ) {
        if ( start == end ) return null;
        int max = getMax( nums, start, end );
        TreeNode root = new TreeNode( nums[ max ] );
        root.left = helper( nums, start, max );
        root.right = helper( nums, max + 1, end );

        return root;
    }

    public static int getMax( int[] nums, int start, int end ) {
        int max = start;
        for ( int i = start; i < end; i++ ) {
            if ( nums[ max ] < nums[ i ] ) max = i;
        }
        return max;
    }

    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode( int x ) {
            val = x;
        }
    }
}
