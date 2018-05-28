package com.example.codingPractice;

public class mergeTwoSortedArray {
    public static void main(String[] args){
        int[] A = {1,4,6,8,0,0,0,0};
        int[] B = {2,3,6,9};
        merge(A, 4, B, 4);

        for (int i:A){
            System.out.print(i + " ");
        }
    }

    public static void merge(int A[], int m, int B[], int n) {
        int i=m-1;
        int j=n-1;
        int k = m+n-1;
        while(i >=0 && j>=0)  A[k--] = A[i] > B[j] ? A[i--] : B[j--];
        
        while(j>=0)
            A[k--] = B[j--];
    }
}
