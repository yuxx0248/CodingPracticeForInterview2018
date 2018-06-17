package com.example.codingPractice;

import java.util.LinkedList;
import java.util.Random;

/**
 * Given two List, a list of objects and a list of weight of the object. The index in both list matches
 * <p>
 * Create a method which returns a random object with a percentage base on their weight
 */
public class randomWeightedTwoLists {
    public static void main( String[] args ) {
        LinkedList<color> objList = createObjList();
        LinkedList<Integer> weightList = createWeightList();
        LinkedList<color> randomList = mapRandomList( objList, weightList );
        Random randomRange = new Random();
        int randomPoint = randomRange.nextInt( randomList.size() );

        System.out.println( randomList.get( randomPoint ).getColor() );

    }

    public static LinkedList<color> mapRandomList( LinkedList<color> objs, LinkedList<Integer> weight ) {
        LinkedList<color> newListMap = new LinkedList<>();
        int count = 0;

        for ( int i = 0; i < objs.size(); i++ ) {
            count = weight.get( i );
            while ( count > 0 ) {
                newListMap.add( objs.get( i ) );
                count--;
            }
        }

        return newListMap;
    }

    /**
     * Create a testing object list
     */
    public static LinkedList<color> createObjList() {
        LinkedList<color> list = new LinkedList<>();
        list.add( new color( "red" ) );
        list.add( new color( "blue" ) );
        list.add( new color( "yellow" ) );
        list.add( new color( "orange" ) );
        list.add( new color( "black" ) );

        return list;
    }

    /**
     * Create a testing weight list
     * red      :         3
     * blue     :         1
     * yellow   :         2
     * orange   :         1
     * black    :         4
     */
    public static LinkedList<Integer> createWeightList() {
        LinkedList<Integer> list = new LinkedList<>();
        list.add( 3 );
        list.add( 1 );
        list.add( 2 );
        list.add( 1 );
        list.add( 4 );

        return list;
    }


    public static class color {
        private String color;

        public color( String col ) {
            color = col;
        }

        public String getColor() {
            return color;
        }
    }

}


