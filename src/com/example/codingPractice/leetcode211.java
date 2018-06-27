package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Queue;

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
        for ( char c : word.toCharArray() ) {
            if ( c =='.' ){
                Queue<TrieNode> q = scan( curr );
                for ( TrieNode next : q){

                }
            }



            int count = c - 'a';
            if ( curr.next[ count ] == null ) return false;
            curr = curr.next[ count ];
        }
        return curr.isWord;
    }

    public Queue<TrieNode> scan ( TrieNode curr ){
        Queue<TrieNode> q = new LinkedList<>(  );
        for ( int i = 0; i<26;i++){
            if ( curr.next[i] != null) q.add(curr.next[i]);
        }
        return q;
    }

}
