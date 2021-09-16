package com.fast.driller.p2.e8_Collaboration;

public class Subway {
    int subwayNumber;
    int passengerCount;
    int fare;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int fare) {
        this.fare += fare;
        passengerCount++;
    }

    public void showSubwayInfo() {
        System.out.println("지하철 " + subwayNumber + "호선의 승객수는 " + passengerCount + "명, 수입은 " + fare + "원 입니다");
    }
}
