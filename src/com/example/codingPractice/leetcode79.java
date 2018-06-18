package com.example.codingPractice;

public class leetcode79 {

    public boolean exist( char[][] board, String word ) {
        char[] words = word.toCharArray();
        boolean[][] visited = new boolean[ board.length ][ board[ 0 ].length ];
        for ( int i = 0; i < board.length; i++ ) {
            for ( int j = 0; j < board[ 0 ].length; j++ ) {
                if ( board[ i ][ j ] == words[ 0 ] ) {
                    if ( helper( i, j, board, words, 0, visited ) ) return true;
                }
            }
        }

        return false;
    }

    public boolean helper( int i, int j, char[][] board, char[] word, int count, boolean[][] visited ) {
        if ( count == word.length ) return true;
        if ( count >= word.length || i < 0 || i > board.length - 1 || j < 0 || j > board[ 0 ].length - 1 || board[ i ][ j ] != word[ count ] )
            return false;
        if ( visited[ i ][ j ] ) return false;
        visited[ i ][ j ] = true;

        if ( helper( i - 1, j, board, word, count + 1, visited )
                || helper( i + 1, j, board, word, count + 1, visited )
                || helper( i, j - 1, board, word, count + 1, visited )
                || helper( i, j + 1, board, word, count + 1, visited ) ) {
            return true;
        } else {
            visited[ i ][ j ] = false;
            return false;
        }
    }

}
