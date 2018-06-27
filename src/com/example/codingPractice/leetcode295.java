package com.example.codingPractice;

import java.util.Collections;
import java.util.PriorityQueue;

public class leetcode295 {
    PriorityQueue<Integer> smaller;
    PriorityQueue<Integer> larger;

    public leetcode295() {
        smaller = new PriorityQueue<>( Collections.reverseOrder() );
        larger = new PriorityQueue<>(  );
    }

    public void addNum(int num) {
        smaller.add( num );
        larger.add( smaller.poll() );
        if ( smaller.size() < larger.size()) smaller.add( larger.poll() );
    }

    public double findMedian() {
        if ( (smaller.size()+larger.size())%2 == 0)
            return (smaller.peek()+larger.peek())/2.0;
        else return smaller.peek()*1.0;
    }

    public static void main( String[] args ) {
        leetcode295 dummy = new leetcode295();
        dummy.addNum( 1 );
        dummy.addNum( 2 );
        dummy.addNum( 3 );
        dummy.addNum( 3 );

        System.out.println( dummy.findMedian() );
    }

}
