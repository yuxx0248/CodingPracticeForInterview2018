package com.example.codingPractice;

import java.util.Comparator;

class rewriteComparter {

    private class intervalComparator implements Comparator<Interval> {
        @Override
        public int compare( Interval o1, Interval o2 ) {
            return o1.start < o2.start ? -1 : o1.start == o2.start ? 0 : 1;
        }
    }


    private class Interval {
        int start;
        int end;

        Interval() {
            start = 0;
            end = 0;
        }

        Interval( int s, int e ) {
            start = s;
            end = e;
        }
    }
}
