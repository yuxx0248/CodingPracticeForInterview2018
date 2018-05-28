package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Queue;

public class leetcode513 {


    public static void main(String[] args) {
        leetcode654.TreeNode root = new leetcode654.TreeNode(0);
        root.left = new leetcode654.TreeNode(1);
        root.right = new leetcode654.TreeNode(2);
        root.left.left = new leetcode654.TreeNode(3);
        root.left.right = new leetcode654.TreeNode(4);
        root.left.left.left = new leetcode654.TreeNode(6);
        root.left.right.right = new leetcode654.TreeNode(7);
        root.right.right = new leetcode654.TreeNode(5);

        int i = findLeftMostNode(root);
        System.out.print(i);
    }

    public static int findLeftMostNode(leetcode654.TreeNode root) {
        Queue<leetcode654.TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {

            root = queue.poll();
            int val = root.val;
            if (root.right != null)
                queue.add(root.right);
            if (root.left != null)
                queue.add(root.left);
        }
        return root.val;
    }


}
