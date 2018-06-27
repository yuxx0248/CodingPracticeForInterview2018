package com.example.codingPractice;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class leetcode637 {

    public List<Double> averageOfLevels( TreeNode root ) {
        List<Double> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        q.add( root );
        while ( !q.isEmpty() ) {
            long sum = 0;
            int count = q.size();
            Queue<TreeNode> dummy = new LinkedList<>();
            while ( !q.isEmpty() ) {
                TreeNode curr = q.poll();
                sum += curr.val;
                if ( curr.left != null ) dummy.add( curr.left );
                if ( curr.right != null ) dummy.add( curr.right );
            }
            q = dummy;
            res.add( sum*1.0 / count );
        }

        return res;
    }

}
