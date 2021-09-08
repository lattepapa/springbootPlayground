package com.faster.javas.p2.e8_Collaboration;

public class Student {
    // 속성
    String studentName;
    int money;

    // 매개변수를 활용한 생성자
    public Student(String studentName, int money) {
        this.studentName = studentName;
        this.money = money;
    }

    // 메서드
    // Bus와 Subway의 인스턴스들을 매개변수로 하여, 각각이 제공하는 메서드로 collaboration 한다
    public void takeBus(Bus bus) {
        bus.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subway) {
        subway.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(studentName + "님의 잔액은 " + money + "원 입니다");
    }
}
