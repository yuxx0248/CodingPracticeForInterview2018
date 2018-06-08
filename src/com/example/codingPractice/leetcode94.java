package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class leetcode94 {

    public List<Integer> inorderTraversalRec(TreeNode root) {
        List<Integer> res = new ArrayList<>();

        recHelper(root, res);

        return res;
    }

    public void recHelper( TreeNode root, List<Integer> res ){
        if ( root == null ) return;
        recHelper(root.left, res);
        res.add(root.val);
        recHelper(root.right, res);
    }

    public List<Integer> inorderTraversalStack(TreeNode root){
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> res = new ArrayList<>();
        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()){
            while (curr != null){
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }

        return res;
    }

}
