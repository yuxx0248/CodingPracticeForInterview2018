package com.example.codingPractice;

import java.util.HashMap;
import java.util.Map;

public class leetcode146 {
    DLNode head;
    DLNode tail;
    int capacity;
    Map<Integer, DLNode> map;
    int count;

    public leetcode146( int capacity ) {
        head = new DLNode();
        tail = new DLNode();
        this.capacity = capacity;
        head.pre = null;
        head.post = tail;
        tail.pre = head;
        tail.post = null;
        map = new HashMap<>();
        count = 0;
    }

    public int get( int key ) {
        if ( map.get( key ) != null ) {
            DLNode curr = map.get( key );
            int val = curr.value;
            remove( curr );
            insert( curr );
            return val;
        }
        return -1;
    }

    public void put( int key, int value ) {
        if ( map.get( key ) != null ) {
            DLNode curr = map.get( key );
            curr.value = value;
            remove( curr );
            insert( curr );
        } else {
            DLNode curr = new DLNode( key, value );
            insert( curr );
            map.put( key, curr );
            count++;
            while ( count > capacity ) {
                map.remove( tail.pre.key );
                remove( tail.pre );
                count--;
            }
        }
    }

    public void insert( DLNode curr ) {
        curr.pre = head;
        curr.post = head.post;
        head.post.pre = curr;
        head.post = curr;
    }

    public void remove( DLNode curr ) {
        curr.pre.post = curr.post;
        curr.post.pre = curr.pre;
    }


}

class DLNode {
    DLNode pre;
    DLNode post;
    int key;
    int value;

    public DLNode( int key, int value ) {
        this.key = key;
        this.value = value;
    }

    public DLNode() {

    }
}
