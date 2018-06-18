package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode257 {

    public List<String> binaryTreePaths( TreeNode root ) {
        List<String> res = new ArrayList<>();
        if ( root == null ) return res;
        helper( root, "", res );
        return res;
    }

    public void helper( TreeNode root, String str, List<String> res ) {
        if ( root.left == null && root.right == null ) res.add( str + root.val );
        if ( root.left != null ) helper( root.left, str + root.val + "->", res );
        if ( root.right != null ) helper( root.right, str + root.val + "->", res );
    }

}
