package com.example.codingPractice;

import java.util.List;

public class leetcode648 {

    static class trieNode {
        trieNode[] next;
        String word;

        public trieNode (){
            next = new trieNode[26];
        }
    }

    static class trie {
        trieNode root;

        public trie (){
            root = new trieNode();
        }

        public void insert (String s){
            trieNode curr = root;
            for ( char c : s.toCharArray()){
                if ( curr.next[c-'a'] == null){
                    curr.next[c-'a'] = new trieNode();
                }
                curr = curr.next[c-'a'];
            }
            curr.word = s;
        }

        public String ifPrefix (String s){
            trieNode curr = root;
            for ( char c : s.toCharArray()){
                if ( curr.word != null) return curr.word;
                if ( curr.next[c-'a'] == null ) return s;
                curr = curr.next[c-'a'];
            }

            return s;
        }
    }

    public static String replaceWords( List<String> dict, String sentence) {
        trie root = new trie();

        for ( String s : dict){
            root.insert( s );
        }

        StringBuilder sb = new StringBuilder(  );
        for ( String s : sentence.split( " " )){
            sb.append( root.ifPrefix( s ) ).append( " " );
        }

        return sb.toString().trim();
    }

    public static void main (String[] args){
        trie root = new trie();
        root.insert( "cat" );

        System.out.println( root.ifPrefix( "cattle" ) );
    }

}
