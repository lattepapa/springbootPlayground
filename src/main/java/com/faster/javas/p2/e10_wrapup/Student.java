package com.faster.javas.p2.e10_wrapup;

public class Student {
    // 속성
    public String studentName;
    public int amount;
    public String rideThing;

    // 매개변수를 활용한 생성자
    public Student(String studentName, int amount) {
        this.studentName = studentName;
        this.amount = amount;
    }

    // 메서드
    public void getBus(Bus bus) {
        // 버스요금 지불 및 탈것 선정완료
        this.amount -= bus.fare;
        bus.amount += bus.fare;
        this.rideThing = bus.busNum;
    }

    public void getSubway(Subway subway) {
        // 지하철요금 지불 및 탈것 선정완료
        this.amount -= subway.fare;
        subway.amount += subway.fare;
        this.rideThing = subway.subwayNum;
    }

    public void getTaxi(Taxi taxi) {
        // 택시요금 지불 및 탈것 선정완료
        this.amount -= taxi.fare;
        taxi.amount += taxi.fare;
        this.rideThing = taxi.taxiCo;
    }

    public void showInfo() {
        System.out.println(studentName + " 학생: " + rideThing + " 타서 잔액은 " + amount + "원 남음");
    }
}
