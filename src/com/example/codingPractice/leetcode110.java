package com.example.codingPractice;

public class leetcode110 {
    static boolean balance;
    public static void main (String[] args){
        TreeNode root= new TreeNode( 1 );
        root.right = new TreeNode( 2 );
        root.left = new TreeNode( 2 );
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode( 3 );
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode( 4 );

        System.out.println( isBalanced( root ) );
    }

    public static boolean isBalanced( TreeNode root ) {
        balance = true;
        helper( root );
        return balance;

    }

    public static int helper( TreeNode root) {
        if ( root == null ) return 0;

        int left = helper( root.left);
        int right = helper( root.right);

        if ( Math.abs( left - right ) > 1 ) balance = false;

        return 1 + Math.max( left, right );
    }

}
