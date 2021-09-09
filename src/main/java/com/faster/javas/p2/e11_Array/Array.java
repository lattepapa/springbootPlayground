package com.faster.javas.p2.e11_Array;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int sum = 0;

        // 배열 arr에 1부터 10까지 차례대로 엘리먼트 넣기
        // 이는 사실 처음부터 int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10} 으로 초기화한 것과 동일하다.
        for(int i = 0, num = 1; i < arr.length; i++) {
            arr[i] = num++;
        }

        // 배열 arr의 엘리먼트들을 차례대로 더하기
        // 배열에 대한 for 반복문에서 :은 in과 동일하다
        for(int num : arr) {
            sum += num;
        }

        System.out.println(sum);
    }
}

// 배열(array) : 동일한 자료형이 순차적으로 집합한 자료구조
//          (1) 인덱스 연산자 []를 통해 빠른 참조 가능
//          (2) 논리적 위치(A 다음에 B가 있다) = 물리적 위치(00x01 다음에 00x02)
//          (3) 객체 배열을 구현한 ArrayList를 많이 활용함
//          (4) 반드시 배열의 길이와 엘리먼트의 개수가 동일한 것은 아님
//              -> 이 경우, 각 엘리먼트에 대한 count++ 변수를 운용하는 것이 도움이 된다!

// 배열 선언
//          int[] arr1 = new int[3];
//          int arr1[] = new int[3];
// -> [4byte][4byte][4byte] (총 12byte)

// 배열 초기화
//          int[] numbers = new int[] {10, 20, 30};
//          int[] numbers = {10, 20, 30};
