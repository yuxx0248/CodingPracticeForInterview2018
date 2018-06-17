package com.example.codingPractice;

import java.util.List;

public class leetcode339 {

    public interface NestedInteger {

        public boolean isInteger();

        public int getInteger();

        public List<NestedInteger> getList();
    }

    public int depthSum( List<NestedInteger> nestedList ) {

        return helper( nestedList, 1 );
    }

    public int helper( List<NestedInteger> list, int depth ) {
        int sum = 0;
        for ( NestedInteger n : list ) {
            if ( n.isInteger() ) {
                sum += depth * n.getInteger();
            } else {
                sum += helper( n.getList(), depth + 1 );
            }
        }

        return sum;
    }


}
