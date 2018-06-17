package com.example.codingPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class leetcode145 {

    public List<Integer> postorderTraversal( TreeNode root ) {
        List<Integer> res = new ArrayList<>();
        helper( root, res );
        return res;

    }

    public void helper( TreeNode root, List<Integer> res ) {
        if ( root == null ) return;

        helper( root.left, res );
        helper( root.right, res );
        res.add( root.val );

    }

    /**
     * use list.addFirst()
     */
    public List<Integer> postorderTraversalStack( TreeNode root ) {
        LinkedList<Integer> res = new LinkedList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.push( root );

        while ( !stack.isEmpty() ) {
            TreeNode curr = stack.pop();
            res.addFirst( curr.val );
            if ( curr.left != null ) stack.push( curr.left );
            if ( curr.right != null ) stack.push( curr.right );
        }

        return res;
    }


}
