package com.fast.driller.p2.wrapup2;

public class TransportationTest {
    public static void main(String[] args) {
        Student james = new Student("James", 5000);
        Student tomas = new Student("Tomas", 10000);
        Student edward = new Student("Edward", 20000);

        Bus num602 = new Bus("602");
        Subway line9 = new Subway("9");
        Taxi goWell = new Taxi("잘나간다");

        james.getBus(num602);
        tomas.getSubway(line9);
        edward.getTaxi(goWell);

        james.showInfo();
        tomas.showInfo();
        edward.showInfo();

        num602.busInfo();
        line9.subwayInfo();
        goWell.taxiInfo();
    }
}
