package com.faster.javas.p2.e6_AccessModifier_InformationHiding;

public class BirthdayTest {
    public static void main(String[] args) {
        Birthday date = new Birthday();
        date.setYear(2021);
        date.setMonth(13);
        date.setDay(30);
        date.showDate();
    }
}
