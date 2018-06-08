package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode145 {

    public List< Integer > postorderTraversal( TreeNode root ) {
        List< Integer > res = new ArrayList<>();
        helper( root, res );
        return res;

    }

    public void helper( TreeNode root, List< Integer > res ) {
        if ( root == null ) return;

        helper( root.left, res );
        helper( root.right, res );
        res.add( root.val );

    }

    /**
     *
     * use list.addFirst()
     */
    public List< Integer > postorderTraversalStack( TreeNode root ) {
        return new ArrayList<>(  );
    }


}
