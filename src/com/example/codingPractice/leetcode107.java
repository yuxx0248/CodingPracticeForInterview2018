package com.example.codingPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode107 {

    public List<List<Integer>> levelOrderBottom( TreeNode root ) {
        List<List<Integer>> res = new ArrayList<>();
        if ( root == null ) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );

        while ( !q.isEmpty() ) {
            int size = q.size();
            List<Integer> list = new ArrayList<>();
            for ( int i = 0; i < size; i++ ) {
                TreeNode curr = q.poll();
                if ( curr.left != null ) q.add( curr.left );
                if ( curr.right != null ) q.add( curr.right );
                list.add( curr.val );
            }
            res.add( 0, new ArrayList<>( list ) );
        }
        return res;
    }

}
