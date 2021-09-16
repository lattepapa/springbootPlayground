package com.fast.driller.p2.wrapup3;

public class Car {
    // 갱신기준번호는 클래스변수일 것
    private static int serialNum = 10000;

    // 차대번호 속성
    public int carNum;

    // 인스턴스가 생성될 때마다 차대번호는 기준번호가 갱신된 것일 것
    public Car() {
        serialNum++;
        carNum = serialNum;
    }

    // Getter & Setter
    public int getCarNum() {
        return carNum;
    }
}