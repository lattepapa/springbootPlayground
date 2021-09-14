package com.faster.javas.p2.e2_Stack_Method_Instance_Heap;

public class FunctionTest {
    // 1. int형 결과값을 반환하는 함수
    public static int addNum(int num1, int num2) {
        return num1 + num2;
    }

    // 2. 반환 자료형이 따로 없는 함수
    public static void sayHello(String greeting) {
        System.out.println(greeting);
    }

    // 3. 매개변수가 없고 int형 결과값을 반환하는 함수
    public static int calcSum() {
        int sum = 0;
        for(int i = 0; i < 100; i++) {
            sum += i;
        }
        return sum;
    }

    // 4. Main 함수
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        int total = addNum(n1, n2);
        System.out.println(total);

        sayHello("안녕하세요");

        total = calcSum();
        System.out.println(total);
    }
}
