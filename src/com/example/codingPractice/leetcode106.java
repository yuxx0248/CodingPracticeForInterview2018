package com.example.codingPractice;

import java.util.HashMap;
import java.util.Map;

public class leetcode106 {

    public TreeNode buildTree( int[] inorder, int[] postorder ) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < inorder.length; i++ ) {
            map.put( inorder[ i ], i );
        }
        return builder( inorder, 0, inorder.length - 1, postorder, 0, postorder.length - 1, map );
    }

    public TreeNode builder( int[] inorder, int is, int ie, int[] postorder, int ps, int pe, Map<Integer, Integer> map ) {
        if ( is > ie || ps > pe ) return null;
        TreeNode root = new TreeNode( postorder[ pe ] );
        int index = map.get( postorder[ pe ] );
        root.left = builder( inorder, is, index - 1, postorder, ps, ps + index - is - 1, map );
        root.right = builder( inorder, index + 1, ie, postorder, ps + index - is, pe - 1, map );
        return root;
    }

}
