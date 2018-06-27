package com.example.codingPractice;

public class leetcode114 {

    private static TreeNode prev = null;

    public static void flatten( TreeNode root ) {
        if ( root == null )
            return;
        flatten( root.right );
        flatten( root.left );
        root.right = prev;
        root.left = null;
        prev = root;
    }

    public static void main( String[] args ) {
        TreeNode root = new TreeNode( 1 );
        root.right = new TreeNode( 5 );
        root.left = new TreeNode( 2 );
        root.left.left = new TreeNode( 3 );
        root.left.right = new TreeNode( 4 );
        root.right.right = new TreeNode( 7 );
        root.right.left = new TreeNode( 6 );

        flatten( root );
    }


}
