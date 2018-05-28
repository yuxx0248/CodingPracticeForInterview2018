package com.example.codingPractice;

import java.util.Iterator;

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html
public class leetcode284 implements Iterator<Integer> {

    Iterator<Integer> iterator;
    Integer next;
    public leetcode284(Iterator<Integer> iterator) {
        // initialize any member here.
        this.iterator = iterator;
        if (iterator.hasNext()) next = iterator.next();
    }

    // Returns the next element in the iteration without advancing the iterator.
    public Integer peek() {
      return next;
    }

    // hasNext() and next() should behave the same as in the Iterator interface.
    // Override them if needed.
    @Override
    public Integer next() {
        Integer res = next;
        next = iterator.hasNext()? iterator.next(): null;
        return res;
    }

    @Override
    public boolean hasNext() {
        return next != null;
    }
}