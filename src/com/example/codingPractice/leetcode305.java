package com.example.codingPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode305 {
    static int[][] dir = { { 1, 0 }, { 0, 1 }, { -1, 0 }, { 0, -1 } };

    public static List<Integer> numIslands2( int m, int n, int[][] positions ) {
        List<Integer> res = new ArrayList<>();
        int[] root = new int[m * n];
        Arrays.fill( root, -1 );
        int count = 0;

        for ( int[] addLand : positions ) {
            int rt = addLand[0] * n + addLand[1];
            root[rt] = rt;
            count++;
            for ( int[] d : dir ) {
                int a = d[0] + addLand[0];
                int b = d[1] + addLand[1];
                int index = a * n + b;
                if ( a < 0 || b < 0 || a >= m || b >= n || root[index] == -1) continue;

                int rootCurr = findRoot( root, index );
                if ( rt != rootCurr ) {
                    root[rt] = rootCurr;
                    rt = rootCurr;
                    count--;
                }
            }
            res.add( count );
        }

        return res;

    }

    public static int findRoot( int[] root, int i ) {
        while ( root[i] != i ) i = root[i];
        return i;
    }

    public static void main( String[] args ) {
        int[][] pos = { { 0, 0 }, { 0, 1 }, { 1, 2 }, { 2, 1 } };
        for ( int i : numIslands2( 3, 3, pos ) ) {
            System.out.print( i );
        }
    }


}
