package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode366 {

    public List<List<Integer>> findLeaves( TreeNode root ) {
        List<List<Integer>> res = new ArrayList<>();
        helper( res, root );
        return res;

    }

    public int helper( List<List<Integer>> res, TreeNode root ) {
        if ( root == null ) return -1;
        int level = 1 + Math.max( helper( res, root.left ), helper( res, root.right ) );

        if ( res.size() < level + 1 ) res.add( level, new ArrayList<>() );
        res.get( level ).add( root.val );
        return level;
    }

}
