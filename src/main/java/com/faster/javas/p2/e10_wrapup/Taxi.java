package com.faster.javas.p2.e10_wrapup;

public class Taxi {
    // 속성
    public String taxiCo;
    public int fare;
    public int amount;

    // 매개변수를 활용한 생성자
    public Taxi(String taxiCo) {
        this.taxiCo = taxiCo;
        this.fare = 10000;
        this.amount = 0;
    }

    // 메서드
    public void taxiInfo() {
        System.out.println(taxiCo + " 운수의 잔고는 " + amount + "원");
    }
}
