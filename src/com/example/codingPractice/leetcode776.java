package com.example.codingPractice;


public class leetcode776 {

    public static TreeNode[] splitBST( TreeNode root, int V ) {
        if ( root == null )
            return new TreeNode[]{ null, null };
        else if ( root.val <= V ) {
            TreeNode[] bns = splitBST( root.right, V );
            root.right = bns[ 0 ];
            bns[ 0 ] = root;
            return bns;
        } else {
            TreeNode[] bns = splitBST( root.left, V );
            root.left = bns[ 1 ];
            bns[ 1 ] = root;
            return bns;
        }
    }

    public static void main( String[] args ) {
        TreeNode root = new TreeNode( 4 );
        root.left = new TreeNode( 2 );
        root.left.right = new TreeNode( 3 );
        root.left.left = new TreeNode( 1 );
        root.right = new TreeNode( 6 );
        root.right.left = new TreeNode( 5 );
        root.right.right = new TreeNode( 7 );

        TreeNode[] res = splitBST( root, 2 );

        int i = 0;

    }
}
