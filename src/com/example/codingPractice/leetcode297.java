package com.example.codingPractice;

import java.util.Arrays;
import java.util.LinkedList;

public class leetcode297 {

    // Encodes a tree to a single string.
    public String serialize( TreeNode root ) {
        StringBuilder sb = new StringBuilder();
        builder( root, sb );
        return sb.toString();
    }

    public void builder( TreeNode root, StringBuilder sb ) {
        if ( root == null ) {
            sb.append( "X" ).append( "," );
        }
        sb.append( root.val ).append( "," );
        builder( root.left, sb );
        builder( root.right, sb );
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize( String data ) {
        LinkedList<String> list = new LinkedList();
        list.addAll( Arrays.asList( data.split( "," ) ) );
        return breaker( list );
    }

    public TreeNode breaker( LinkedList<String> list ) {
        String curr = list.remove();
        if ( curr.equals( "X" ) ) return null;
        TreeNode root = new TreeNode( Integer.valueOf( curr ) );
        root.left = breaker( list );
        root.right = breaker( list );
        return root;
    }

}
