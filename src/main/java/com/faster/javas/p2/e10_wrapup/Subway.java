package com.faster.javas.p2.e10_wrapup;

public class Subway {
    // 속성
    public String subwayNum;
    public int fare;
    public int amount;

    // 매개변수를 활용한 생성자
    public Subway(String subwayNum) {
        this.subwayNum = subwayNum;
        this.fare = 1200;
        this.amount = 0;
    }

    // 메서드
    public void subwayInfo() {
        System.out.println(subwayNum + "호선 지하철의 잔고는 " + amount + "원");
    }
}
