package com.example.codingPractice;

public class leetcode437 {

    public int pathSum( TreeNode root, int sum ) {
        return helper( root, sum ) + helper( root.left, sum ) + helper( root.right, sum );
    }

    public int helper( TreeNode root, int sum ) {
        if ( root == null ) return 0;

        return root.val == sum ? 1 : 0 + helper( root.left, sum - root.val ) + helper( root.right, sum - root.val );
    }

}
