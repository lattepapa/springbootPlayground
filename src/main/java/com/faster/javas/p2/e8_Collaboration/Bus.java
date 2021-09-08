package com.faster.javas.p2.e8_Collaboration;

public class Bus {
    int busNumber;
    int passengerCount;
    int fare;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int fare) {
        this.fare += fare;
        passengerCount++;
    }

    public void showBusInfo() {
        System.out.println(busNumber + "번 버스의 승객수는 " + passengerCount + "명, 수입은 " + fare + "원 입니다");
    }
}
