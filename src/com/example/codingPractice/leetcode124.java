package com.example.codingPractice;

public class leetcode124 {

    int max;

    public int maxPathSum( TreeNode root ) {
        max = Integer.MIN_VALUE;
        helper( root );
        return max;
    }

    public int helper( TreeNode root ) {
        if ( root == null ) return 0;
        int left = Math.max( helper( root.left ), 0 );
        int right = Math.max( helper( root.right ), 0 );

        max = Math.max( max, left + right + root.val );
        return root.val + Math.max( left, right );
    }
}
