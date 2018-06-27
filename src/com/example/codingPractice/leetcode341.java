package com.example.codingPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class leetcode341 {

    interface NestedInteger {
        public boolean isInteger();

        public Integer getInteger();

        public List<NestedInteger> getList();
    }

    class NestedIterator implements Iterator<Integer> {
        List<Integer> list;
        int count;

        public NestedIterator( List<NestedInteger> nestedList ) {
            list = new ArrayList<>();
            create( list, nestedList );
            count = 0;

        }

        @Override
        public Integer next() {
            return list.get( count++ );
        }

        @Override
        public boolean hasNext() {
            return count < list.size();
        }

        public void create( List<Integer> list, List<NestedInteger> nestedList ) {
            for ( NestedInteger nests : nestedList ) {
                if ( nests.isInteger() ) {
                    list.add( nests.getInteger() );
                } else {
                    create( list, nests.getList() );
                }
            }
        }
    }

}
