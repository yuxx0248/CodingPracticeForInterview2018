package com.example.codingPractice;

public class blackRock1 {

    public static void main (String[] args){
        String str = "abcd";
        str = encode(str);
        System.out.println(str);

        str = decode(str);
        System.out.println(str);

    }

    private static String encode(String text) {
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            b.append(c += c + i);
        }
        return b.reverse().toString();
    }

    private static String decode(String encodedMessage) {
        StringBuilder encode = new StringBuilder(encodedMessage);
        encode = encode.reverse();

        StringBuilder sb = new StringBuilder();
        for (int i=0;i<encodedMessage.length();i++){
            char c = encode.charAt(i);
            sb.append((char)((c-i)/2));
        }
        return sb.toString();
    }

}
