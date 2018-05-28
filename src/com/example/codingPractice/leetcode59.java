package com.example.codingPractice;

/**
 * Given a positive integer n, generate a square matrix filled with elements from 1 to n2 in spiral order.
 *
 * Input: 3
 * Output:
 * [
 *  [ 1, 2, 3 ],
 *  [ 8, 9, 4 ],
 *  [ 7, 6, 5 ]
 * ]
 */


public class leetcode59 {
    public static void main(String[] args){
        int[][] res = generateMatrix(3);

        for (int[] arr : res){
            for (int i : arr){
                System.out.print(i);
            }
            System.out.println();
        }
    }

    public static int[][] generateMatrix(int n) {
        int[][] res = new int[n][n];
        int m0 = 0;
        int n0 = 0;
        int m1 = n - 1;
        int n1 = n - 1;
        int num = 1;

        while (m0 <= m1 && n0 <= n1){
            for (int i = n0; i<n1; i++) res[m0][i] = num++;
            for (int i = m0; i<=m1; i++) res[i][n1] = num++;
            for (int i = n1-1; i > n0; i--) res[m1][i] = num++;
            for (int i = m1; i > m0; i--) res[i][n0] = num++;

            m0++;
            n0++;
            m1--;
            n1--;
        }
        return res;
    }


}
