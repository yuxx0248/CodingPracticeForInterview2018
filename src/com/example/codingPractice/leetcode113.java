package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode113 {


    public List<List<Integer>> pathSum( TreeNode root, int sum ) {
        List<List<Integer>> res = new ArrayList<>();
        helper( root, sum, new ArrayList<>(), res );
        return res;
    }

    public void helper( TreeNode root, int sum, List<Integer> list, List<List<Integer>> res ) {
        if ( root == null ) return;
        list.add( root.val );

        if ( root.left == null && root.right == null && sum == root.val ) {
            res.add( new ArrayList<>( list ) );
            list.remove( list.size() - 1 );
            return;
        } else {
            helper( root.right, sum - root.val, list, res );
            helper( root.left, sum - root.val, list, res );
        }
        list.remove( list.size() - 1 );
    }

}
