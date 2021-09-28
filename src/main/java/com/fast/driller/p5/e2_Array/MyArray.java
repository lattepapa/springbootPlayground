package com.fast.driller.p5.e2_Array;

public class MyArray {
    int[] intArr;
    int count;

    public int ARRAY_SIZE;
    public static final int ERROR_NUM = -999999999;

    public MyArray() {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    // 1. 배열생성 메서드
    public MyArray(int size) {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    // 2. 항목추가 메서드
    public void addElement(int num) {
        if(count >= ARRAY_SIZE) {
            System.out.println("Not Enough Memory");
            return;
        }
        intArr[count++] = num;
    }

    // 3. 특정인덱스(position)에 항목삽입 메서드
    public void insertElement(int position, int num) {
        int i;
        if(position < 0 || position > count) {
            System.out.println("Scope Over");
            return;
        }
        if(count >= ARRAY_SIZE) {
            System.out.println("Array Length Error");
            return;
        }

        // 앞에서부터 항목을 이동시키면 뒤의 항목에 대한 메모리 오버헤드가 발생하므로 뒤에서부터 이동시킨다
        for(i = count - 1; i >= position; i--) {
            intArr[i+1] = intArr[i];
        }
        intArr[position] = num;
        count++;
    }

    // 4. 특정인덱스(position)의 항목제거 메서드
    public int removeElement(int position) {
        int ret = ERROR_NUM;
        if(isEmpty()) {
            System.out.println("Array is Empty");
            return ret;
        }
        if(position < 0 || position > count - 1) {
            return ret;
        }

        // 삽입의 경우와 정반대로, 빠진 항목의 위치에 대해 앞에서부터 항목을 이동시킨다
        ret = intArr[position];
        for(int i = position; i < count - 1; i++) {
            intArr[i] = intArr[i+1];
        }
        count--;
        return ret;
    }

    // 5. 배열크기 확인 메서드
    public int getSize() {
        return count;
    }

    // 6. 빈배열 확인 메서드
    public boolean isEmpty() {
        return true;
    }
}
