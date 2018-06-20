package com.example.codingPractice;

public class basicTrieNode {

    basicTrieNode[] link;
    boolean isWord;
    int times;

    public basicTrieNode() {
        link = new basicTrieNode[ 26 ];
        times = 0;
    }

    public void set( char c, basicTrieNode node ) {
        link[ c - 'a' ] = node;
    }

    public basicTrieNode getLink( char c ) {
        return link[ c - 'a' ];
    }

    /**
     * Additional method for Leetcode 642
     *
     * @param i
     */
    public void setTimes( int i ) {
        times = i;
    }

}
