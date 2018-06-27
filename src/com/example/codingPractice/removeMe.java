package com.example.codingPractice;


import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Stack;

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

    public String removeKdigits( String num, int k ) {
        Stack<Character> stack = new Stack<>();

        for ( int i = 0; i < num.length(); i++ ) {
            while ( k > 0 && !stack.isEmpty() && stack.peek() > num.charAt( i ) ) {
                stack.pop();
                k--;
            }

            stack.push( num.charAt( i ) );
        }

        while ( k > 0 ) {
            stack.pop();
        }

        StringBuilder sb = new StringBuilder();
        for ( Character c : stack ) {
            sb.append( c );
        }

        while (sb.charAt( 0 ) == '0') sb.deleteCharAt( 0 );
        return sb.toString();

    }

}
