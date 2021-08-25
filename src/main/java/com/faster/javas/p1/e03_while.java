package com.faster.javas.p1;

import java.util.Scanner;

public class e03_while {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // while문은 조건을 먼저 체크하고 반복 수행
        int input;
        int sum = 0;
        input = scanner.nextInt();

        while(input != 0) {
            sum += input;
            input = scanner.nextInt();
        }

        System.out.println("while문을 끝낸 num = " + input);
        System.out.println("while문의 결과 = " + sum);

        // do-while문은 조건과 상관없이 일단 수행을 먼저 1번하고 나서 조건을 체크
        int input2;
        int sum2 = 0;
        input2 = scanner.nextInt();
        do {
            sum2 += input2;
            input2 = scanner.nextInt();
        } while(input2 != 0);

        System.out.println("do while문을 끝낸 num = " + input2);
        System.out.println("do while문의 결과 = " + sum2);
    }
}
