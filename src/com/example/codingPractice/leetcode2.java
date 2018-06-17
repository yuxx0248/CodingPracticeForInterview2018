package com.example.codingPractice;

/**
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */


public class leetcode2 {

    public static void main( String[] args ) {
        ListNode a = new ListNode( 2 );
        a.next = new ListNode( 4 );
        a.next.next = new ListNode( 3 );
        ListNode b = new ListNode( 5 );
        b.next = new ListNode( 6 );
        b.next.next = new ListNode( 4 );


        ListNode res = addTwoNumbers( a, b );

        while ( res != null ) {
            System.out.print( res.val + " " );
            res = res.next;
        }
    }

    public static ListNode addTwoNumbers( ListNode l1, ListNode l2 ) {

        int carry = 0;
        ListNode res = new ListNode( 0 );
        ListNode dummy = res;

        while ( l1 != null || l2 != null ) {
            int v1 = l1 == null ? 0 : l1.val;
            int v2 = l2 == null ? 0 : l2.val;
            int tmp = v1 + v2 + carry;
            carry = 0;
            if ( tmp >= 10 ) {
                tmp = tmp % 10;
                carry = 1;
            }
            res.next = new ListNode( tmp );
            res = res.next;


            if ( l1 != null ) l1 = l1.next;
            if ( l2 != null ) l2 = l2.next;
        }

        if ( carry != 0 ) {
            res.next = new ListNode( carry );
        }

        return dummy.next;
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode( int x ) {
            val = x;
        }
    }

}
