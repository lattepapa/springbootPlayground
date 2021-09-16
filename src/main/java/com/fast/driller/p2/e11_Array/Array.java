package com.fast.driller.p2.e11_Array;

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
