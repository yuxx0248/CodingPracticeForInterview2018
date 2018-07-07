package com.example.codingPractice;

public class leetcode148 {

    public ListNode sortList( ListNode head ) {
        if ( head == null || head.next == null ) return head;

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
        while ( fast != null && fast.next != null ) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;

        ListNode l1 = sortList( head );
        ListNode l2 = sortList( slow );

        return merge( l1, l2 );
    }

    public ListNode merge( ListNode l1, ListNode l2 ) {
        ListNode dummy = new ListNode( 0 );
        ListNode curr = dummy;

        while ( l1 != null && l2 != null ) {
            if ( l1.val < l2.val ) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }

        if ( l1 != null ) curr.next = l1;
        if ( l2 != null ) curr.next = l2;

        return dummy.next;
    }

}
