package com.example.codingPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode515 {

    public List<Integer> largestValues( TreeNode root ) {
        List<Integer> res = new ArrayList<>();
        if ( root == null ) return res;
        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );

        while ( !q.isEmpty() ) {
            int size = q.size();
            int max = Integer.MIN_VALUE;
            for ( int i = 0; i < size; i++ ) {
                TreeNode curr = q.poll();
                max = Math.max( max, curr.val );

                if ( curr.left != null ) q.add( curr.left );
                if ( curr.right != null ) q.add( curr.right );
            }
            res.add( max );

        }
        return res;
    }


}
