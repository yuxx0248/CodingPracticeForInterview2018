package com.example.codingPractice;

import java.util.*;

public class leetcode381 {
    static List<Integer> list;
    static Map<Integer, List<Integer>> map;
    static Set<Integer> set;
    static Random random;

    public leetcode381() {
        list = new ArrayList<>();
        random = new Random();
        map = new HashMap<>();
        set = new HashSet<>();
    }

    /**
     * Inserts a value to the collection. Returns true if the collection did not already contain the specified element.
     */
    public boolean insert( int val ) {
        int index = list.size();
        if ( !set.contains( val ) ) {
            set.add( val );
            map.put( val, new ArrayList<>() );
            map.get( val ).add( index );
            list.add( index, val );
            return true;
        } else {
            list.add( index, val );
            List<Integer> tmp = map.get( val );
            tmp.add( index );
            Collections.sort( tmp );
            map.put( val, tmp );
            return false;
        }
    }

    /**
     * Removes a value from the collection. Returns true if the collection contained the specified element.
     */
    public boolean remove( int val ) {
        if ( set.contains( val ) ) {
            int index = map.get( val ).remove( 0 );
            if ( map.get( val ).size() < 1 ) {
                if ( map.size() > 1) {
                    List<Integer> tmp = map.get( list.get( list.size() - 1 ) );
                    Collections.sort( tmp );
                    tmp.remove( tmp.size() - 1 );
                    tmp.add( 0, index );
                    map.put( list.get( list.size()-1 ), tmp );
                }
                map.remove( val );
                set.remove( val );
            }
            if (list.size()>1) {
                list.set( index, list.get( list.size() - 1 ) );
            }
            list.remove( list.size()-1 );
            return true;
        } else
            return false;
    }

    /**
     * Get a random element from the collection.
     */
    public int getRandom() {
        int i = list.get( random.nextInt( list.size() ) );
        return i;
    }

    public static void main( String[] args ) {
        leetcode381 obj = new leetcode381();

        System.out.println( obj.insert( 4 ) );
        System.out.println( obj.insert( 3 ) );
        System.out.println( obj.insert( 4 ) );
        System.out.println( obj.insert( 2 ) );
        System.out.println( obj.insert( 4 ) );
        System.out.println( obj.remove( 4 ) );
        System.out.println( obj.remove( 3 ) );
        System.out.println( obj.remove( 4 ) );
        System.out.println( obj.remove( 4 ) );

        System.out.println( obj.getRandom() );
    }

}
