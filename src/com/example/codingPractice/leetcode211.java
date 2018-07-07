package com.example.codingPractice;

public class leetcode211 {

    public class TrieNode {
        TrieNode[] next = new TrieNode[ 26 ];
        boolean isWord;
    }

    TrieNode root;

    /**
     * Initialize your data structure here.
     */
    public leetcode211() {
        root = new TrieNode();
    }

    /**
     * Adds a word into the data structure.
     */
    public void addWord( String word ) {
        TrieNode curr = root;
        for ( char c : word.toCharArray() ) {
            int count = c - 'a';
            if ( curr.next[ count ] == null ) curr.next[ count ] = new TrieNode();
            curr = curr.next[ count ];
        }
        curr.isWord = true;
    }

    /**
     * Returns if the word is in the data structure. A word could contain the dot character '.' to represent any one letter.
     */
    public boolean search( String word ) {
        TrieNode curr = root;
        return searchHelper( word.toCharArray(), curr, 0 );
    }

    public boolean searchHelper( char[] words, TrieNode curr, int level ) {
        if ( level == words.length ) return curr.isWord;
        else if ( words[ level ] == '.' ) {
            for ( int i = 0; i < 26; i++ ) {
                if ( curr.next[ i ] != null ) {
                    if ( searchHelper( words, curr.next[ i ], level + 1 ) ) return true;
                }
            }
        } else if ( curr.next[ words[ level ] - 'a' ] != null ) {
            return searchHelper( words, curr.next[ words[ level ] - 'a' ], level + 1 );
        }
        return false;
    }

    public static void main ( String[] args){
        leetcode211 instance = new leetcode211();
        instance.addWord( "bad" );
        instance.addWord( "dad" );
        instance.addWord( "mad" );
        System.out.println( instance.search( "bad" ));
    }

}
