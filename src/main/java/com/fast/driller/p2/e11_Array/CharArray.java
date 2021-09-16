package com.fast.driller.p2.e11_Array;

public class CharArray {
    public static void main(String[] args) {
        char[] alphabets1 = new char[26];
        char[] alphabets2 = new char[26];
        char ch1 = 'a';
        char ch2 = 'A';

        // 소문자와 대문자마다 각각 차례대로 alphabets1, 2 배열에 엘리먼트로 담는다
        for(int i = 0; i < alphabets2.length; i++) {
            alphabets1[i] = ch1++;
            alphabets2[i] = ch2++;
        }

        // 소문자와 그 값
        for(char letter : alphabets1) {
            System.out.println(letter + ", " + (int)letter);
        }

        // 대문자와 그 값
        for(char capital : alphabets2) {
            System.out.println(capital + ", " + (int)capital);
        }
    }
}
