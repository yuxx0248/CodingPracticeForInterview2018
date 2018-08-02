package com.example.codingPractice;

import java.awt.*;
import java.util.LinkedList;

public class leetcode353 {

    int width;
    int height;
    int[][] food;
    int count;
    LinkedList<position> q;
    Point curr;

    /**
     * Initialize your data structure here.
     *
     * @param width  - screen width
     * @param height - screen height
     * @param food   - A list of food positions
     *               E.g food = [[1,1], [1,0]] means the first food is positioned at [1,1], the second is at [1,0].
     */
    public leetcode353( int width, int height, int[][] food ) {
        this.width = width;
        this.height = height;
        this.food = food;
        count = 0;
        q = new LinkedList<>();
        q.add( new position( 0, 0 ) );
    }

    /**
     * Moves the snake.
     *
     * @param direction - 'U' = Up, 'L' = Left, 'R' = Right, 'D' = Down
     * @return The game's score after the move. Return -1 if game over.
     * Game over when snake crosses the screen boundary or bites its body.
     */
    public int move( String direction ) {

        position curr = new position( q.getFirst().x, q.getFirst().y );
        switch ( direction ) {
            case "U":
                curr.x--;
                break;
            case "L":
                curr.y--;
                break;
            case "R":
                curr.y++;
                break;
            case "D":
                curr.x++;
                break;
        }
        if ( curr.x >= height || curr.y >= width || curr.x < 0 || curr.y < 0 ) return -1;

        for ( int i = 1; i < q.size()-1; i++ ) {
            if ( curr.isEqual( q.get( i ) ) ) return -1;
        }
        q.addFirst( curr );

        if ( count < food.length ) {
            position f = new position( food[count][0], food[count][1] );
            if ( f.isEqual( curr ) ) count++;
        }

        while ( q.size() > count + 1 ) q.removeLast();

        return count;
    }

    class position {
        int x;
        int y;

        public position( int x, int y ) {
            this.x = x;
            this.y = y;
        }

        public boolean isEqual( position a ) {
            return x == a.x && y == a.y;
        }
    }


    public static void main ( String[] args){
        int[][] food = {{2,0},{0,0},{0,2},{2,2}};
        leetcode353 main = new leetcode353( 3, 3, food );
        main.move( "D" );
        main.move( "D" );
        main.move( "R" );
        main.move( "U" );
        main.move( "U" );
        main.move( "L" );
        main.move( "D" );
        main.move( "R" );
        main.move( "R" );
        main.move( "U" );
        main.move( "L" );
        main.move( "D" );


    }
}
