package com.example.codingPractice;

public class leetcode206 {

    public static ListNode reverseList( ListNode head ) {
        if ( head == null || head.next == null ) return head;
        ListNode p = reverseList( head.next );
        head.next.next = head;
        head.next = null;
        return p;
    }

    public static void main( String[] args ) {
        ListNode head = new ListNode( 1 );
        head.next = new ListNode( 2 );
        head.next.next = new ListNode( 3 );

        ListNode res = reverseList( head );

    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode( int x ) {
            val = x;
        }
    }

}
