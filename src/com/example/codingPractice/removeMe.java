package com.example.codingPractice;


import java.util.Stack;

public class removeMe {

    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<>();
        Stack<String> stringStack = new Stack<>();

        int count = 0;
        StringBuilder res = new StringBuilder();
        StringBuilder curr = new StringBuilder();

        for ( char c : s.toCharArray()){
            //numbers
            if ( c <= '9' && c >= '0'){
                count *= 10;
                count += c - '0';
            }

            //[
            else if ( c == '[' ){
                numberStack.push(count);
                count = 0;
                stringStack.push(curr.toString());
                curr = new StringBuilder();
            }
            //]
            else if ( c == ']' ){
                int time = numberStack.pop();
                if (numberStack.size() < 1){
                    for (int i = 0; i< time;i++){
                        res.append(curr);
                    }
                }else{
                    StringBuilder tmp = new StringBuilder();

                    for (int i = 0; i<time;i++){
                        tmp.append(curr);
                    }
                    curr = new StringBuilder(stringStack.pop() + tmp.toString());
                }
            }
            //char
            else{
                if (numberStack.size() < 1){
                    res.append(c);
                }else{
                    curr.append(c);
                }
            }
        }
        return res.toString();
    }

    public static void main(String[] args){
        String s = "holyshit";
        int i = s.length();
        System.out.println(s.substring(1,s.length()));
    }


    /**
     public class BSTIterator {
     private final Stack<TreeNode> stack;

     public BSTIterator(TreeNode root) {
     stack = new Stack<>();
     TreeNode cur = root;
     while (cur != null) {
     stack.push(cur);
     cur = cur.left;
     }
     }
     /** @return whether we have a next smallest number
    public boolean hasNext() {
        return !stack.isEmpty();
    }

    /** @return the next smallest number
    public int next() {
        TreeNode node = stack.pop();

        // Traversal cur node's right branch
        TreeNode cur = node.right;
        while (cur != null){
            stack.push(cur);
            cur = cur.left;
        }

        return node.val;
    }
}
     */



}
