package com.example.codingPractice;

/**
 * The ListNode class represents a list node.
 *
 * @author Tong (Debby) Ding
 * @version 1.0
 */

public class LinkedList {

    class ListNode {


        int num;

        ListNode next;


        ListNode( int val, ListNode n ) {

            num = val;

            next = n;

        }


        /**
         * Constructor with one parameter
         *
         * @param num The element to store in this node
         */

        ListNode( int num ) {

            this( num, null );

        }

    }


    // Reference to the first node in the list

    private ListNode list;

    private ListNode ref;


    /**
     * Constructor that builds a linked list
     */

    public LinkedList() {

        list = null;

    }


    public void orderList( int newNum ) {
        // insert first node
        if ( list == null ) {
            list = new ListNode( newNum );
        } else if ( list != null && newNum <= list.num ) {
            list = new ListNode( newNum, list );
        } else {
            ref = list;

            while ( ref.next != null && ref.next.num < newNum ) {
                ref = ref.next;
            }

            ref.next = new ListNode( newNum, ref.next );

        }
    }


    public void print() {

        ref = list;

        while ( ref != null ) {

            System.out.println( ref.num );
            ref = ref.next;
        }

    }

}

