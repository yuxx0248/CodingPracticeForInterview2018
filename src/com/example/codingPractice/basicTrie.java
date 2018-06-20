package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class basicTrie {

    basicTrieNode root;

    public basicTrie() {
        root = new basicTrieNode();
    }

    public void insert( String str ) {
        basicTrieNode curr = root;
        for ( char c : str.toCharArray() ) {
            if ( curr.getLink( c ) == null ) curr.set( c, new basicTrieNode() );
            curr = curr.link[ c - 'a' ];
        }
        curr.isWord = true;
    }

    public boolean search( String str ) {
        basicTrieNode curr = root;
        for ( char c : str.toCharArray() ) {
            if ( curr.getLink( c ) == null ) return false;
            curr = curr.link[ c - 'a' ];
        }
        return curr.isWord;
    }

    public boolean searchPrefix( String str ) {
        basicTrieNode curr = root;
        for ( char c : str.toCharArray() ) {
            if ( curr.getLink( c ) == null ) return false;
            curr = curr.link[ c - 'a' ];
        }
        return true;
    }

    /**
     * Additional method for Leetcode 642
     *
     * @param str
     * @return
     */
    public List<String> getPrefix( String str ) {
        return new ArrayList<>();
    }

    /**
     * Additional method for Leetcode 642
     *
     * @param str
     * @return
     */
    public void insertWithTime( String str, int time ) {
        basicTrieNode curr = root;
        for ( char c : str.toCharArray() ) {
            if ( curr.getLink( c ) == null ) curr.set( c, new basicTrieNode() );
            curr = curr.link[ c - 'a' ];
        }
        curr.isWord = true;
        curr.times = time;
    }

    public void updateTime( String str ) {
        basicTrieNode curr = root;
        for ( char c : str.toCharArray() ) {
            curr = curr.link[ c - 'a' ];
        }
        curr.times++;
    }

    public void getPrefixMatches( String prefix, List<String> res ) {
        basicTrieNode curr = root;
        for ( char c : prefix.toCharArray() ) {
            curr = curr.link[ c - 'a' ];
        }
        searchPoss( curr, res );
    }

    public void searchPoss( basicTrieNode curr, List<String> res ) {
        for ( char c = 'a'; c <= 'z'; c++ ) {
            if ( curr.getLink( c ) != null ) {
                if ( curr.isWord ) //res.add();
                    curr = curr.link[ c - 'a' ];
                searchPoss( curr, res );
            }
        }
    }

}
