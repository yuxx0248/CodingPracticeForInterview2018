package com.example.codingPractice;

public class leetcode73 {
    /**
            1 1 1 1            1 0 1 0          1 0 1 0
            1 0 1 1    ->      0 0 1 1    ->    0 0 0 0
            1 1 1 0            0 1 1 0          0 0 0 0
            1 1 1 1            1 1 1 1          1 0 1 0
     */
    public static void main( String[] args){
        int[][] matrix = new int[4][3];

    }

    public void setZeroes(int[][] matrix) {
        for ( int i = 1; i < matrix.length; i++){
            for (int j = 1; j < matrix[0].length; j++){
                if (matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for ( int i = 1; i < matrix.length;i++){
            if (matrix[i][0] == 0){
                for (int j = 1; j<matrix[0].length; j++){
                    matrix[i][j] = 0;
                }
            }
        }

        for ( int j = 1; j < matrix[0].length;j++){
            if (matrix[0][j] == 0){
                for (int i = 1; i<matrix.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }

        if (matrix[0][0] == 0){
            for (int i = 0; i<matrix.length;i++){
                matrix[i][0] = 0;
            }
            for (int j = 0; j<matrix[0].length;j++){
                matrix[0][j] = 0;
            }
        }
    }
}
