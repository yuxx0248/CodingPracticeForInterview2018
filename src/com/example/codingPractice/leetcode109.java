package com.example.codingPractice;

public class leetcode109 {

    ListNode head;

    public TreeNode sortedListToBST( ListNode head ) {
        int size = 0;
        this.head = head;
        ListNode runner = head;
        while ( runner != null ) {
            runner = runner.next;
            size++;
        }
        return helper( 0, size -1);
    }

    public TreeNode helper( int start, int end ) {
        if ( start > end ) return null;
        int mid = start + ( end - start ) / 2;
        TreeNode left = helper( start, mid - 1 );
        TreeNode root = new TreeNode( head.val );
        root.left = left;
        head = head.next;
        root.right = helper( mid + 1, end );
        return root;
    }

}
