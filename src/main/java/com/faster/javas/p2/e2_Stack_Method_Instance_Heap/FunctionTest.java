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

// 함수(function) : 함수의 반환 자료형, 함수의 이름, 매개변수, 그리고 몸체로 구성된다.
//      (1) int형 결과값을 반환하는 함수일 경우
//      public static int add(int num1, int num2) {     -> 지역변수 num1, 지역변수 num2
//          int result;                                 -> 지역변수 result
//          result = num1 + num2
//          return result;
//      }
//      (2) 반환 자료형이 따로 없는 함수일 경우 -> void 활용
//      public static void sayHello(String greeting) {
//          System.out.println(greeting);
//      }


// 스택(Stack) : 함수가 호출될 때 지역변수들이 사용하는 메모리로, 함수 수행이 끝나면 자동으로 반환된다.
// 메모리 생성순서와 스택
//      (4) add 함수 수행 후 해당 메모리 자동해제
//      (3) add 함수가 사용할 메모리 공간이 스택에 생성됨
//      (2) main 함수에서 add 함수를 호출함
//      (1) main 함수가 사용할 메모리 공간이 스택에 생성됨


// 메서드(method) : 객체의 기능을 구현하기 위해 클래스 내부에 구현된 함수 -> C++에서는 멤버함수(member function)라고 부른다.