package com.example.codingPractice;

import java.util.Hashtable;
import java.util.Scanner;

public class hackerrank_ransom {


        private static final Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            String[] mn = scanner.nextLine().split(" ");

            int m = Integer.parseInt(mn[0]);

            int n = Integer.parseInt(mn[1]);

            String[] magazine = new String[m];

            String[] magazineItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < m; i++) {
                String magazineItem = magazineItems[i];
                magazine[i] = magazineItem;
            }

            String[] ransom = new String[n];

            String[] ransomItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                String ransomItem = ransomItems[i];
                ransom[i] = ransomItem;
            }

            scanner.close();

            if (helper(m, n, magazine, ransom)) System.out.println("Yes");
            else System.out.println("No");
        }

        public static boolean helper(int m, int n, String[] mag, String[] ran){
            if (m<n) return false;
            Hashtable<String, Integer> table = new Hashtable<>();

            for (String s : mag){
                if(table.containsKey(s)) table.put(s, table.get(s)+1);
                else table.put(s, 1);
            }

            for (String s : ran){
                if(table.get(s) == null || table.get(s) <= 0) return false;
                table.put(s, table.get(s)-1);
            }

            return true;
        }


}
