package com.example.codingPractice;


public class removeMe {

    public static int countPrimes(int n) {
        boolean[] prime = new boolean[n];

        int k;
        int count =0;
        for (k = 2;k<n;k++){
            if (prime[k] == false) count ++;
            for (int j=1; j*k<n;j++){
                prime[j*k] = true;
            }
        }

        return count;
    }
}
