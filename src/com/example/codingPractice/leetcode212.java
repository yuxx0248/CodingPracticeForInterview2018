package com.example.codingPractice;

import java.util.ArrayList;
import java.util.List;

public class leetcode212 {

    class TrieNode {
        TrieNode[] list = new TrieNode[ 26 ];
        String isWord;

        public TrieNode getLink( char c ) {
            return list[ c - 'a' ];
        }
    }

    public List<String> findWords( char[][] board, String[] words ) {
        List<String> res = new ArrayList<>();
        TrieNode root = buildTrieNode( words );
        for ( int i = 0; i < board.length; i++ ) {
            for ( int j = 0; j < board[ 0 ].length; j++ ) {
                DFS( board, i, j, root, res );
            }
        }
        return res;
    }

    public TrieNode buildTrieNode( String[] words ) {
        TrieNode root = new TrieNode();
        for ( String str : words ) {
            TrieNode tmp = root;
            for ( char c : str.toCharArray() ) {
                if ( tmp.getLink( c ) == null ) tmp.list[ c - 'a' ] = new TrieNode();
                tmp = tmp.getLink( c );
            }
            tmp.isWord = str;
        }
        return root;
    }

    public void DFS( char[][] board, int i, int j, TrieNode root, List<String> res ) {
        char c = board[ i ][ j ];
        if ( c == '$' || root.getLink( c ) == null )
            return;
        if ( root.getLink( c ).isWord != null ) {
            res.add( root.getLink( c ).isWord );
            root.getLink( c ).isWord = null;
        }

        board[ i ][ j ] = '$';
        if ( i > 0 ) DFS( board, i - 1, j, root.list[ c - 'a' ], res );
        if ( i < board.length - 1 ) DFS( board, i + 1, j, root.list[ c - 'a' ], res );
        if ( j > 0 ) DFS( board, i, j - 1, root.list[ c - 'a' ], res );
        if ( j < board[ 0 ].length - 1 ) DFS( board, i, j + 1, root.list[ c - 'a' ], res );

        board[ i ][ j ] = c;
    }

}
