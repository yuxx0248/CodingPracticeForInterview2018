package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode111 {

    public int minDepth( TreeNode root ) {
        return helper( root );
    }

    public int helper( TreeNode root ) {
        if ( root == null ) return 0;
        int left = helper( root.left );
        int right = helper( root.right );

        return ( left == 0 || right == 0 ) ? left + right + 1 : 1 + Math.min( left, right );
    }

    public int minDepthQ( TreeNode root ) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );
        int count = 1;
        while ( !q.isEmpty() ) {
            TreeNode curr = q.poll();

            if ( curr.left == null && curr.right == null ) return count;
            if ( curr.left != null ) q.add( curr.left );
            if ( curr.right != null ) q.add( curr.right );
            count++;
        }
        return -1;
    }

}
