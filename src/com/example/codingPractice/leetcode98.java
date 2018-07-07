package com.example.codingPractice;

import java.util.Stack;

public class leetcode98 {
    public boolean isValidBST( TreeNode root ) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode pre = null;

        while ( root != null || !stack.isEmpty() ) {
            while ( root != null ) {
                stack.push( root );
                root = root.left;
            }
            root = stack.pop();
            if ( pre!= null && root.val <= pre.val ) return false;
            pre = root;
            root = root.right;

        }
        return true;
    }
}
