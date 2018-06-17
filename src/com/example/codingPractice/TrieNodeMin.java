package com.example.codingPractice;

class TrieNodeMin {


    class TrieMinNode {
        private TrieMinNode[] links;
        char val;

        boolean isEnd;

        public TrieMinNode() {
            links = new TrieMinNode[ 26 ];
        }

        public TrieMinNode( char c ) {
            TrieMinNode node = new TrieMinNode();
            node.val = c;
        }
    }

    class Trie {
        TrieMinNode root;

        /**
         * Initialize your data structure here.
         */
        public Trie() {
            root = new TrieMinNode();
        }

        /**
         * Inserts a word into the trie.
         */
        public void insert( String word ) {
            for ( char c : word.toCharArray() ) {
                if ( root.links[ c - 'a' ] == null ) {
                    root.links[ c - 'a' ] = new TrieMinNode( c );
                }
                root = root.links[ c - 'a' ];
            }
            root.isEnd = true;
        }

        /**
         * Returns if the word is in the trie.
         */
        public boolean search( String word ) {
            for ( char c : word.toCharArray() ) {
                if ( root.links[ c - 'a' ] == null ) return false;
                root = root.links[ c - 'a' ];
            }
            return root.isEnd;
        }

        /**
         * Returns if there is any word in the trie that starts with the given prefix.
         */
        public boolean startsWith( String prefix ) {
            for ( char c : prefix.toCharArray() ) {
                if ( root.links[ c - 'a' ] == null ) return false;
                root = root.links[ c - 'a' ];
            }

            return true;
        }
    }
}

