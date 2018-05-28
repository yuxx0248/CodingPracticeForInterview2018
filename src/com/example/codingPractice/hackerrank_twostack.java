package com.example.codingPractice;

import java.util.Scanner;
import java.util.Stack;

public class hackerrank_twostack {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }
        scan.close();
    }

    public static class MyQueue<T> {
        Stack<Integer> s1;
        Stack<Integer> s2;

        public MyQueue(){
            this.s1 = new Stack<>();
            this.s2 = new Stack<>();
        }

        public void enqueue(int i){
            s1.push(i);
        }

        public void dequeue(){
            if (s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            s2.pop();
        }

        public int peek(){
            if (s2.isEmpty()){
                while(!s1.isEmpty()){
                    s2.push(s1.pop());
                }
            }
            return s2.peek();
        }

    }


}
