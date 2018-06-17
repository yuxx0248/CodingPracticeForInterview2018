package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class mockInterview {

    public List<List<Integer>> zigzagLevelOrder( TreeNode root ) {
        List<List<Integer>> res = new ArrayList<>();
        helper( res, root, 0 );
        return res;
    }

    public void helper( List<List<Integer>> res, TreeNode root, int level ) {
        if ( root == null ) return;

        if ( level > res.size() ) res.add( level, new ArrayList<>() );

        if ( level % 2 == 0 ) res.get( level ).add( root.val );
        else res.get( level ).add( 0, root.val );

        helper( res, root.left, level + 1 );
        helper( res, root.right, level + 1 );
    }


}
