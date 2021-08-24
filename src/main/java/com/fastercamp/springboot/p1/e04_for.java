package com.fastercamp.springboot.p1;

public class e04_for {

    public static void main(String[] args) {

        // O(n)인 반복문
        int sum = 0;
        for(int i = 0, count = 1; i < 10; i++, count++) {
            sum += count;
        }
        System.out.println("for문의 결과 = " + sum);

        // for문으로 구현한 O(n^2)인 반복문
        int dan = 2;
        int count = 1;
        for(; dan <= 9; dan++) {
            for(count = 1; count <= 9; count++) {
                System.out.println(dan + " X " + count + " = " + dan * count);
            }
            System.out.println();
        }

        // while문으로 구현한 O(n^2)인 반복문
        dan = 10;
        while(dan <= 19) {
            count = 1;
            while(count <= 9) {
                System.out.println(dan + " X " + count + " = " + dan * count);
                count++;
            }
            dan++;
            System.out.println();
        }
    }
}
