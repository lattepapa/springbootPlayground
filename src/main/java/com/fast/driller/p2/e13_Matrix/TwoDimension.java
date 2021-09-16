package com.fast.driller.p2.e13_Matrix;

public class TwoDimension {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {1,2,3,4}};
        int i, j;
        for(i = 0; i < arr.length; i++) {
            for(j = 0; j < arr.length; j++) {
                System.out.println(arr[i][j] + ", ");
            }
            System.out.println("\t" + arr[i].length);
        }
    }
}

// 다차원 배열 : 이차원 이상으로 구현된 배열
//              -> int[][] arr = new int[rowLength][colLength];
