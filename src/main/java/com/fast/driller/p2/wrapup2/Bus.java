package com.fast.driller.p2.wrapup2;

public class Bus {
    // 속성
    public String busNum;
    public int fare;
    public int amount;

    // 매개변수를 활용한 생성자
    public Bus(String busNum) {
        this.busNum = busNum;
        this.fare = 1000;
        this.amount = 0;
    }

    // 메서드
    public void busInfo() {
        System.out.println(busNum + "번 버스회사의 잔고는 " + amount + "원");
    }
}
