package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode155 {

    class MinStack {
        List<Integer> list;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            list = new ArrayList<>(  );
        }

        public void push( int x ) {
            list.add( x );
        }

        public void pop() {
            list.remove( list.size()-1 );
        }

        public int top() {
            return list.get( list.size()-1 );
        }

        public int getMin() {
            int min = Integer.MAX_VALUE;
            for ( int i : list){
                min = Math.min( min, i );
            }
            return min;
        }
    }

}
