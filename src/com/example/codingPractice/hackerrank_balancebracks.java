package com.example.codingPractice;

import java.util.Scanner;
import java.util.Stack;

public class hackerrank_balancebracks {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] exp = new String[t];

        for (int tItr = 0; tItr < t; tItr++) {
            String expression = scanner.nextLine();
            exp[tItr] = expression;
        }

        for (String s : exp) {
            if (ifBalance(s)) System.out.println("YES");
            else System.out.println("NO");
        }

        scanner.close();


    }

    public static boolean ifBalance(String str){
        Stack<Character> stack = new Stack<>();

        for (char c : str.toCharArray()){
            if (c == '(') stack.push(')');
            else if (c == '{') stack.push('}');
            else if (c == '[') stack.push(']');
            else if (stack.isEmpty() || stack.pop()!=c) return false;
        }

        return stack.isEmpty();
    }

}
