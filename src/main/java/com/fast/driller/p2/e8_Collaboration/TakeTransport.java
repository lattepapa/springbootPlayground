package com.fast.driller.p2.e8_Collaboration;

public class TakeTransport {
    public static void main(String[] args) {
        Student studentJ = new Student("James", 5000);
        Student studentT = new Student("Tomas", 10000);

        Bus bus602 = new Bus(602);
        Bus bus606 = new Bus(606);
        studentJ.takeBus(bus602);

        Subway subwayGreen = new Subway(2);
        Subway subwayGold = new Subway(9);
        studentT.takeSubway(subwayGold);

        studentJ.showInfo(); // James님의 잔액은 4000원 입니다
        studentT.showInfo(); // Tomas님의 잔액은 8800원 입니다
        bus602.showBusInfo(); // 602번 버스의 승객수는 1명, 수입은 1000원 입니다
        subwayGold.showSubwayInfo(); // 지하철 9호선의 승객수는 1명, 수입은 1200원 입니다
    }
}
