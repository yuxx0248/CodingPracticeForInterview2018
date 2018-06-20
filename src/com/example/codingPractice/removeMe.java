package com.example.codingPractice;


import java.util.Comparator;
import java.util.PriorityQueue;

public class removeMe {

    public ListNode mergeKLists( ListNode[] lists ) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>( new Comparator<ListNode>() {
            @Override
            public int compare( ListNode o1, ListNode o2 ) {
                return o1.val - o2.val;
            }
        } );

        for ( ListNode list : lists ) {
            pq.add( list );
        }

        ListNode dummy = new ListNode( 0 );
        ListNode runner = dummy;

        while ( !pq.isEmpty() ) {
            runner.next = pq.poll();
            runner = runner.next;
        }

        return dummy.next;

    }

}
