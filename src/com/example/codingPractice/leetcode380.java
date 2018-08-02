package com.example.codingPractice;

import java.util.*;

public class leetcode380 {
    static List<Integer> list;
    static Map<Integer, Integer> map;
    static Random random;

    public leetcode380() {
        list = new ArrayList<>();
        random = new Random();
        map = new HashMap<>();
    }

    /**
     * Inserts a value to the set. Returns true if the set did not already contain the specified element.
     */
    public boolean insert( int val ) {
        if ( !map.containsKey( val ) ) {
            int index = map.size();
            map.put( val, index );
            list.add( index, val );

            return true;
        }

        return false;
    }

    /**
     * Removes a value from the set. Returns true if the set contained the specified element.
     */
    public boolean remove( int val ) {
        if ( list.contains( val ) ) {
            int index = map.get( val );
            map.put( list.get( list.size() - 1 ), map.get( val ) );
            list.set( index, list.get( list.size() - 1 ) );

            list.remove( list.size() - 1 );
            map.remove( val );

            return true;
        }
        return false;
    }

    /**
     * Get a random element from the set.
     */
    public int getRandom() {
        int i = list.get( random.nextInt( list.size() ) );
        return i;

    }

    public static void main( String[] args ) {
        leetcode380 obj = new leetcode380();

        System.out.println( obj.insert( 1 ) );
        System.out.println( obj.remove( 2 ) );
        System.out.println( obj.insert( 2 ) );
        System.out.println( obj.getRandom() );
        System.out.println( obj.remove( 1 ) );
        System.out.println( obj.insert( 2 ) );
        System.out.println( obj.getRandom() );
    }

}
