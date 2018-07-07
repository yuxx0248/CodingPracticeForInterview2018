package com.example.codingPractice;

public class DoubleLinkedList {
    DNode head;
    DNode tail;
    int count;


    public DoubleLinkedList() {
        head = new DNode();
        tail = new DNode();
        head.next = tail;
        head.prev = null;
        tail.next = null;
        tail.prev = head;

        count = 0;
    }

    public void insert( int key, int value ) {
        DNode list = new DNode( key, value );

        list.prev = head;
        list.next = head.next;

        head.next.prev = list;
        head.next = list;

        count++;
    }

    public void remove( DNode node ) {
        DNode prev = node.prev;
        DNode next = node.next;

        prev.next = next;
        next.prev = prev;

    }

    public int removeLeast() {
        int key = tail.prev.key;
        tail.prev.prev.next = tail;
        tail.prev = tail.prev.prev;

        count--;
        return key;
    }

    public DNode search( int key ) {
        DNode search = head.next;
        while ( search != tail ) {
            if ( search.key == key ) return search;
            search = search.next;
        }

        return null;
    }

    static class DNode {
        DNode next;
        DNode prev;
        int key;
        int value;

        public DNode() {

        }

        public DNode( int key, int value ) {
            this.key = key;
            this.value = value;
        }
    }
}


